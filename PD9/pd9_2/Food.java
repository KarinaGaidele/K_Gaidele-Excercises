package lt.techin.pd9_2;

public class Food extends AbstractProduct{

    private static final double VAT = 1.21;

    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPriceWithVat() {
        return this.getPrice() * VAT;
    }

}
