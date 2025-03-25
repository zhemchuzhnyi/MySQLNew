import dto.Animal;
import utils.ConnectionManager;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try (Connection conn = ConnectionManager.getConnection()) {
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
