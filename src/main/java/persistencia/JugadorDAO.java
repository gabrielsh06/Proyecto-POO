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

                Jugador jugador = new Jugador(id, nombre, tipo);
                lista.add(jugador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}