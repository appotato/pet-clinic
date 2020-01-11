package com.hoan.petclinicweb.Controller;

import com.hoan.petclinicdata.model.Vet;
import com.hoan.petclinicdata.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VetRestController {
    @Autowired
    private VetService vetService;

    @GetMapping(value = "/vets")
    public List<Vet> findAll(){
        return vetService.findAll();
    }
}
