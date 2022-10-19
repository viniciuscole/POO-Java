public class PontoCartesiano{
    private double x;
    private double y;
    public PontoCartesiano(){}
    public PontoCartesiano(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double distancia(PontoCartesiano p){
        return Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}