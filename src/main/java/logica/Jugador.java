package logica;

import logica.personajes.Personaje;

public class Jugador {
    private int id;
    private String nombre;
    private Personaje personaje;
    
    public Jugador(String nombre, Personaje personaje) {
        this.nombre = nombre;
        this.personaje = personaje;
    }
    
    public Jugador(int id, String nombre, Personaje personaje) {
        this.id = id;
        this.nombre = nombre;
        this.personaje = personaje;
    }
    
    // Guetters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public Personaje getPersonaje() { return personaje; }
}
