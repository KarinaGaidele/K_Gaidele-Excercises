package lt.techin;

public class PD3_6 {
    public static void main(String[] args) {

        int i = 1;
        Integer b= new Integer(i);
        System.out.println(i);

        int num1= Integer.valueOf(23);
        int num2=Integer.valueOf(33);
        Integer result=num1+num2;
        System.out.println(result);

        long c=1000000000000L;
        long d = new Long (c);
        System.out.println(c);
        long wrapperLong = Long.MAX_VALUE;
        System.out.println(wrapperLong);
    }
}
