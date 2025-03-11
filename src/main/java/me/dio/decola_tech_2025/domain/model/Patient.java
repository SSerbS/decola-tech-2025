package me.dio.decola_tech_2025.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb-patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(nullable = false)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Tests tests;

    public long getId() {
        return Id;
    }

    public void setId(long Id){
        this.Id = Id;
    }

    public Tests getTests() {
        return tests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }
}
