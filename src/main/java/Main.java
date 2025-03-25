import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql://sql.home.kartushin.su:3306/test";
        String user = "admin";
        String password = "711267";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "Select id, name FROM animals";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    System.out.println(id + ": " + name);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
