package lista01;

import java.io.Serializable;

public class Aluno implements Comparable<Aluno>, Serializable {
	
	private int matricula;
	private String nome;

	public Aluno(int matricula) {
		this.matricula = matricula;
	}

	public Aluno(int matricula, String nome) {
		this(matricula);
		this.nome = nome;

	}	
	
	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return matricula;
	}

	@Override
	public int compareTo(Aluno aluno) {
		Integer cod = matricula;
		return cod.compareTo(aluno.matricula);
	}
}
