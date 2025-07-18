package persistencia;

import persistencia.ConexionSQLite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import logica.Jugador;
import logica.personajes.Personaje;

public class JugadorDAO {
    
    // **** Guardar Jugador ****
    public int insertarJugador(String nombre, String tipo) {
        String sql = "INSERT INTO jugadores (nombre, tipo) VALUES (?, ?)";
        int idGenerado = -1;

        try (Connection conn = ConexionSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, tipo);
            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                idGenerado = rs.getInt(1); // Aquí tienes el ID
                System.out.println("Jugador insertado con ID: " + idGenerado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idGenerado;
    }
    
    // **** Cargar Jugador ****
    public List<Jugador> obtenerJugadores() {
        List<Jugador> lista = new ArrayList<>();

        String sql = "SELECT * FROM jugadores";

        try (Connection conn = ConexionSQLite.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String tipo = rs.getString("tipo");
                
                Personaje personaje;
                
                if (tipo.equalsIgnoreCase("Mago") || tipo.equalsIgnoreCase("Wizard")) {
                    personaje = new logica.personajes.Mago();
                } else if (tipo.equalsIgnoreCase("Guerrero") || tipo.equalsIgnoreCase("Warrior")) {
                    personaje = new logica.personajes.Guerrero();
                } else {
                    continue;
                }
                               
                Jugador jugador = new Jugador(id, nombre, personaje);
                lista.add(jugador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // **** Eliminar Jugador ****
    public void eliminarJugadorPorId(int idJugador) {
        String sql = "DELETE FROM jugadores WHERE id = ?";

        try (Connection conn = ConexionSQLite.conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idJugador);
            int filas = pstmt.executeUpdate();

            if (filas > 0) {
                System.out.println("Jugador con ID " + idJugador + " eliminado correctamente.");
            } else {
                System.out.println("No se encontró el jugador con ID " + idJugador + ".");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // **** Contar Jugador por ID ****
    public int contarPartidasPorJugador(int idJugador) {
        String sql = "SELECT COUNT(*) FROM partidas WHERE id_jugador = ?";
        int total = 0;

        try (Connection conn = ConexionSQLite.conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idJugador);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                total = rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return total;
    }

    // **** Eliminar Partida por Jugador ****
    public void eliminarPartidasPorJugador(int idJugador) {
        String sql = "DELETE FROM partidas WHERE id_jugador = ?";

        try (Connection conn = ConexionSQLite.conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idJugador);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}