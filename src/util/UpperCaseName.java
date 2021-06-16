package util;

import entities.Produto2;

import java.util.Locale;
import java.util.function.Function;

public class UpperCaseName implements Function<Produto2, String> {

    @Override
    public String apply(Produto2 p) {
        return p.getNome().toUpperCase(Locale.ROOT);
    }
}
