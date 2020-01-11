package com.hoan.petclinicweb.Controller;

import com.hoan.petclinicdata.model.Owner;
import com.hoan.petclinicdata.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class OwnerController {


    @Autowired
    private OwnerService ownerService;

    @GetMapping({"/owners","owners.html"})
    public String listOfOwners(@RequestParam Optional<String> lastName, Model model){
        if(lastName.isPresent()){
            if(lastName.get().trim().isEmpty()){
                model.addAttribute("owners", ownerService.findAll());
            } else {
                model.addAttribute("owners", ownerService.findByLastName(lastName.get()));
            }
        } else {
            model.addAttribute("owners", ownerService.findAll());
        }

        return "Owner/owners";
    }

    @GetMapping("/owners/{id}")
    public String ownerDetails(@PathVariable int id, Model model){
        Owner owner = ownerService.findById(id);
        model.addAttribute("owner", owner);
        return "Owner/owner-details";
    }

    @GetMapping("/owners/find")
    public String findOwners(){
        return "Owner/find-owners";
    }

    @GetMapping({"/owners/new","/owners/update"})
    public String ownerForm(@RequestParam("id") Optional<Integer> id, Model model){

        Owner owner = id.isPresent() ? ownerService.findById(id.get()) : new Owner();

        model.addAttribute("owner", owner);

        return "/Owner/owner-form";
    }

    @PostMapping("owners/save")
    public String saveOwner(@ModelAttribute Owner owner){

        int id = ownerService.save(owner).getId();

        return "redirect:/owners/" + id;
    }
}
