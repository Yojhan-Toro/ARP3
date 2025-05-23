package edu.eci.cvds.Arp3.model;
import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;


@Data
@Document(collection = "Cajas")
public class Caja {

    @Id
    String id;
    int valor;
    ArrayList<Juego> juegos;
    int valorTotal;

}
