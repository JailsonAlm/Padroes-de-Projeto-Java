package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que defini o padrão Strategy no domínio de cliente. Com isso, se necessário,
 * podemos ter multiplas implementações dessa mesma interface.
 *
 * @author JailsonAlm
 *
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
