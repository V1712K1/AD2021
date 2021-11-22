package tpsi.uma.pt;

public class Motorcycle extends Vehicle{

    public Motorcycle(int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
    }

    public Motorcycle() {
        super();
    }

    @Override
    public String toString() {
        return "Car(" +
                "Year" + getYear() +
                "Models" + getModel() +
                "Brand" + getBrand() +
                "Price" + getPrice() +
                "Color" + getColor() + ")";
    }
}
