package dominio;

import java.io.Serializable;

public class Pessoa implements Serializable {
	//Id da classe
	private static final long serialVersionUID = 1L;
	
	//Atributos
	private int id;
	private String nome;
	private String email;
	
	//Construtor vazio
	public Pessoa() {
		
	}
	
	//Construtor com parametros
	public Pessoa(int id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	//Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	//ToString
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
	
	
}
