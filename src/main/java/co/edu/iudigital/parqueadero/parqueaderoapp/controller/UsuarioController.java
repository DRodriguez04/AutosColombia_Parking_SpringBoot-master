package co.edu.iudigital.parqueadero.parqueaderoapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.parqueadero.parqueaderoapp.domain.Usuario;
import co.edu.iudigital.parqueadero.parqueaderoapp.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearUsuario(@RequestBody Usuario usuario){
        usuarioService.registerUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> obtenerListUsuarios() {
        List<Usuario> uList = new ArrayList<>();
        return uList;
    }

    @GetMapping("/{id}")
    public Optional<Usuario> obtUsuariosById(@PathVariable int id) {
        return usuarioService.gOptionalUser(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizarUsuario(@RequestBody Usuario usuario){
        usuarioService.actUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable int id){
        usuarioService.delUsuario(id);
    }
}
