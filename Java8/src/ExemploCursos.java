import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(c -> c.getAlunos()));
        //cursos.forEach(c -> System.out.println(c.getNome()));
        cursos.stream()
                .filter(c->c.getAlunos() >=100)
                .forEach(curso -> System.out.println(curso.getNome()));

        int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println(sum);

        Stream<String> nomes = cursos.stream()
                .map(Curso::getNome);

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny().ifPresent(c-> System.out.println(c.getNome()));

        cursos = cursos.stream()
                .filter(c->c.getAlunos() >=100)
                .toList();

        Optional<Curso> first = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .findFirst();


        OptionalDouble average = cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average();

        System.out.println(average);

        List<Curso> stream = cursos.stream()
                .filter(c -> c.getAlunos() > 50).toList();


    }
}
