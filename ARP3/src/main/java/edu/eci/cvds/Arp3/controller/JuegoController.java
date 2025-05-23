package edu.eci.cvds.Arp3.controller;

import edu.eci.cvds.Arp3.model.Juego;
import edu.eci.cvds.Arp3.service.ServiceJuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/juego")
public class JuegoController {

    @Autowired
    ServiceJuego serviceJuego;
    
    @PutMapping
    public void addjuego(@RequestBody Juego juego){
        serviceJuego.addjuego(juego);
    }
    
    @GetMapping("/{id}")
    public Juego getjuego(@PathVariable String id){
        return serviceJuego.getjuego(id);
    }
    
    @DeleteMapping
    public void deletejuego(@PathVariable String id){
        serviceJuego.deljuego(id);
    }
    
}
