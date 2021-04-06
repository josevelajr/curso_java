package outrostopicos;

public class exercicio59 {

    public void exercicio59() {

        String original = "abcde FGHIJ KLM nop QRst  ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace("a", "Y");
        int s07 = original.indexOf("bc");
        int s08 = original.lastIndexOf("st");
        String[] vectS09 = original.split(" ");

        System.out.println("Original: " + original);
        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(s06);
        System.out.println(s07);
        System.out.println(s08);
        System.out.println(vectS09[0]);
        System.out.println(vectS09[1]);
        System.out.println(vectS09[2]);
        System.out.println(vectS09[3]);
        System.out.println(vectS09[4]);


    }
}
