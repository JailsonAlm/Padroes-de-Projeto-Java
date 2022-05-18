package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Interface repository, será a interface que irá prover todos os métodos de acesso a dados da determinada entidade
 */

@Repository
public interface ClienteRepository extends CrudRepository <Cliente, Long> {

}
