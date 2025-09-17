package co.edu.uniandes.dse.ParcialPractico1_202520.services;

import org.springframework.stereotype.Service;

import co.edu.uniandes.dse.ParcialPractico1_202520.entities.PlanetaEntity;
import co.edu.uniandes.dse.ParcialPractico1_202520.entities.SistemaSolar;
import co.edu.uniandes.dse.ParcialPractico1_202520.exceptions.EntityNotFoundException;
import co.edu.uniandes.dse.ParcialPractico1_202520.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.ParcialPractico1_202520.repositories.PlanetaRepository;
import co.edu.uniandes.dse.ParcialPractico1_202520.repositories.SistemaSolarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service

public class PlanetaSistemaSolarService {
    private final SistemaSolarRepository sistemaSolarRepository;
    private final PlanetaRepository planetaRepository;

    public PlanetaEntity asociarPlanetaSistema (Long planetaId, Long sistemaId)throws EntityNotFoundException, IllegalOperationException {
    PlanetaEntity planeta = planetaRepository.findBy(planetaId)
    orelse...

}
