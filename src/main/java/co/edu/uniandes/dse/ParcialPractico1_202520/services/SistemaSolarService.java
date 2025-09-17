package co.edu.uniandes.dse.ParcialPractico1_202520.services;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.uniandes.dse.ParcialPractico1_202520.entities.SistemaSolar;
import co.edu.uniandes.dse.ParcialPractico1_202520.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.ParcialPractico1_202520.repositories.SistemaSolarRepository;
import jakarta.transaction.Transactional;

public class SistemaSolarService {

    @Autowired
    private SistemaSolarRepository sistemaSolarRepository;

    @Transactional
    public SistemaSolar crearSistemaSolar(SistemaSolar sistemaSolar) throws IllegalOperationException{
        if (sistemaSolar.getNombre()==null || sistemaSolar.getNombre().trim().length()>31){
            throw new IllegalOperationException("El planeta debe tenerminar en numeros romanos del I al III");
        }


    if (sistemaSolar.getSistemaSolar() == null || sistemaSolar.getMinRatio()> 0.6 & sistemaSolar.getMinRatio()<0.2){
        throw new IllegalOperationException("EL ratio debe ser menor ao igual a 0,6 y mayor o igual a 0,2");
    }

    if (sistemaSolar.getStormTroopers()<1000){
        throw new IllegalOperationException("El numero de Stormtroopers debe ser mayor a 1000");
    }

    return sistemaSolarRepository.save(sistemaSolar);

    }

}
