package br.com.senac.projetocrud.modelo;

/*
 * Nome da classe (FQDN)
 * br.com.senac.projetocrud.modelo.Pessoa
 * */
public abstract class Pessoa {

	private long id;
	private String nome;
	private String email;
	
	// construtor sem argumentos (construtor vazio)
	public Pessoa() {
		super();
	}
	
	// construtor com argumentos (contrutor cheio)
	public Pessoa(long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	// encapsulamento (gets e sets)
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email.toString();
	}
}
