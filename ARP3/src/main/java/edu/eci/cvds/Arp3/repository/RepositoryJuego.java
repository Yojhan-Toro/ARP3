package edu.eci.cvds.Arp3.repository;

import edu.eci.cvds.Arp3.model.Juego;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryJuego extends MongoRepository<Juego, String> {
}
