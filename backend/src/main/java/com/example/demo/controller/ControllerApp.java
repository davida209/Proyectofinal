package com.example.demo.controller;

import com.example.demo.models.ModelServicio;
import com.example.demo.models.ModelUser;
import com.example.demo.models.ModelVisita;
import com.example.demo.repository.ServicioRepo;
import com.example.demo.repository.UserRepo;
import com.example.demo.repository.VisitaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3500)
public class ControllerApp {

    @Autowired
    ServicioRepo servicioRepo;

    @Autowired
    VisitaRepo visitaRepo;

    @Autowired
    UserRepo userRepo;

    @GetMapping("/")
    public String security(){
        return "Security";
    }

    @GetMapping("/servicios")
    public List<ModelServicio> servicios(){
        return servicioRepo.findAll();
    }

    @GetMapping("/visita")
    public List<ModelVisita> visita(){
        return visitaRepo.findAll();
    }

    @PostMapping("/agregarservicio")
    public ModelServicio agregarservicio(@RequestBody ModelServicio modelServicio){
        return servicioRepo.save(modelServicio);
    }

    @PostMapping("/agregarvisita")
    public ModelVisita agregarvisita(@RequestBody ModelVisita modelVisita){
        return visitaRepo.save(modelVisita);
    }

    @PostMapping("/login")
    public ModelUser modelUser(@RequestBody ModelUser modelUser) throws  Exception{
        ModelUser user = userRepo.findByEmail(modelUser.getEmail());
        if (user == null)
            throw new Exception();

        if (modelUser.getPassword().equals(user.getPassword()))
            return user;

        throw new Exception();
    }
}
