import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws InterruptedException{
        Time galo = new Time("Atlético mineiro", "MG", "Belo Horizonte");
        Time fla = new Time("Flamengo", "RJ", "Rio de Janeiro");
        Time cruz = new Time("Cruzeiro", "MG", "Belo Horizonte");

        Partida p1 = new Partida(galo, fla, LocalDate.of(2022, 9, 12), new Local("MG", "Belo Horizonte", "Mineirão"));
        Partida p2 = new Partida(galo, cruz, LocalDate.of(2022, 10, 13), new Local("RJ", "Rio de Janeiro", "São Januário"));

        p1.iniciaPartida();

        System.out.println();

        p2.iniciaPartida();
    }
}
