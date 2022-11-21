package co.edu.iudigital.parqueadero.parqueaderoapp.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.parqueadero.parqueaderoapp.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    
}
