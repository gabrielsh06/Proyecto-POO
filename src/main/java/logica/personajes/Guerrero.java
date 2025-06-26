package logica.personajes;

public class Guerrero extends Personaje{
    private int arma;
    
    public Guerrero() {
        super("nombreDefault", "Guerrero", 100, 15, 30);
        this.arma = 5;
    }
    
    @Override
    public String getTipo() {
        return "Guerrero";
    }
    
    @Override
    public int calcularDaño(Atacable objetivo) {
        int daño = this.getFuerza() * arma - objetivo.getEscudo();
        return Math.max(0, daño);
    }
}