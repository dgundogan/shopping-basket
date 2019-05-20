package co.uk.lambda.shopping;

public class Item {

    public enum Offer {
        NONE,
        BUY_ONE_GET_ONE_FREE,
        THREE_FOR_TWO
    }

    private String name;
    private double price;
    private Offer offer;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.offer = Offer.NONE;
    }

    public Item(String name, double price, Offer offer) {
        this.name = name;
        this.price = price;
        this.offer = offer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public double calculatePrice(Long quantity) {
        switch (this.offer) {
            case BUY_ONE_GET_ONE_FREE:
                return (quantity / 2 + (quantity % 2)) * this.price;
            case THREE_FOR_TWO:
                return (quantity / 3 * 2 + (quantity % 3)) * this.price;
            default:
                return quantity * this.price;
        }
    }
}
