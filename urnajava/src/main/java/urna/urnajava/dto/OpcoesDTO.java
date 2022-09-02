package urna.urnajava.dto;

import java.util.List;
import java.util.stream.Collectors;

import urna.urnajava.models.Opcoes;

public class OpcoesDTO {

	private int idEleicao;
	private String nome;
	private int valor;
	
	
	
	
	public OpcoesDTO(Opcoes opcoes) {
		
		this.idEleicao = opcoes.getIdEleicao();
		this.nome = opcoes.getNome();
		this.valor = opcoes.getValor();
	}
	public int getIdEleicao() {
		return idEleicao;
	}
	public String getNome() {
		return nome;
	}
	public int getValor() {
		return valor;
	}
	
	 public static List<OpcoesDTO> converter(List<Opcoes> opcoes){
	        return opcoes.stream().map(OpcoesDTO::new).collect(Collectors.toList());
	    }
	    public static OpcoesDTO converterUnico(Opcoes opcoes){
	        return new OpcoesDTO(opcoes);
	    }
	
	
	
}
