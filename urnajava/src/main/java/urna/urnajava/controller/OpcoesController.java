package urna.urnajava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import urna.urnajava.dto.OpcoesDTO;
import urna.urnajava.models.Opcoes;
import urna.urnajava.repository.OpcoesRepository;


@RestController
@RequestMapping("/opcoes")
public class OpcoesController {
	
	@Autowired OpcoesRepository opcoesRepository;
    
    @GetMapping
    public List<OpcoesDTO> listar(){
        List<Opcoes>opcoes;
        opcoes = opcoesRepository.findAll();
        return OpcoesDTO.converter(opcoes);
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
