package br.com.senac.projetocrud.modelo;

public class Disciplina {
	private String disciplina;
	private double nota01;
	private double nota02;

	public Disciplina() {
	}
	
	public Disciplina(String disciplina, double nota01, double nota02) {
		this.disciplina = disciplina;
		this.nota01 = nota01;
		this.nota02 = nota02;
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