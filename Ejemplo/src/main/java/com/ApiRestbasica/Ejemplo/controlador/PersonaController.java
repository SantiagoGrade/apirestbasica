package com.ApiRestbasica.Ejemplo.controlador;

import com.ApiRestbasica.Ejemplo.PersonaServicio.PersonaServicio;
import com.ApiRestbasica.Ejemplo.modelo.Persona;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
@RestController
@RequestMapping("api/version1/personas")
public class PersonaController {

    ArrayList<Persona> persona = new ArrayList<>();

    PersonaServicio service = new PersonaServicio();

    //@GetMapping = Obtener informacion
    //@PostMapping = Creacion de objetos
    //@Delete = Eliminar informacion
    //Update(@PutMapping) = Actualizar informacion

    @GetMapping()
    public ArrayList<Persona> listarPersona(){
        return this.service.listarPersonas();
    }

    @GetMapping("{cedula}")
    public Optional<Persona> obtenerPersonaPorcedula(@PathVariable("cedula")String cedula){
        return this.service.obtenerPersonaPorcedula(cedula);
    }

    @PostMapping
    public Persona crearPersona(@RequestBody Persona persona){
        return this.service.crearPersona(persona);
    }

}
