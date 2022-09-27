import java.time.LocalDate;

public class Partida {
    private Time timeA;
    private Time timeB;
    private LocalDate data;
    private int placarA = 0;
    private int placarB = 0;
    private Local local;
    private int tempo=0;

    public Partida(Time timeA, Time timeB, LocalDate data, Local local) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.data = data;
        this.local = local;
    }

    public Time getTimeA() {
        return timeA;
    }
    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }
    public Time getTimeB() {
        return timeB;
    }
    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public int getPlacarA() {
        return placarA;
    }
    public void setPlacarA(int placarA) {
        this.placarA = placarA;
    }
    public int getPlacarB() {
        return placarB;
    }
    public void setPlacarB(int placarB) {
        this.placarB = placarB;
    }
    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }
    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    public void incrementaPlacarA(){
        this.placarA++;
    }

    public void incrementaPlacarB(){
        this.placarB++;
    }

    public void iniciaPartida() throws InterruptedException{
        System.out.println("Partida Iniciando!!");
        imprimePartida();
        while (this.tempo<=45) {
            long tempo = (long) Math.floor(Math.random()*(5-2)+1);
            this.tempo+= tempo;
            Thread.sleep(tempo*300);
            if(Math.random()>=0.9){
                if(Math.floor(Math.random()*1000)%2==1){
                    incrementaPlacarB();
                    imprimePartida();
                }
                else{
                    incrementaPlacarA();
                    imprimePartida();
                }
            }
        }
        System.out.println("Intervalo!!");
        Thread.sleep(2000);
        System.out.println("2º Tempo!!");
        this.tempo=45;
        while (this.tempo<=90) {
            long tempo = (long) Math.floor(Math.random()*(5-2)+1);
            this.tempo+= tempo;
            Thread.sleep(tempo*300);
            if(Math.random()>=0.9){
                if(Math.floor(Math.random()*1000)%2==1){
                    incrementaPlacarB();
                    imprimePartida();
                }
                else{
                    incrementaPlacarA();
                    imprimePartida();
                }
            }
        }
        System.out.println("Partida Finalizada!!");
        imprimePartida();
    }

    public void imprimePartida(){
        System.out.println("PARTIDA: "+this.timeA.getNome()+" "+this.placarA+"X"+this.placarB+" "+this.timeB.getNome() + "  " + this.tempo+"'");
        System.out.println("Data: "+this.data+"  Cidade: "+this.local.getCidade()+"-"+this.local.getEstado()+"  Estádio: "+this.local.getEstadio());
    }


}
