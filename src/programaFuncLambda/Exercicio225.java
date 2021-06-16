package programaFuncLambda;

import entities.Produto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Exercicio225 {

    public void exercicio225() {
        List<Produto2> list = new ArrayList<>();

        list.add(new Produto2("Tv", 900.00));
        list.add(new Produto2("Mouse", 900.00));
        list.add(new Produto2("Tablet", 350.50));
        list.add(new Produto2("HD Case", 350.50));


        //Interface - map só funciona para Stream
//        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //Referência method com metódo estático
//        List<String> names = list.stream().map(Produto2::staticUpperCaseName).collect(Collectors.toList());

        //Referência method com metódo não estático
//        List<String> names = list.stream().map(Produto2::nonUpperCaseName).collect(Collectors.toList());

        //Referência com expressão Lambda
//        Function<Produto2, String> func = p -> p.getNome().toUpperCase(Locale.ROOT);
//        List<String> names = list.stream().map(func).collect(Collectors.toList());

        //Referência com expressão Lambda inline
        List<String> names = list.stream().map(p -> p.getNome().toUpperCase(Locale.ROOT)).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}
