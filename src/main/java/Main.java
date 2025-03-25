import dto.Animal;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql://sql.home.kartushin.su:3306/test";
        String user = "admin";
        String password = "711267";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "Select * FROM animals";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    long id = rs.getLong("id");
                    String name = rs.getString("name");
                    int weight = rs.getInt("weight");
                    String color = rs.getString("color");
                    String type = rs.getString("type");
                    int age = rs.getInt("age");

                    Animal animal = new Animal(color, name, weight, id, age, type);
                    System.out.println(animal.toString());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
