package edu.eci.cvds.Arp3.service;


import edu.eci.cvds.Arp3.model.Juego;
import edu.eci.cvds.Arp3.repository.RepositoryJuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceJuego {

    @Autowired
    RepositoryJuego repositoryJuego;

    public void addjuego(Juego juego){
        repositoryJuego.save(juego);
    }

    public void deljuego(String id){
        repositoryJuego.deleteById(id);
    }

    public Juego getjuego(String id){
        return repositoryJuego.findById(id).orElse(null);
    }


}
