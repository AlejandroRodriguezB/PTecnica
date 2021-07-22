/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptecnica;

/**
 *
 * @author AlejandroRodriguezB
 */
public class PTecnica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logitravel logi = new Logitravel();

        //añado los hoteles para pruevas
        Hotel hotel = new Hotel("Palma Bay", "Mallorca");
        logi.addHoteles(hotel);
        hotel = new Hotel("Apolo", "Barcelona");
        logi.addHoteles(hotel);
        hotel = new Hotel("Calvià Beach", "Mallorca");
        logi.addHoteles(hotel);
        hotel = new Hotel("Don Pepe", "Madrid");
        logi.addHoteles(hotel);
        hotel = new Hotel("Barbados", "Mallorca");
        logi.addHoteles(hotel);
        Hotel hotel2 = new Hotel("Don Juan", "Madrid");
        logi.addHoteles(hotel2);

        //creo y añado el cliente
        Cliente cliente = new Cliente("Alex", "123@gmail.com", 123456789);
        //el cliente reserva un hotel
        cliente.reservarHotel(hotel);
        logi.addCliente(cliente);

        //creo otro cliente con 2 reservas
        Cliente cliente2 = new Cliente("Paco", "567@gmail.com", 932123219);
        cliente2.reservarHotel(hotel);
        cliente2.reservarHotel(hotel2);
        logi.addCliente(cliente2);

        //envio las recomendaciones
        logi.enviaRecomendaciones();

    }

}
