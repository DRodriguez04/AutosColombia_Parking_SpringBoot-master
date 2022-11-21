package co.edu.iudigital.parqueadero.parqueaderoapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.parqueadero.parqueaderoapp.domain.Celda;
import co.edu.iudigital.parqueadero.parqueaderoapp.repository.CeldaRepository;

@Service
public class CeldaService {
    
    @Autowired
    private CeldaRepository celdaRepository;

    public void guardarCelda(Celda celda){
        celdaRepository.save(celda);
    }

    public List<Celda> getCeldas(){
        List<Celda> celdas = (List<Celda>) celdaRepository.findAll();
        return celdas;
    }

    public void actCelda(Celda celda){
        celdaRepository.save(celda);
    }

    public void delCelda(int id){
        celdaRepository.deleteById(id);
    }
}
