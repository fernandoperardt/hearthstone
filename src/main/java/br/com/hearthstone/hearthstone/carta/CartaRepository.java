package br.com.hearthstone.hearthstone.carta;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CartaRepository extends MongoRepository<CartaEntity, String> {

    List<CartaEntity> findListByNome(String nome);

    List<CartaEntity> findListById(String id);

    List<CartaEntity> findListByTipo(CartaTipo id);

    List<CartaEntity> findListByClasse(CartaClasse id);

}
