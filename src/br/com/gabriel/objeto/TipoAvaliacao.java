package br.com.gabriel.objeto;

public enum TipoAvaliacao {

    PROVA("Avaliação Individual"),
    SEMINARIO("Seminario"),
    TRABALHO("Trabalho");

    public String TipoAvaliacao;

    private TipoAvaliacao(String TipoAvaliacao) {
        this.TipoAvaliacao = TipoAvaliacao;
    }
    public String getTipoAvaliacao(){
        return TipoAvaliacao;
    }
}
