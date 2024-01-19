/**
 * Parašykite Java metodą, kuris skaičiuoja trikampio plotą.
 */

package lt.techin.pd7;

public class PD7_3 {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;

        //area = plotas, trikampis staciakampis
        double area = countArea (a, b);
        System.out.println("Area of Triangle is: " + area);
    }

    private static double countArea(double a, double b) {
        double area = (a * b) / 2.0;
        return area;
    }



}
