package com.argentina.programa.testDbConnection.service;

import com.argentina.programa.testDbConnection.abml.IPersonaService;
import com.argentina.programa.testDbConnection.model.Personas;
import com.argentina.programa.testDbConnection.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Personas> getPersonas() {
        List<Personas> personasList = personaRepository.findAll();
        return personasList;
    }

    @Override
    public void save(Personas personas) {
        personaRepository.save(personas);
    }

    @Override
    public Personas findPersona(Long id) {
        Personas personas = personaRepository.findById(id).orElse(null);
        return personas;
    }
}
