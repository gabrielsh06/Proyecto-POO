import Personajes.*;
import gui.Main_Interface;

public class ProyectoPOO {
    public static void main(String[] args) {
        Main_Interface pantalla1 = new Main_Interface();
        
        pantalla1.setVisible(true);
        pantalla1.setLocationRelativeTo(null);
        
        Mago mago = new Mago(10, 10, 10, 20);
        Enemigo enemigo = new Enemigo("Ogro", 40, 50);
        
        enemigo.atacar(mago);
        mago.atacar(enemigo);
    }
}