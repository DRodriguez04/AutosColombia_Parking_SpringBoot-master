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

import co.edu.iudigital.parqueadero.parqueaderoapp.domain.Vehiculo;
import co.edu.iudigital.parqueadero.parqueaderoapp.services.VehiculoService;

@RestController
@RequestMapping("/vehiculo")
@CrossOrigin("*")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void creaVehiculo(@RequestBody Vehiculo vehiculo) {
        vehiculoService.registerVehiculo(vehiculo);
    }

    @GetMapping
    public List<Vehiculo> traerVehiculo() {
        List<Vehiculo> vList = new ArrayList<>();
        return vList;
    }

    @GetMapping("/{id_vehiculo}")
    public Optional<Vehiculo> obtVehiculosById(@PathVariable int id_vehiculo) {
        return vehiculoService.gVehOptional(id_vehiculo);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizarVehiculo(@RequestBody Vehiculo vehiculo){
        vehiculoService.actVehiculo(vehiculo);
    }

    @DeleteMapping("/{id_vehiculo}")
    public void eliminarVehiculo(@PathVariable int id_vehiculo){
        vehiculoService.delVehiculo(id_vehiculo);
    }
}
