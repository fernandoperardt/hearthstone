package br.com.hearthstone.hearthstone.carta;

public class CartaMapper {
    public CartaEntity toEntity(CartaDTO dto) {
        CartaEntity entity = new CartaEntity();
        entity.setNome(dto.getNome());
        entity.setDescricao(dto.getDescricao());
        entity.setAtaque(dto.getAtaque());
        entity.setDefesa(dto.getDefesa());
        entity.setTipo(dto.getTipo());
        entity.setClasse(dto.getClasse());

        return entity;
    }
}
