package urna.urnajava.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import urna.urnajava.dto.VotoDTO;
import urna.urnajava.form.VotoForm;
import urna.urnajava.models.Voto;
import urna.urnajava.repository.VotoRepository;

@RestController
@RequestMapping("/voto")
public class VotoController {
	@Autowired VotoRepository votoRepository;
//	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping
	public List<VotoDTO>listar(){
		List<Voto>votos;
		votos=votoRepository.findAll();
		return VotoDTO.converte(votos);
	}
	
	@PostMapping
    @Transactional
    public Voto salvar(@RequestBody @Valid VotoForm votoForm) {
        Voto voto = votoForm.converter();
        votoRepository.save(voto);
        return voto;
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
