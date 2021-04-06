package entities;

public class Triangulo {

    public double a, b, c;
    double area;

    public double areaTriangulo(){
        double p = (a + b + c) / 2.0;
        return area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
