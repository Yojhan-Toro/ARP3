package edu.eci.cvds.Arp3.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Juegos")
public class Juego {

    @Id
    String id;
    String nombre;
    int precio;
    String valoracion;


}
