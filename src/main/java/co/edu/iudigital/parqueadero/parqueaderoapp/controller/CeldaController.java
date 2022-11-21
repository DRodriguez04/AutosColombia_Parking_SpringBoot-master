package co.edu.iudigital.parqueadero.parqueaderoapp.controller;

import java.util.ArrayList;
import java.util.List;

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

import co.edu.iudigital.parqueadero.parqueaderoapp.domain.Celda;
import co.edu.iudigital.parqueadero.parqueaderoapp.services.CeldaService;

@RestController
@RequestMapping("/celda")
@CrossOrigin("*")
public class CeldaController {
    
    @Autowired
    private CeldaService celdaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearUsuario(@RequestBody Celda celda){
        celdaService.guardarCelda(celda);
    }

    @GetMapping
    public List<Celda> obtenerCeldas() {
        List<Celda> celdaList = new ArrayList<>();
        return celdaList;
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizarCelda(@RequestBody Celda celda){
        celdaService.actCelda(celda);
    }

    @DeleteMapping("/{id}")
    public void eliminarCelda(@PathVariable int id){
        celdaService.delCelda(id);
    }
}
