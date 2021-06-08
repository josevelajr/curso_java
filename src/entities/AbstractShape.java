package entities;

import enums.Cores;
import interfaces.Shape;

public abstract class AbstractShape implements Shape {

    private Cores cor;

    public AbstractShape(Cores cor) {
        this.cor = cor;
    }

    public Cores getCor() {
        return cor;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }
}
