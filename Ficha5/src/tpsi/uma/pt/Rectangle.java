package tpsi.uma.pt;

public class Rectangle {

    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle(){
        this.topLeftPoint = new Point();
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(Point topLeftPoint, double height, double width){
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }


    // getters
    public Point getTopLeftPoint() {
        return topLeftPoint;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    // setters
    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width*2) + (height*2);
    }

    public boolean contains(Point p){
        Point bottomLeft = new Point(topLeftPoint.getX(), topLeftPoint.getY() - height);
        Point topRight = new Point(topLeftPoint.getX() + width, topLeftPoint.getY());
        Point bottomRight = new Point(topLeftPoint.getX() + width, topLeftPoint.getY() - height);

        if(p.getX() > bottomLeft.getX() && p.getX() < bottomRight.getX()
        && p.getY() > bottomLeft.getY() && p.getY() < bottomRight.getY()){
            return true;
        }
        else{
            return false;
        }
    }


}
