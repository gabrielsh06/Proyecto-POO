package persistencia;

import persistencia.ConexionSQLite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JugadorDAO {
    public static void insertarJugador(String nombre, String tipo) {
        String sql = "INSERT INTO jugadores (nombre, tipo) VALUES(?,?)";
        
        try (Connection conn = ConexionSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, tipo);

            int filas = pstmt.executeUpdate();

            if (filas > 0) {
                System.out.println("✅ Jugador insertado correctamente.");
            } else {
                System.out.println("⚠️ No se insertó ningún jugador.");
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al insertar jugador: " + e.getMessage());
        }
    }
}