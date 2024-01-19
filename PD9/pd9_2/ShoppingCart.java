package lt.techin.pd9_2;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<AbstractProduct> items = new ArrayList<>();

    public void addItem(AbstractProduct item){
        items.add(item);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (AbstractProduct element : items){
            totalPrice += element.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithVat(){
        double totalPriceWithVat = 0;
        for (AbstractProduct element : items){
            totalPriceWithVat += element.getPriceWithVat();
        }
        return totalPriceWithVat;
    }
}
