/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptecnica;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author AlejandroRodriguezB
 */
public class Cliente {

    //atributos
    private UUID id;
    private String nombre;
    private String mail;
    private int numero_telefono;
    private ArrayList<Hotel> listaReservas;

    //constructor
    public Cliente(String nombre, String mail, int numero_telefono) {
        id = UUID.randomUUID();
        this.nombre = nombre;
        this.mail = mail;
        this.numero_telefono = numero_telefono;
        listaReservas = new ArrayList<Hotel>();
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public ArrayList<Hotel> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Hotel> listaReservas) {
        this.listaReservas = listaReservas;
    }

    //metodo para quando el cliente reserva el hotel
    public void reservarHotel(Hotel hotel) {
        listaReservas.add(hotel);
    }

    //toString
    @Override
    public String toString() {
        return nombre;
    }

}
