package me.dio.decola_tech_2025.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb-tests")
public class Tests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;


    private Integer NEOFFIR;

    private Integer SRS2;

    public Integer getNEOFFIR() {
        return NEOFFIR;
    }

    public void setNEOFFIR(Integer NEOFFIR) {
        this.NEOFFIR = NEOFFIR;
    }

    public Integer getSRS2() {
        return SRS2;
    }

    public void setSRS2(Integer SRS2) {
        this.SRS2 = SRS2;
    }
}
