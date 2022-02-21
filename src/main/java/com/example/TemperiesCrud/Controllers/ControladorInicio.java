package com.example.TemperiesCrud.Controllers;



import com.example.TemperiesCrud.Models.PersonaModel;
import com.example.TemperiesCrud.Services.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j //para acceder al log
public class ControladorInicio {

    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")//peticon get y como la ruta esta en balnco se ejecuta
    public String inicio(Model model){
      var personas=personaService.listarPersonas();
        model.addAttribute("personas", personas);

        return "index";
    }


    @GetMapping("/agregar")
    public String agregar(PersonaModel persona){
      return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(PersonaModel persona){
        personaService.guardar(persona);
        return "redirect:/";
    }

}
