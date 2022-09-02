package urna.urnajava.form;

import urna.urnajava.models.Opcoes;

public class OpcoesForm {
	
	private int idEleicao;
	private String nome;
	private int valor;
	
	
	
	public OpcoesForm(int idEleicao, String nome, int valor) {
		
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

	public Opcoes converter() {
	   return new Opcoes(this.idEleicao,this.nome, this.valor);
	}

}
