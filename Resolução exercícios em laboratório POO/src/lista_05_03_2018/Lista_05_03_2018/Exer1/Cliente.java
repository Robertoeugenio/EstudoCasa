package Lista_05_03_2018Exer1_Angoti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
	private String nome;
	private String CPF;
	private List<Filme> emprestados;

	public Cliente(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
		this.emprestados = new ArrayList<Filme>();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void devolver(Filme filme) {
		emprestados.remove(filme);
		filme.setEmprestado(null);
	}

	public void emprestar(Filme filme) {
		if (!filme.getEmprestado()) {
			emprestados.add(filme);
			filme.setEmprestado(this);
		} else {
			System.out.println("Filme " + filme.getNome() + " já está alugado!");
		}
	}

	public List<Filme> getEmprestados() {
		return Collections.unmodifiableList(emprestados);
	}
}
