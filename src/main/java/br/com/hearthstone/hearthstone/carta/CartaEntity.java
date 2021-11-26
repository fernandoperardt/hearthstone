package br.com.hearthstone.hearthstone.carta;

import org.springframework.data.annotation.Id;

public class CartaEntity {
    @Id
    private String id;
    private String nome;
    private String descricao;
    private int ataque;
    private int defesa;
    private CartaTipo tipo;
    private CartaClasse classe;

    public CartaEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
