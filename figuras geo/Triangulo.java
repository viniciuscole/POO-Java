public class Triangulo extends FormaGeometrica{
    private double l1;
    private double l2;
    private double l3;

    public Triangulo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
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
    public double getL3() {
        return l3;
    }
    public void setL3(double l3) {
        this.l3 = l3;
    }

    @Override
    public String toString() {
        return "Triângulo:   Perímetro = "+ Math.round(getPerimetro()*1000.0)/1000.0+"       Área = "+Math.round(getArea()*1000.0)/1000.0;
    }

    @Override
    public double getPerimetro(){
        return l1+l2+l3;
    }
    @Override
    public double getArea(){
        double semiP = getPerimetro()/2;
        return Math.sqrt(semiP*(semiP-l1)*(semiP-l2)*(semiP-l3));
    }
}
