package com.hoan.petclinicweb.Controller;

import com.hoan.petclinicdata.model.Visit;
import com.hoan.petclinicdata.service.PetService;
import com.hoan.petclinicdata.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VisitController {
    @Autowired
    private VisitService visitService;
    @Autowired
    private PetService petService;

    @GetMapping("/visits/add")
    public String visitForm(@RequestParam("petId") int petId, Model model){
        Visit visit = new Visit();
        visit.setPet(petService.findById(petId));
        model.addAttribute("visit", visit);
        return "Visit/visit-form";
    }

    @PostMapping("/visits/save")
    public String saveVisit(@ModelAttribute Visit visit){
        visitService.save(visit);
        return "redirect:/owners/" + visit.getPet().getOwner().getId();
    }
}
