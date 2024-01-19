package lt.techin;

import java.util.Scanner;

public class PD4_7 {
    public static void main(String[] args) {
        Scanner scanNumbers1 = new Scanner(System.in);
        System.out.println("Kiek paskaitų yra pirmadienį ");
        int pirmadienis = scanNumbers1.nextInt();

        Scanner scanNumbers2 = new Scanner(System.in);
        System.out.println("Kiek paskaitų yra antradienį ");
        int antradienis = scanNumbers2.nextInt();

        Scanner scanNumbers3 = new Scanner(System.in);
        System.out.println("Kiek paskaitų yra trečiadienį ");
        int treciadienis = scanNumbers3.nextInt();

        Scanner scanNumbers4 = new Scanner(System.in);
        System.out.println("Kiek paskaitų yra ketvirtadienį ");
        int ketvirtadienis = scanNumbers4.nextInt();

        Scanner scanNumbers5 = new Scanner(System.in);
        System.out.println("Kiek paskaitų yra ketvirtadienį ");
        int penktadienis = scanNumbers5.nextInt();

        double savaite = pirmadienis + antradienis + treciadienis + ketvirtadienis + penktadienis;
        System.out.println("Paskaitų skaičius per savaitę -" + " " + savaite);

        double minutes = savaite * 45;
        System.out.println("Tai sudaro" + " " + minutes + " " + "minučių");
    }
}
