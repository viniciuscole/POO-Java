public class Ex1 {
   public static void main(String[] args) {
        PontoCartesiano p1 = new PontoCartesiano();
        PontoCartesiano p2 = new PontoCartesiano();
        PontoCartesiano p3 = new PontoCartesiano();

        p1.setX(Double.valueOf(args[0]));
        p1.setY(Double.valueOf(args[1]));
        p2.setX(Double.valueOf(args[2]));
        p2.setY(Double.valueOf(args[3]));
        p3.setX(Double.valueOf(args[4]));
        p3.setY(Double.valueOf(args[5]));

        Triangulo t = new Triangulo(p1, p2, p3);

        System.out.println(t.perimetro());
   }
}
