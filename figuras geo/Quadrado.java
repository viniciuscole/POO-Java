public class Quadrado extends FormaGeometrica{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado:   Perímetro = "+ Math.round(getPerimetro()*1000.0)/1000.0+"       Área = "+Math.round(getArea()*1000.0)/1000.0;
    }

    @Override
    public double getPerimetro(){
        return 4*lado;
    }
    @Override
    public double getArea(){
        return Math.pow(lado, 2);
    }
}
