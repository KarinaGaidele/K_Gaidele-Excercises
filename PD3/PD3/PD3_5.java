package lt.techin;

public class PD3_5 {
    public static void main(String[] args) {

        double myDouble = 2.222222;
        long myLong = 2222222;
        float myFloat = 2.22222F;

        double myLongToDouble = (double) myLong;
        float myDoubleToFloat = (float) myDouble;
        int myFloatToInt = (int) myFloat;
        long myFloatToLong = (long) myFloat;

        System.out.println("MyLongToDouble " + myLongToDouble);
        System.out.println("MyDoubleToFloat " + myDoubleToFloat);
        System.out.println("MyFloatToInt " + myFloatToInt );
        System.out.println("MyFloatToLong " + myFloatToLong);


    }
}
