package me.dio.decola_tech_2025.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.decola_tech_2025.domain.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}