package biblioteca;

public class Livro{
    private String titulo;
    private int code;
    private String autor;
    private int anoPublicacao;

    public Livro() {
    }

    public Livro(String titulo, int code, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.code = code;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro " + titulo + ", código " + code;
    }
    public String detalhado() {
        return toString()+", "+autor+", "+anoPublicacao;
    }

    

    
}