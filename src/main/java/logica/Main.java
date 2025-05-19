package logica;

import logica.personajes.Mago;
import logica.personajes.Enemigo;
import gui.Bienvenida_Interface;

public class Main {
    public static void main(String[] args) {
        Bienvenida_Interface pantalla1 = new Bienvenida_Interface();
        
        pantalla1.setVisible(true);
        pantalla1.setLocationRelativeTo(null);
        
        Mago mago = new Mago(10, 10, 10, 20);
        Enemigo enemigo = new Enemigo("Ogro", 40, 50);
        
        enemigo.atacar(mago);
        mago.atacar(enemigo);
    }
}