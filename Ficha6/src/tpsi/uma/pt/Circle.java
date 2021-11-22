package tpsi.uma.pt;

public class Circle extends Shape{

    private double radius;

    public Circle() {
        super();
        this.radius = 0.0;
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Point getPosition(){
        return position;
    }

    @Override
    public double getArea(){
        return (Math.PI*Math.pow(2,radius));
    }

    @Override
    public double getPerimeter(){
        return (2*Math.PI*radius);
    }



}
