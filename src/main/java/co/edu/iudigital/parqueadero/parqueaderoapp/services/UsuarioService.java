package co.edu.iudigital.parqueadero.parqueaderoapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.parqueadero.parqueaderoapp.domain.Usuario;
import co.edu.iudigital.parqueadero.parqueaderoapp.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void registerUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
        return usuarios;
    }

    public Optional<Usuario> gOptionalUser(int id){
        Optional<Usuario> getUserById = usuarioRepository.findById(id);
        return getUserById;
    }

    public void actUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void delUsuario(int id){
        usuarioRepository.deleteById(id);
    }
}
