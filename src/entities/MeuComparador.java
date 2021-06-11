package entities;

import java.util.Comparator;
import java.util.Locale;

public class MeuComparador implements Comparator<Produto2> {


    @Override
    public int compare(Produto2 produto2_1, Produto2 produto2_2) {
        return produto2_1.getNome().toUpperCase(Locale.ROOT).compareTo(produto2_2.getNome().toUpperCase(Locale.ROOT));
    }
}
