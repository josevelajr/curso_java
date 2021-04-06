package estruturasequencial;

import java.util.Locale;

public class Exercicio25 {

    public void exercicio25() {

        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println("Hello Word!");
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado %.2f metros%n", x);

        String nome = "Maria";
        String nome2 = "João";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %s anos %s e ganha R$ %.2f reais%n", nome, nome2, idade, renda);
        System.out.println();

        //Exercício 24
        System.out.println("---------------- Exercício 24 -----------------");

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        Locale.setDefault(new Locale("pt", "BR"));
        System.out.println("Products:");
        System.out.println("Computer which price is $ " + price1);
        System.out.println("Office desk, which price is $ " + price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println("Measue with eight decimal places: " + measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);


        //Exercício 25
        System.out.println("---------------- Exercício 25 -----------------");

        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;
        System.out.println(area);


        System.out.println("---------------- Exercício 25 com Casting-----------------");

        int a25, b25;
        double resultado25;

        a25 = 5;
        b25 = 2;

        resultado25 = (double) a25 / b25;

        System.out.println(resultado25);


        double a25_5;
        int b25_5;

        a25_5 = 5.0;
        b25_5 = (int) a25_5;

        System.out.println(b25_5);

    }
}
