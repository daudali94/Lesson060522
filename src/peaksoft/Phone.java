package peaksoft;

public class Phone {
    private String model;
    private int price;

    public Phone(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public Phone() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
