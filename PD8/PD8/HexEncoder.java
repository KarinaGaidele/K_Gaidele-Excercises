package lt.techin.pd8;

public class HexEncoder {
    public String encodeToHex(String text){
        StringBuilder hexChars = new StringBuilder();
        for (char ch : text.toCharArray()){
           hexChars.append(String.format("%.2x" , (int)ch));

        }
        return hexChars.toString();
    }
}
