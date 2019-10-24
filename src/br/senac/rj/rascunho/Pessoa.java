package br.senac.rj.rascunho;

import java.time.LocalDate;

public class Pessoa {
    
    private long id;
    private String nome;
    private String email;
    private LocalDate dtNascimento;
    private Telefone telefone;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}
