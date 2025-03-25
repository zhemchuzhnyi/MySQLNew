package dto;

public class Animal {
    private String color;
    private String name;
    private int weight;
    private long id;
    private String type;
    private int age;

    public Animal(String name, String color, int weight, long id, int age, String type) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.id = id;
        this.age = age;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
