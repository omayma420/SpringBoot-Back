package com.example.demo.service.controller;

import com.example.demo.persistance.entities.Rendezvous;
import com.example.demo.service.impliments.RendezvousService;
import com.example.demo.service.interfaces.IRendezvous;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/rendezvous")
public class RendezvousController {

    @Autowired
    IRendezvous rendezvousservice;

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    Rendezvous save(@RequestBody Rendezvous rendezvous) {
        System.out.println("*******save ***********");
        Rendezvous r=rendezvousservice.saveRendezvous(rendezvous);
        //System.out.println("*******"+p.getEmail());
        return r ;
    }


    @GetMapping("/{id}")
    Rendezvous getRendezvousById(@PathVariable Long id) {
        return rendezvousservice.getRendezvous(id);
    }

    @GetMapping("/quantity")
    int getQuantityRendezvous() {
        return rendezvousservice.getQuantityOfRendezvous();
    }


    @DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
        rendezvousservice.deleteRendezvous(id);
        return true;
    }

}