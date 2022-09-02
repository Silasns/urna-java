package urna.urnajava.models;

import javax.persistence.*;

@Entity
public class Opcoes {
	
	@Id
	private int idOpcoes;
	private int idEleicao;
	private String nome;
	private int valor;
	
	
	public Opcoes () {
		
	}
		
	
	public Opcoes(int idEleicao, String nome, int valor) {
		this.idEleicao = idEleicao;
		this.nome = nome;
		this.valor = valor;
	}
	public int getIdEleicao() {
		return idEleicao;
	}
	public void setIdEleicao(int idEleicao) {
		this.idEleicao = idEleicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getIdOpcao() {
		return idOpcoes;
	}
	public void setIdOpcao(int idOpcao) {
		this.idOpcoes = idOpcao;
	}
	
	
	
	
}
