package one.digitalinnovation.gof.controller;

import lombok.AllArgsConstructor;
import one.digitalinnovation.gof.exception.ClientNotFoundException;
import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Esse ResteController representa a Facade, pois abstrai toda
 * a complexidade de integrações (Banco de Dados H2 e API do ViaCEP)
 * em uma interface simples e coesa (API REST).
 *
 * @author JailsonAlm
 */

@RestController
@RequestMapping("Clientes")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteRestController {

    private final ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos(){
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id)  throws ClientNotFoundException {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cliente> inserir(@RequestBody @Valid Cliente cliente) {
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody @Valid Cliente cliente)  throws ClientNotFoundException{
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> deletar(@PathVariable Long id) throws ClientNotFoundException {
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
