package urna.urnajava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voto {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	int idVoto;
	int valor;
	String usuario;
	
	public Voto(int idVoto, int valor, String usuario) {
		super();
		this.idVoto = idVoto;
		this.valor = valor;
		this.usuario = usuario;
	}
	
	public Voto(int valor,String usuario){
		this.valor = valor;
		this.usuario=usuario;
	}

	public Voto() {}
	
	public int getIdVoto() {
		return idVoto;
	}

	public void setIdVoto(int idVoto) {
		this.idVoto = idVoto;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
