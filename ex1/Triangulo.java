public class Triangulo {
    private PontoCartesiano p1;
    private PontoCartesiano p2;
    private PontoCartesiano p3;

    public Triangulo(PontoCartesiano p1, PontoCartesiano p2, PontoCartesiano p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public PontoCartesiano getP1() {
        return p1;
    }

    public void setP1(PontoCartesiano p1) {
        this.p1 = p1;
    }

    public PontoCartesiano getP2() {
        return p2;
    }

    public void setP2(PontoCartesiano p2) {
        this.p2 = p2;
    }

    public PontoCartesiano getP3() {
        return p3;
    }

    public void setP3(PontoCartesiano p3) {
        this.p3 = p3;
    }
    

    public double perimetro() {
        return p1.distancia(p2) + p2.distancia(p3) + p3.distancia(p1);
    }
}
