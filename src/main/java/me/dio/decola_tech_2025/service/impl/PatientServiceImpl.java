package me.dio.decola_tech_2025.service.impl;

import me.dio.decola_tech_2025.domain.model.Patient;
import me.dio.decola_tech_2025.domain.repository.PatientRepository;
import me.dio.decola_tech_2025.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }
    @Override
    public Patient findById(Long id) {
        return patientRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Patient create(Patient patientToCreate) {
        return patientRepository.save(patientToCreate);
    }
}
