package br.com.senac.projetocrud.modelo;

public class Aluno extends Pessoa {

	private int matricula;
	
	private String disciplina;
	private double nota01;
	private double nota02;
	
	public Aluno() {
		super();
	}
	
	public Aluno(long id, String nome, String email, int matricula, String disciplina, double nota01, double nota02) {
		// dentro da herança, temos a palavra "super" para referenciar os membros da classe pai(superclasse)
		super(id, nome, email); // estou chamando o construtor da classe pai
		this.matricula = matricula;
		this.disciplina = disciplina;
		this.nota01 = nota01;
		this.nota02 = nota02;
	}
	
	@Override
	public String toString() {
		return getId() + ", " + getNome() + ", " + getEmail() + ", " + matricula + ", " + disciplina + ", " + nota01 + ", " + nota02;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getNota01() {
		return nota01;
	}

	public void setNota01(double nota01) {
		this.nota01 = nota01;
	}

	public double getNota02() {
		return nota02;
	}

	public void setNota02(double nota02) {
		this.nota02 = nota02;
	}
}




