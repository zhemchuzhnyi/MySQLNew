package dto;

public class Animal {
    private String color;
    private String name;
    private int weight;
    private long id;
    private String type;
    private int age;

    public Animal(){

    }

    public Animal(String color, String name, int weight, long id, String type, int age) {
        this.color = color;
        this.name = name;
        this.weight = weight;
        this.id = id;
        this.type = type;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", id=" + id +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
