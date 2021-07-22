/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptecnica;

import java.util.UUID;

/**
 *
 * @author AlejandroRodriguezB
 */
public class Hotel {

    //atributos
    private UUID id;
    private String nombre;
    private String zona;

    //constructor
    public Hotel(String nombre, String zona) {
        id = UUID.randomUUID();
        this.nombre = nombre;
        this.zona = zona;
    }

    //getters y setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    //toString
    @Override
    public String toString() {
        return nombre;
    }

}
