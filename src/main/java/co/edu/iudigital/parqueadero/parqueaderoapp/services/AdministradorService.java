package co.edu.iudigital.parqueadero.parqueaderoapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.parqueadero.parqueaderoapp.domain.Administrador;
import co.edu.iudigital.parqueadero.parqueaderoapp.repository.AdministradorRepository;

@Service
public class AdministradorService {
    
    @Autowired
    private AdministradorRepository administradorRepository;

    public void registerAdministrador(Administrador administrador){
        administradorRepository.save(administrador);
    }

    public List<Administrador> getAdministradores(){
        List<Administrador> administradores = (List<Administrador>) administradorRepository.findAll();
        return administradores;
    }

    public Optional<Administrador> gOptionalAdmin(int id){
        Optional<Administrador> getAdminById = administradorRepository.findById(id);
        return getAdminById;
    }

    public void delAdministrador(int id){
        administradorRepository.deleteById(id);
    }
}
