package co.edu.uniandes.dse.ParcialPractico1_202520.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class PlanetaEntity {

    private String nombre;
    private int poblacionPlaneta;
    private int diametroPlaneta;

    @PodamExclude
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanetaEntity planeta;
}

