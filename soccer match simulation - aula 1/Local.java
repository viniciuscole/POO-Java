public class Local {
    private String estado;
    private String cidade;
    private String estadio;
    
    public Local(String estado, String cidade, String estadio) {
        this.estado = estado;
        this.cidade = cidade;
        this.estadio = estadio;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
}
