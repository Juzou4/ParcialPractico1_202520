package co.edu.uniandes.dse.ParcialPractico1_202520.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class SistemaSolar extends BaseEntity {

    private String nombre;
    private RegionType regiones;
    private double minRatio;
    private double stormTroopers;

    @PodamExclude
    @OneToMany(fetch = FetchType.LAZY)
    private SistemaSolar sistemaSolar;

}