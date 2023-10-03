import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("aula online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.sort((o1,  o2) -> {
                if (o1.length() < o2.length())
                    return -1;
                if (o1.length() > o2.length())
                    return 1;
                return 0;
        });

        //palavras.sort((s1,s2)-> Integer.compare(s1.length(), s2.length()));

        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));


        System.out.println(palavras);

//        Comparator<String> comparador = new ComparadorPorTamanho();
//        Collections.sort(palavras, comparador);
//        System.out.println(palavras);
//
//
//        palavras.forEach(s -> System.out.println(s));

        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(s -> System.out.println(s));

        palavras.forEach(new Consumer<String>(){
            public void accept(String palavra) {
                System.out.println(palavra);
            }
        });

        palavras.forEach(palavra -> System.out.println(palavra));

        palavras.sort(Comparator.comparingInt(String::length));

        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));


    }
}

class ComparadorPorTamanho implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length())
            return -1;
        if (o1.length() > o2.length())
            return 1;
        return 0;
    }
}

