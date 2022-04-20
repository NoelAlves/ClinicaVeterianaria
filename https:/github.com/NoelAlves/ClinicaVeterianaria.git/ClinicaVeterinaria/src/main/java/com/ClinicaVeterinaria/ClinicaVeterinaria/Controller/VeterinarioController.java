package com.ClinicaVeterinaria.ClinicaVeterinaria.Controller;

import  java.util.ArryList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ClinicaVeterinaria.ClinicaVeterinaria.Model.Veterinario;

@Controller 
public class VeterinarioController {
   @GetMapping("/cadastroVeterinario") 
   public String formcadastroVeterinario(Model model) { 
	   Veterinario veterinario = new Veterinario(); 
	   model.addAttribute("Veterinario", veterinario);
	   
	   return"cadastroVeterinario"; 
   }
   
@PostMapping("/cadastroVeterinario") 
public String recebeVeterinario(
      @ModelAttribute("Veterinario") Veterinario veterinario,  
      Model model 
    

}
	
