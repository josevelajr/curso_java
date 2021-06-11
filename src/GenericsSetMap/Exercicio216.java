package GenericsSetMap;

import entities.Produto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio216 {

    public void exercicio216() {

        List<Produto2> list = new ArrayList<>();

        list.add(new Produto2("TV", 900.00));
        list.add(new Produto2("Notebook", 1200.00));
        list.add(new Produto2("Tablet", 450.00));

//        Collections.sort(list);

        for (Produto2 prodt2 : list) {

            System.out.println(prodt2);

        }
    }
}
