package lt.techin;

public class PD3_7 {
    public static void main(String[] args) {
        String Pirmadienis = "Nemylimiausia diena";
        String Antradienis = " Jau geriau";
        String Treciadienis = new String("Baigesi atostogos");
        String Sum=Pirmadienis+Antradienis;
        String subStr = Treciadienis.substring(1, 12);

        System.out.println(Pirmadienis.length());
        System.out.println(Antradienis.toUpperCase());
        System.out.println(Treciadienis == Pirmadienis);
        System.out.println(Sum);
        System.out.println(subStr);
    }
}
