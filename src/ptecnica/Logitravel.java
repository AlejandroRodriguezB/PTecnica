/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptecnica;

import java.util.ArrayList;

/**
 *
 * @author AlejandroRodriguezB
 */
public class Logitravel {

    //atributos
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Hotel> listaHoteles;

    //constructor
    public Logitravel() {
        //inicializamos las arraylists nuevas aunque se supone que el contenido tendria que cojer del repositorio.
        listaClientes = new ArrayList<Cliente>();
        listaHoteles = new ArrayList<Hotel>();
    }

    //getters y setters
    public ArrayList<Cliente> getClientes() {
        return listaClientes;
    }

    public void setClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Hotel> getHoteles() {
        return listaHoteles;
    }

    public void setHoteles(ArrayList<Hotel> hoteles) {
        this.listaHoteles = hoteles;
    }

    public void addCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void addHoteles(Hotel hotel) {
        listaHoteles.add(hotel);
    }

    //metodo para enviar recomendaciones a todos los clientes (coste O(n^3) por lo que se degradara mucho con el augmento de las listas)
    public void enviaRecomendaciones() {
        Cliente cliente;
        Hotel hotel1;
        Hotel hotel2;
        //miramos todos los clientes
        for (int i = 0; i < listaClientes.size(); i++) {
            cliente = listaClientes.get(i);
            //por cada cliente miramos sus reservas
            for (int j = 0; j < cliente.getListaReservas().size(); j++) {
                hotel1 = cliente.getListaReservas().get(j);
                //de cada reserva miramos si hay un hotel en la misma zona y no es el mismo
                for (int k = 0; k < listaHoteles.size(); k++) {
                    hotel2 = listaHoteles.get(k);
                    if (hotel1 != hotel2 && hotel1.getZona() == hotel2.getZona()) {
                        System.out.println("Enviado e-mail a " + cliente + " sobre el hotel " + hotel2); //"log que cambia segun la person y el hotel"
                    }
                }

            }

        }
    }

}
