package com.argentina.programa.testDbConnection.abml;

import com.argentina.programa.testDbConnection.model.Personas;

import java.util.List;

public interface IPersonaService {
    public List<Personas> getPersonas();
    public void save(Personas personas);
    public Personas findPersona(Long id);
}
