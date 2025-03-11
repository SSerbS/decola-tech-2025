package me.dio.decola_tech_2025.service;

import me.dio.decola_tech_2025.domain.model.Patient;
import org.springframework.stereotype.Service;

public interface PatientService {
    Patient findById(Long Id);

    Patient create(Patient patientToCreate);
}
