package entities;

import enums.Cores;

public class Circulo extends AbstractShape {

    private Double raio;

    public Circulo(Cores cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double area() {
        return 0;
    }
}
