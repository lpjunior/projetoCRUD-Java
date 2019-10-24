
package br.senac.rj.rascunho;

import java.time.LocalDate;
import java.time.Month;

public class Aluno extends Pessoa {
    private int matricula;
    private Pessoa responsavel;

    public Aluno() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Telefone tel = new Telefone();
        Pessoa responsavel = new Pessoa();
        
        aluno.setNome("Luis");
        aluno.setEmail("prof.lpjunior@gmail.com");
        
        aluno.setDtNascimento(LocalDate.of(1987, Month.APRIL, 29));
        
        tel.setNumero("21964875646");
        aluno.setTelefone(tel);
        
        aluno.setMatricula(12345);
        
        responsavel.setNome("Sonia");
        responsavel.setEmail("sonia@gmail.com");
        responsavel.setTelefone(new Telefone());
        responsavel.getTelefone().setNumero("2178451236");
        
        aluno.setResponsavel(responsavel);
        
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Email: " + aluno.getEmail());
        System.out.println("Data Nascimento: " + aluno.getDtNascimento());
        System.out.println("Telefone: " + aluno.getTelefone().getNumero());
        System.out.println("Responsável: " + aluno.getResponsavel().getNome());
    }
}
