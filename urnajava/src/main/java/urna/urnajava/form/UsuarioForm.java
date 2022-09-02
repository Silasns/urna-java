package urna.urnajava.form;

import javax.validation.constraints.*;

import urna.urnajava.models.Usuario;

public class UsuarioForm {

    @NotNull @NotNull @NotBlank
    private String usuario;
    @NotEmpty @NotNull @NotBlank
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario converter() {
        return new Usuario(this.usuario,this.senha);
    }
}
