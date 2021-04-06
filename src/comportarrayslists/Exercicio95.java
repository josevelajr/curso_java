package comportarrayslists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio95 {

    public void exercicio95() {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marcos");

        System.out.println(list.size());

        for (String x : list) {

            System.out.println(x);

        }

        System.out.println("-------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(result);
        for (String x : result) {
            System.out.println(x);

        }

        System.out.println("-------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name2);


        System.out.println("-------------------------------");
        System.out.println("Index of: " + list.indexOf("Bob"));
        System.out.println("Index of: " + list.indexOf("João"));

        System.out.println("-------------------------------");

        list.remove("Anna");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {

            System.out.println(x);

        }

    }
}
