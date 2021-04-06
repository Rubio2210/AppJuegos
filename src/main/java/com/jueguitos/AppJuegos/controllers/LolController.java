package com.jueguitos.AppJuegos.controllers;

import com.jueguitos.AppJuegos.service.LolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lol")
public class LolController {

    @Autowired
    LolService lolService;

    @GetMapping(value = "/rotation")
    public String getRotationChampion(){
        String rotation = "S";
        System.out.println("rotation");
        rotation =lolService.getRotationChampoins();

        return rotation;

    }



}
