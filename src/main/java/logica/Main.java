package logica;

import java.util.List;

import gui.Bienvenida_Interface;
import persistencia.JugadorDAO;

public class Main {
    public static void main(String[] args) {
        Bienvenida_Interface pantalla1 = new Bienvenida_Interface();
        
        pantalla1.setVisible(true);
        pantalla1.setLocationRelativeTo(null);
        
        JugadorDAO dao = new JugadorDAO();
        List<Jugador> jugadores = dao.obtenerJugadores();

        for (Jugador j : jugadores) {
            System.out.println("ID: " + j.getId() + ", Nombre: " + j.getNombre() + ", Tipo: " + j.getTipo());
        }
    }
}