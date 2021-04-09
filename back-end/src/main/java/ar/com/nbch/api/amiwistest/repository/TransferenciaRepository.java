package ar.com.nbch.api.amiwistest.repository;

import ar.com.nbch.api.amiwistest.model.Transferencia;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TransferenciaRepository extends CrudRepository<Transferencia, Long> {
    Optional<Transferencia> findById(Long id);
    List<Transferencia> getAllTrans();

}
