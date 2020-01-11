package com.hoan.petclinicweb.Controller;

import com.hoan.petclinicdata.model.Pet;
import com.hoan.petclinicdata.model.PetType;
import com.hoan.petclinicdata.service.OwnerService;
import com.hoan.petclinicdata.service.PetService;
import com.hoan.petclinicdata.service.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PetController {

    @Autowired
    private PetService petService;
    @Autowired
    private OwnerService ownerService;
    @Autowired
    private PetTypeService petTypeService;

    @RequestMapping("/pets")
    public List<Pet> findAll(){
        List<Pet> pets = petService.findAll();
        return pets;
    }

    @GetMapping("/pets/add")
    public String addPet(@RequestParam("ownerId") int ownerId, Model model){
        Pet pet = new Pet();
        pet.setOwner(ownerService.findById(ownerId));

        List<PetType> petTypes = petTypeService.findAll();

        model.addAttribute("pet", pet);
        model.addAttribute("petTypes", petTypes);
        return "Pet/pet-form";
    }

    @PostMapping("/pets/save")
    public String savePet(@ModelAttribute Pet pet){
        petService.save(pet);
        return "redirect:/owners/" + pet.getOwner().getId();
    }

    @GetMapping("/pets/update")
    public String updatePet(@RequestParam("id") int id, Model model){
        Pet pet = petService.findById(id);
        List<PetType> petTypes = petTypeService.findAll();

        model.addAttribute("pet", pet);
        model.addAttribute("petTypes", petTypes);
        return "Pet/pet-form";
    }
}
