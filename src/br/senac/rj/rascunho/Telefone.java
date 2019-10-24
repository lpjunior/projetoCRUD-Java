package br.senac.rj.rascunho;

public class Telefone {
    private long id;
    private String numero;

    public Telefone() {
    }

    public long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
