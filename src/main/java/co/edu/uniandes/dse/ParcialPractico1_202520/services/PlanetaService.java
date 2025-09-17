package co.edu.uniandes.dse.ParcialPractico1_202520.services;

import lombok.extern.slf4j.Slf4j;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.uniandes.dse.ParcialPractico1_202520.entities.PlanetaEntity;
import co.edu.uniandes.dse.ParcialPractico1_202520.exceptions.EntityNotFoundException;
import co.edu.uniandes.dse.ParcialPractico1_202520.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.ParcialPractico1_202520.repositories.PlanetaRepository;




@Slf4j
@Service
public class PlanetaService {

    @Autowired
    private PlanetaRepository planetaRepository;

    @Transactional
    public PlanetaEntity crearPlaneta(PlanetaEntity planeta) throws IllegalOperationException{
        if (planeta.getNombre().endsWith("I, II, III")){
            throw new IllegalOperationException("El planeta debe tenerminar en numeros romanos del I al III");
        }

        if (planeta.getPoblacionPlaneta()<=0){ 
            throw new IllegalOperationException("La poblaciondel planeta debe ser suerior a 0");

    }

    return planetaRepository.save(planeta);

    }

    // private String nombre;
    // private int poblacionPlaneta;
    // private int diametroPlaneta;

}
