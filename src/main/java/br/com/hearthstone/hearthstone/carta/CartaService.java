package br.com.hearthstone.hearthstone.carta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaService {

    @Autowired
    private CartaRepository repository;

    public CartaEntity criarCarta(CartaDTO dto) {
        CartaEntity entity = new CartaMapper().toEntity(dto);
        repository.save(entity);
        return entity;
    }

    public List<CartaEntity> pesquisarCartasPorNome(String nome) {
        return repository.findListByNome(nome);
    }

    public List<CartaEntity> pesquisarCartasPorId(String id) {
        return repository.findListById(id);
    }

    public List<CartaEntity> pesquisarCartasPorTipo(CartaTipo tipo) {
        return repository.findListByTipo(tipo);
    }

    public List<CartaEntity> pesquisarCartasPorClasse(CartaClasse classe) {
        return repository.findListByClasse(classe);
    }

    public List<CartaEntity> pesquisarTodasCartas() {
        return repository.findAll();
    }

    public void apagarCartaPorId(String id) {
        repository.deleteById(id);
    }
}
