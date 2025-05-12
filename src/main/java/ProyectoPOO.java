import Personajes.*;

public class ProyectoPOO {
    public static void main(String[] args) {
        Mago mago = new Mago(10, 10, 10, 20);
        Enemigo enemigo = new Enemigo("Ogro", 40, 50);
        
        enemigo.atacar(mago);
        mago.atacar(enemigo);
    }
}