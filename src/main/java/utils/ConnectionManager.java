package utils;

import java.sql.*;

public class ConnectionManager {
        private static final String url = "jdbc:mysql://sql.home.kartushin.su:3306/test";
        private static final String user = "admin";
        private static final String password = "711267";

        private ConnectionManager() {
        }

        public static Connection getConnection() throws SQLException {
                return DriverManager.getConnection(url, user, password);
        }

        public static ResultSet ExecuteQuery(String query) {
                try (Connection conn = getConnection()) {
                        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
                                return rs;
                        }

                } catch (Exception e) {
                        System.out.println("error");
                }

            return null;
        }
}
