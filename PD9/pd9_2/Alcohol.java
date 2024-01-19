package lt.techin.pd9_2;

public class Alcohol extends AbstractProduct{

    private static final double VAT = 1.21;

    }

    public void Alcohol(String bosca, double price) {
        super();
    }

    public Alcohol(java.lang.String bosca, double v) {
        super();
    }

    @Override
    public double getPriceWithVat() {
        return this.getPrice() * VAT;
    }

}}
