package lt.techin;

public class PD4_3 {
    public static void main(String[] args) {
        boolean myTrue = true;
        boolean myFalse = false;
        System.out.println(myTrue && myTrue );
        System.out.println(myTrue && myFalse);
        System.out.println(myFalse && myTrue);

        System.out.println(myTrue || myTrue);
        System.out.println(myTrue || myFalse);
        System.out.println(myFalse || myTrue);
        System.out.println(myFalse || myFalse);
    }
}
