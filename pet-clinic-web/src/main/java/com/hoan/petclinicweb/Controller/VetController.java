package com.hoan.petclinicweb.Controller;

import com.hoan.petclinicdata.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    @Autowired
    private VetService vetService;

    @RequestMapping({"/vets", "/vets.html"})
    public String listOfVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "Vet/vets";
    }
}
