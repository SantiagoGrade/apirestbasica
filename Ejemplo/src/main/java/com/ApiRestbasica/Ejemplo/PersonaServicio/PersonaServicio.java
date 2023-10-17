package com.ApiRestbasica.Ejemplo.PersonaServicio;

import com.ApiRestbasica.Ejemplo.modelo.Persona;

import java.util.ArrayList;
import java.util.Optional;

public class PersonaServicio {

    //CRUD - C = CREATE
    //       R = READ
    //       U = UPDATE
    //       D = DELETE


    //Creacion de lista simulando la base de datos
    ArrayList<Persona> personas = new ArrayList<>();


    //Crear un metodo para listar todas las personas

    public ArrayList<Persona> listarPersonas(){
        return this.personas;
    }

    //Crear un metodo para obtener una persona por su cedula

    public Optional<Persona> obtenerPersonaPorcedula(String cedula){
        return this.personas
                .stream()
                .filter(p -> p.getDocumento().equals(cedula))
                .findFirst();
    }

    //metodo para la creacion de personas
    public Persona crearPersona(Persona persona){
        this.personas.add(persona);
        return persona;
    }


}
