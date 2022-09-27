public class Time{
    private String nome;
    private String uf;
    private String cidadeSede;

    public Time(String nome, String uf, String cidadeSede) {
        this.nome = nome;
        this.uf = uf;
        this.cidadeSede = cidadeSede;
    }

    public String getCidadeSede() {
        return cidadeSede;
    }

    public void setCidadeSede(String cidadeSede) {
        this.cidadeSede = cidadeSede;
    }

    public String getUF() {
        return uf;
    }

    public void setUF(String uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}