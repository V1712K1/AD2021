package tpsi.uma.pt;

public class Triangle {
    //atributos
    private Point a;
    private Point b;
    private Point c;

    public Triangle(){
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }
    public Point getB() {
        return b;
    }
    public Point getC() {
        return c;
    }

    public Point[] getABC(){
        return new Point[]{a,b,c};
    }


    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }
    public void setABC(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    // -----------------------------------------------------

    public double getHeight(){
        return this.b.distanceto(a);
    }

    public double getBase(){
        return this.b.distanceto(c);
    }

    public double getArea(){
        double area = (getHeight()*getBase())/2;
        return area;
    }
}
