package br.com.hearthstone.hearthstone.carta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CartaDTO {
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "Descrição é obrigatório")
    private String descricao;
    @Max(value=10)
    @Min(value=0)
    private int ataque;
    @Max(value=10)
    @Min(value=0)
    private int defesa;
//    @NotBlank(message = "Tipo é obrigatório")
    private CartaTipo tipo;
//    @NotBlank(message = "Classe é obrigatório")
    private CartaClasse classe;


    public CartaDTO() {
    }

    public CartaDTO(String nome, String descricao, int ataque, int defesa, CartaTipo tipo, CartaClasse classe) {
        this.nome = nome;
        this.descricao = descricao;
        this.ataque = ataque;
        this.defesa = defesa;
        this.tipo = tipo;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public CartaTipo getTipo() {
        return tipo;
    }

    public void setTipo(CartaTipo tipo) {
        this.tipo = tipo;
    }

    public CartaClasse getClasse() {
        return classe;
    }

    public void setClasse(CartaClasse classe) {
        this.classe = classe;
    }
}
