package logica.personajes;

public class Guerrero extends Personaje{
    private int arma;
    
    public Guerrero(int fuerza, int escudo, int arma) {
        super("nombreDefault", "Guerrero", 100, fuerza, escudo);
    }
    
    @Override
    public int calcularDaño(Atacable objetivo) {
        int daño = this.getFuerza() * arma - objetivo.getEscudo();
        return Math.max(0, daño);
    }
}