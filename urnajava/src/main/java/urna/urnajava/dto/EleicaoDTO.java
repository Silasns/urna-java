package urna.urnajava.dto;

import java.util.List;
import java.util.stream.Collectors;

import urna.urnajava.models.Eleicao;

public class EleicaoDTO {
    private int idOpcao;
    private String titulo;
    private String tipo;
    
    public EleicaoDTO(Eleicao eleicao) {
        this.idOpcao = eleicao.getIdOpcao();
        this.titulo = eleicao.getTitulo();
        this.tipo = eleicao.getTipo();
    }

    public int getIdOpcao() {
        return idOpcao;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getTipo() {
        return tipo;
    }
    
    public static List<EleicaoDTO> converter(List<Eleicao> eleicoes){
        return eleicoes.stream().map(EleicaoDTO::new).collect(Collectors.toList());
                
    }
    
//    public static EleicaoDTO converter(Eleicao eleicao) {
//        return new EleicaoDTO(eleicao);
//    }
    
    
}