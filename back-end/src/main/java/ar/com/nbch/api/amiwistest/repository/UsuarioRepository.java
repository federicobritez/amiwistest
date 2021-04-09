package ar.com.nbch.api.amiwistest.repository;

import ar.com.nbch.api.amiwistest.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    List<Usuario> findByEmail(String email);
    List<Usuario> findByNombre(String nombre);
}
