import entities.MeuComparador;
import entities.Produto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static int compararProdutos(Produto2 p1, Produto2 p2) {
        return p1.getValor().compareTo(p2.getValor());
    }


    public static void main(String[] args) {

        List<Produto2> list = new ArrayList<>();

        list.add(new Produto2("TV", 900.00));
        list.add(new Produto2("Notebook", 1200.00));
        list.add(new Produto2("Tablet", 450.00));

        list.sort(Main::compararProdutos);

        list.sort((p1, p2) -> p1.getValor().compareTo(p2.getValor()));

        for (Produto2 prodt2 : list) {

            System.out.println(prodt2);

        }


    }
}