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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.parqueadero.parqueaderoapp.domain.Administrador;
import co.edu.iudigital.parqueadero.parqueaderoapp.services.AdministradorService;

@RestController
@RequestMapping("/administrador")
@CrossOrigin("*")
public class AdministradorController {
    
    @Autowired
    private AdministradorService administradorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearAdministrador(@RequestBody Administrador administrador){
        administradorService.registerAdministrador(administrador);
    }

    @GetMapping
    public List<Administrador> obtenerListAdministradores() {
        List<Administrador> aList = new ArrayList<>();
        return aList;
    }

    @GetMapping("/{id}")
    public Optional<Administrador> obtAdminById(@PathVariable int id) {
        return administradorService.gOptionalAdmin(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarAdministrador(@PathVariable int id){
        administradorService.delAdministrador(id);
    }
}
