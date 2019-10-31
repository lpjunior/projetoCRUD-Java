package br.com.senac.projetocrud.modelo;

public class Aluno extends Pessoa {

	private int matricula;

	private Disciplina disciplina;

	public Aluno() {
		super();
	}

	public Aluno(long id, String nome, String email, int matricula) {
		// dentro da herança, temos a palavra "super" para referenciar os membros da
		// classe pai(superclasse)
		super(id, nome, email); // estou chamando o construtor da classe pai
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "ID: " + getId() 
			   + "\nNome: " + getNome()
			   + "\nEmail: " + getEmail()
			   + "\nMatricula: " + matricula
			   + "\nDisciplina: " + disciplina.getDisciplina()
			   + "\n1ª nota: " + disciplina.getNota01()
			   + "\n2ª nota: " + disciplina.getNota02();
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}
