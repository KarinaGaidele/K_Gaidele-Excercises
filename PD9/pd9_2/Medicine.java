package lt.techin.pd9_2;

public class Medicine extends AbstractProduct{

    private static final double VAT = 1.05;

    public Medicine(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPriceWithVat() {
        return this.getPrice() * VAT;
    }
}
