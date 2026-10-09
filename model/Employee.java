package model;

public abstract class Employee {
    private int id;
    private String name;
    private Gender gender;

    public Employee(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public abstract double getEarnings();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Gender: " + gender;
    }
}