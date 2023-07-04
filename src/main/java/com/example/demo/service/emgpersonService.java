package com.example.demo.service;

import com.example.demo.model.emgPersonDto;
import com.example.demo.model.emgperson;
import com.example.demo.repository.emgpersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class emgpersonService {

    @Autowired
    private emgpersonRepository repository;

    public emgperson saveEmgPerson(emgPersonDto person){
        emgperson temp=new emgperson();
        temp.setFirstName(person.getFirstName());
        temp.setLastName(person.getLastName());
        temp.setEmailId(person.getEmailId());
        temp.setPhoneNo(person.getPhoneNo());
        return this.repository.save(temp);
    }

    public emgperson updateEmgPerson(emgperson person){
        if(this.repository.existsById(person.getId())){
            return this.repository.save(person);
        }
        else{
            return new emgperson();
        }
    }

    public Optional<emgperson> getEmgPerson(long id) {
        if (this.repository.existsById(id)) {
            return this.repository.findById(id);
        }
        else{
            return Optional.of(new emgperson());
        }
    }

    public List<emgperson> getAllEmgPerson(){
        return this.repository.findAll();
    }

    public void deleteEmgPerson(long id){
        if (this.repository.existsById(id)){
            this.repository.deleteById(id);
        }
    }

}
