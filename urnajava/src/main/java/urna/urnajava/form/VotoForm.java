package urna.urnajava.form;

import javax.validation.constraints.NotNull;

import urna.urnajava.models.Voto;

public class VotoForm {

	@NotNull
	int valor;
	String usuario;
	 
//	public int getIdVoto() {
//		return idVoto;
//	}
//	public void setIdVoto(int idVoto) {
//		this.idVoto = idVoto;
//	}
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
	 
	public Voto converter() {
		System.out.println(this.valor);
        return new Voto(this.valor,this.usuario);
    }
	 
}
