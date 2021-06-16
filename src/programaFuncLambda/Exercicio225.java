package programaFuncLambda;

import entities.Produto2;
import services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Exercicio225 {

    public void exercicio225() {

        List<Produto2> list = new ArrayList<>();

        list.add(new Produto2("Tv", 900.00));
        list.add(new Produto2("Mouse", 50.00));
        list.add(new Produto2("Tablet", 350.50));
        list.add(new Produto2("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filtroSoma(list, p -> p.getNome().charAt(0) == 'T');
        double sum2 = ps.filtroSoma(list, p -> p.getValor() < 100.00);

        System.out.println("Soma = " + String.format("%.2f", sum2));


    }
}
