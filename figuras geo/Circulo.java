public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Círculo:   Perímetro = "+ Math.round(getPerimetro()*1000.0)/1000.0+"       Área = "+Math.round(getArea()*1000.0)/1000.0;
    }
    
    @Override
    public double getPerimetro(){
        return 2*Math.PI*raio;
    }
    @Override
    public double getArea(){
        return Math.PI*Math.pow(raio, 2);
    }
}
    
