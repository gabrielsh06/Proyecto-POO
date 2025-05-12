package Personajes;

public class Personaje implements Atacable{
    private String nombre;
    private String tipo;
    private int vida;
    private int fuerza;
    private int escudo;
    
    public Personaje(String nombre, String tipo, int vida, int fuerza, int escudo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.fuerza = fuerza;
        this.escudo = escudo;
    }
    
    // **** Setters and Getters ****
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    // **** Metodos de la interfaz ****
    
    @Override
    public String getTipo() {
        return tipo;
    }
    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public int getVida() {
        return vida;
    }
    @Override
    public void setVida(int vida) {
        this.vida = Math.max(0, vida);
    }
    
    @Override
    public int getEscudo() {
        return escudo;
    }
    @Override
    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
    
    // **** Conocer Estado ****
    
    @Override
    public boolean estaVivo(){
        return vida > 0;
    }
    
    @Override
    public void morir() {
        vida = 0;
        System.out.printf("%s ha muerto", nombre);
    }
    
    // **** Acción Atacar ****
    
    @Override
    public int calcularDaño(Atacable objetivo) {
        int daño = fuerza - objetivo.getEscudo();
        return Math.max(0, daño);
    }
    
    @Override
    public void atacar(Atacable objetivo) {
        int daño = calcularDaño(objetivo);
        objetivo.setVida(objetivo.getVida() - daño);
        System.out.printf("%s ataca a %s y le hace %d de daño\n", nombre, objetivo.getTipo(), daño);
        
        if (objetivo.estaVivo()) {
            System.out.printf("La vida de %s es %d\n", objetivo.getTipo(), objetivo.getVida());
        } else {
            objetivo.morir();
        }
    }
}