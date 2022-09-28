public class Retangulo extends FormaGeometrica{
    private double l1;
    private double l2;

    public Retangulo(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public double getL1() {
        return l1;
    }
    public void setL1(double l1) {
        this.l1 = l1;
    }
    public double getL2() {
        return l2;
    }
    public void setL2(double l2) {
        this.l2 = l2;
    }


    @Override
    public String toString() {
        return "Retangulo:   Perímetro = "+ Math.round(getPerimetro()*1000.0)/1000.0+"       Área = "+Math.round(getArea()*1000.0)/1000.0;
    }

    @Override
    public double getPerimetro(){
        return 2*l1 + 2*l2;
    }

    @Override
    public double getArea(){
        return l1*l2;
    }
}