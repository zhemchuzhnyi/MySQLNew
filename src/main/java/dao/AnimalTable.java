package dao;

import dto.Animal;
import utils.ConnectionManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalTable extends AbsTable implements IAnimalTable{
    public AnimalTable() {
        super("animals");
        columns.put("id", "bigint PRIMARY KEY AUTO_INCREMENT");
        columns.put("type", "varchar(15)");
        columns.put("name", "varchar(15)");
        columns.put("color", "varchar(15)");
        columns.put("weight", "int");
        columns.put("age", "int");
        create();
        ConnectionManager manager = ConnectionManager.getInstance();
    }

    @Override
    public List<Animal> findAll() {
        List<Animal> animals = new ArrayList<>();
        try {
            try (ResultSet rs = ConnectionManager.getInstance().executeQueryWithAnswer("SELECT * FROM " + tableName)) {
                while (rs.next()) {
                    long id = rs.getLong("id");
                    String name = rs.getString("name");
                    int weight = rs.getInt("weight");
                    String color = rs.getString("color");
                    String type = rs.getString("type");
                    int age = rs.getInt("age");

                    Animal animal = new Animal(color, name, weight, id, type, age);
                    animals.add(animal);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return animals;
    }

    @Override
    public Animal findById(Long searchId) {
        Animal animal = new Animal();
        try {
            try (ResultSet rs = ConnectionManager.getInstance().executeQueryWithAnswer("SELECT * FROM " + tableName + " WHERE id=" + searchId)) {
                while (rs.next()) {
                    long id = rs.getLong("id");
                    String name = rs.getString("name");
                    int weight = rs.getInt("weight");
                    String color = rs.getString("color");
                    String type = rs.getString("type");
                    int age = rs.getInt("age");

                    animal = new Animal(color, name, weight, id, type, age);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return animal;
    }
}
