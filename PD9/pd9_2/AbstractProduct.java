package lt.techin.pd9_2;

public abstract class AbstractProduct implements ProductItem, DiscountItem{
    private String name;
    private double price;

    public AbstractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public AbstractProduct() {

    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }


    @Override
    public double getPriceWithDiscount(double discount) {
        return this.getPrice() * discount;
    }
}
