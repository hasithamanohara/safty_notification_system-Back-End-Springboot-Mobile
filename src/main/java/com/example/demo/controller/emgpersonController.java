package com.example.demo.controller;

import com.example.demo.model.emgPersonDto;
import com.example.demo.model.emgperson;
import com.example.demo.repository.emgpersonRepository;
import com.example.demo.service.emgpersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/emgpersons")
public class emgpersonController {

    @Autowired
    private emgpersonRepository emgpersonRepository;

    @Autowired
    private emgpersonService service;

//    @GetMapping
//    public List<emgperson> getAllemgperson(){
//        return emgpersonRepository.findAll();
//    }
//
//    //add emgPerson
//    @PostMapping
//    public emgperson createEmg(@RequestBody emgperson emgperson){
//        return emgpersonRepository.save(emgperson);
//    }

    @GetMapping("/getAll")
    public List<emgperson> getAllEmgPerson(){
        return this.service.getAllEmgPerson();
    }

    @GetMapping("/getEmgPerson/{id}")
    public Optional<emgperson> getEmgPerson(@PathVariable Long id){
        return this.service.getEmgPerson(id);
    }

    @PostMapping("/addEmgPerson")
    public emgperson addEmgPerson(@RequestBody emgPersonDto person){
        return this.service.saveEmgPerson(person);
    }

    @PutMapping("/updateEmgPerson")
    public emgperson updateEmgPerson(@RequestBody emgperson person){
        return this.service.updateEmgPerson(person);
    }

    @DeleteMapping("/deleteEmgPerson/{id}")
    public void deleteEmgPerson(@PathVariable long id){
        this.service.deleteEmgPerson(id);
    }

}
