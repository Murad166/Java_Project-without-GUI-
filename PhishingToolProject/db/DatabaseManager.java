package db;

import java.sql.*;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:sqlite:phishing_logs.db";

    public DatabaseManager() {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String createTable = "CREATE TABLE IF NOT EXISTS logs (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "message TEXT," +
                    "timestamp DATETIME DEFAULT CURRENT_TIMESTAMP)";
            Statement stmt = conn.createStatement();
            stmt.execute(createTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void logAlert(String message) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String insert = "INSERT INTO logs (message) VALUES (?)";
            PreparedStatement pstmt = conn.prepareStatement(insert);
            pstmt.setString(1, message);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
