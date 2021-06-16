package services;

import entities.Produto2;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filtroSoma(List<Produto2> list, Predicate<Produto2> criterio) {
        double sum = 0.0;
        for (Produto2 p : list) {
            if (criterio.test(p)) {
                sum += p.getValor();
            }

        }
        return sum;
    }
}
