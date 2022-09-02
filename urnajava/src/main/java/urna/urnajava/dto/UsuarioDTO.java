package urna.urnajava.dto;

import java.util.List;
import java.util.stream.Collectors;

import urna.urnajava.models.Usuario;

public class UsuarioDTO {
    private String usuario;
    private String senha;

    public UsuarioDTO(Usuario usuario) {
        this.usuario = usuario.getUsuario();
        this.senha = usuario.getSenha();
    }

    public String getUsuario() {
        return usuario;
    }
    public String getSenha() {
        return senha;
    }

    public static List<UsuarioDTO> converter(List<Usuario> usuarios){
        return usuarios.stream().map(UsuarioDTO::new).collect(Collectors.toList());
    }
    public static UsuarioDTO converterUnico(Usuario usuario){
        return new UsuarioDTO(usuario);
    }
}
