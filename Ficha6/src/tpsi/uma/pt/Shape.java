package tpsi.uma.pt;

public abstract class Shape {
    protected Point position;

    public Shape(double x, double y) {
        this.position = new Point(x,y);
    }

    public Shape() {
        this.position = new Point();
    }

    //getter e setters
    public void setPosition(Point position) {
        this.position = position;
    }


    //metodos abstratos
    public abstract Point getPosition();

    public abstract double getArea();

    public abstract double getPerimeter();
}
