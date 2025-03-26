package dao;

import dto.Animal;
import utils.ConnectionManager;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AnimalTable extends AbsTable {
    public AnimalTable() {
        super("animals");
        columns.put("id", "bigint PRIMARY KEY AUTO_INCREMENT");
        columns.put("type", "varchar(15)");
        columns.put("name", "varchar(15)");
        columns.put("color", "varchar(15)");
        columns.put("weight", "int");
        columns.put("age", "int");
        create();
    }
    public List<Animal> findAll() {
        List<Animal> animals;
        animals = new ArrayList<>();
        try {
            ResultSet rs = ConnectionManager.ExecuteQuery("SELECT * FROM " + tableName);
            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                int weight = rs.getInt("weight");
                String color = rs.getString("color");
                String type = rs.getString("type");
                int age = rs.getInt("age");

                Animal animal = new Animal(color, name, weight, id, age, type);
                animals.add(animal);
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        return animals;
    }
}
