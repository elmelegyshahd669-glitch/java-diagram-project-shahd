package model;

import java.util.ArrayList;

public class Department {
    private String name;
    private Employee manager;
    private ArrayList<Employee> employees;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department: " + name + ", Manager: " + (manager != null ? manager.getName() : "None") + ", Total Employees: " + employees.size();
    }
}