package tpsi.uma.pt;

public class Car extends Vehicle{

    public Car(int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
    }

    public Car() {
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
