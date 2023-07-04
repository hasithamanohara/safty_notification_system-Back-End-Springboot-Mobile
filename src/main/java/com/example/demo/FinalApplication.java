package com.example.demo;

import com.example.demo.model.emgperson;
import com.example.demo.repository.emgpersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FinalApplication.class, args);
	}

	@Autowired
	private emgpersonRepository emgpersonRepository;

	@Override
	public void run(String... args) throws Exception {
//		emgperson emgperson = new emgperson();
//		emgperson.setFirstName("hasitha");
//		emgperson.setLastName("manohara");
//		emgperson.setEmailId("hasitha123");
//		emgperson.setPhoneNo(Integer.parseInt("0111"));
//		emgpersonRepository.save(emgperson);
//
//		emgperson emgperson1 = new emgperson();
//		emgperson1.setFirstName("hasithaa");
//		emgperson1.setLastName("manoharaa");
//		emgperson1.setEmailId("hasitha1234");
//		emgperson1.setPhoneNo(Integer.parseInt("01112"));
//		emgpersonRepository.save(emgperson1);
	}
}
