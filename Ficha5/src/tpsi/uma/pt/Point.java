package tpsi.uma.pt;

public class Point {
    //atributos
    private double x;
    private double y;

    //construtor por omissão
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    //construtor por parâmetros
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //construtor com x
    public Point(double x){
        this.x = x;
        this.y = 0;
    }


    //seletores -------------------------------------
    // getters


    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    // -------------------------------

    // forma facilitada de aceder aos dois atributos ou mais ao mesmo tempo
    public double[] getXY(){
        return new double[]{x,y};
    }

    // ------------------------------------------------

    // setters


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    // --------------------------------------------------

    // calcula distancia

    public double distanceto(Point other){
        double distance = Math.sqrt(Math.pow(other.getX() - this.x,2) + Math.pow(other.getY() - this.y,2));
        return distance;
    }
}
