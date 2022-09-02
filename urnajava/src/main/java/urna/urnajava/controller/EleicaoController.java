package urna.urnajava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import urna.urnajava.dto.EleicaoDTO;
import urna.urnajava.models.Eleicao;
import urna.urnajava.repository.EleicaoRepository;

@RestController
@RequestMapping("/eleicao")
public class EleicaoController {
    
    @Autowired
    private EleicaoRepository eleicaoRepository;
    
    @GetMapping
     public List<EleicaoDTO> listar(){
        List<Eleicao>eleicoes;
        eleicoes=eleicaoRepository.findAll();
        return EleicaoDTO.converter(eleicoes);
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