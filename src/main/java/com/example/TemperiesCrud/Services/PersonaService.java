package com.example.TemperiesCrud.Services;

import java.util.ArrayList;

import com.example.TemperiesCrud.Models.*;


public interface PersonaService {
    public ArrayList<PersonaModel> listarPersonas();

    public void guardar(PersonaModel pm);

    public void eliminar(PersonaModel pm);

    public PersonaModel encontrarPersona(PersonaModel pm);
    
}
