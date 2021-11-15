package tpsi.uma.pt;

public class Main {
    public static void main(String[] args){
        Point a = new Point(5,6);
        Point b = new Point(3,8);


        System.out.println(a.distanceto(b));

        Triangle c = new Triangle(new Point(3,4),new Point(4,2),new Point(6,5));


        System.out.println(c.getArea());

        Rectangle d = new Rectangle(new Point(5,6),5,8);
        









    }
}
