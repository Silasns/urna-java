package urna.urnajava.models;

import javax.persistence.*;

@Entity
public class Eleicao {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idOpcao;
    private String titulo;
    private String tipo;    
    
    public Eleicao() {
        
    }
    
    public Eleicao(int idOpcao, String titulo, String tipo) {
        this.idOpcao = idOpcao;
        this.titulo = titulo;
        this.tipo = tipo;
    }
    
    public int getIdOpcao() {
        return idOpcao;
    }
    public void setIdOpcao(int idOpcao) {
        this.idOpcao = idOpcao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}