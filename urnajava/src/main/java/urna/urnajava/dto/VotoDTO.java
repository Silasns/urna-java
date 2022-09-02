package urna.urnajava.dto;

import java.util.List;
import java.util.stream.Collectors;

import urna.urnajava.models.Voto;

public class VotoDTO {
	int idVoto;
	int valor;
	String usuario;
	
	public VotoDTO(Voto voto){
		this.idVoto=voto.getIdVoto();
		this.valor=voto.getValor();
		this.usuario=voto.getUsuario();
	}
	

	public int getIdVoto() {
		return idVoto;
	}

	public int getValor() {
		return valor;
	}

	public String getUsuario() {
		return usuario;
	}
	
	public static List<VotoDTO> converte(List<Voto> votos) {
		return votos.stream().map(VotoDTO::new).collect(Collectors.toList());
	}
}
