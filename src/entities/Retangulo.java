package entities;

import enums.Cores;

public class Retangulo extends AbstractShape{

    private Double largura;
    private double altura;

    public Retangulo(Cores cor, Double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return 0;
    }
}
