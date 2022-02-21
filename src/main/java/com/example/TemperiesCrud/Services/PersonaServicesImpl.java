package com.example.TemperiesCrud.Services;

import java.util.ArrayList;


import com.example.TemperiesCrud.Models.PersonaModel;
import com.example.TemperiesCrud.Repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServicesImpl implements PersonaService{


    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    @Transactional(readOnly=true)
    public ArrayList<PersonaModel> listarPersonas() {
        // TODO Auto-generated method stub
        return (ArrayList<PersonaModel>) usuarioRepository.findAll();
    }

    @Override
    @Transactional
    public void guardar(PersonaModel pm) {
        usuarioRepository.save(pm);
        
    }

    @Override
    @Transactional
    public void eliminar(PersonaModel pm) {
        // TODO Auto-generated method stub
        usuarioRepository.delete(pm);
        
    }

    @Override
    @Transactional(readOnly = true)
    public PersonaModel encontrarPersona(PersonaModel pm) {
        // TODO Auto-generated method stub
        return usuarioRepository.findById(pm.getIdPersona()).orElse(null);
    }
    
}
