package urna.urnajava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import urna.urnajava.form.UsuarioForm;
import urna.urnajava.models.Usuario;
import urna.urnajava.repository.UsuarioRepository;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
    @Autowired UsuarioRepository usuarioRepository;
    
    @PostMapping
    @Transactional
    public Usuario salvar(@RequestBody @Valid UsuarioForm userForm) {
        Usuario user = userForm.converter();
        usuarioRepository.save(user);
        return user;
    }
    @Configuration
    public class CorsConfiguration implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
        }
    }
}
