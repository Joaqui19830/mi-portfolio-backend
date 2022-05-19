package com.argentina.programa.testDbConnection.controller;

import com.argentina.programa.testDbConnection.abml.IPersonaService;
import com.argentina.programa.testDbConnection.model.Personas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/personas/traer")
    public List<Personas> getPersonas(){
        return personaService.getPersonas();
    }

    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Personas personas){
        personaService.save(personas);

        return "La persona fue creada correctamente";
    }


}
