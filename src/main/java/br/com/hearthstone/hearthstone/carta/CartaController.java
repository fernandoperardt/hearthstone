package br.com.hearthstone.hearthstone.carta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/carta")
public class CartaController {

    @Autowired
    private CartaService service;

    @GetMapping
    public List<CartaEntity> pesquisarCarta(@RequestParam(value = "nome", required = false) String nome,
                                            @RequestParam(value = "id", required = false) String id,
                                            @RequestParam(value = "tipo", required = false) CartaTipo tipo,
                                            @RequestParam(value = "classe", required = false) CartaClasse classe) {
        if (id != null)
            return service.pesquisarCartasPorId(id);
        else if (nome != null && !nome.isBlank())
            return service.pesquisarCartasPorNome(nome);
        else if (tipo != null)
            return service.pesquisarCartasPorTipo(tipo);
        else if (classe != null)
            return service.pesquisarCartasPorClasse(classe);
        else
            return service.pesquisarTodasCartas();
    }

    @PostMapping
    public ResponseEntity<CartaEntity> criarCarta(@Valid @RequestBody CartaDTO dto) {
        return ResponseEntity.ok(service.criarCarta(dto));
    }

    @DeleteMapping
    public void deletarCartaPeloId(@RequestParam(value = "id") String id) {
        service.apagarCartaPorId(id);
    }
}
