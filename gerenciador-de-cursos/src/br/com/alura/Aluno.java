package br.com.alura;

public class Aluno {

	private String nome;
	private int matricula;

	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.matricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.matricula + "]";
	}

}
