package model;

public class HourlyEmployee extends Employee {
    
    private double hours;
    private double wage;

    public HourlyEmployee(int id, String name, Gender gender, double hours, double wage) {
        super(id, name, gender);
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double getEarnings() {
        if (hours <= 40) {
            return hours * wage;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Hours: " + hours + ", Wage: " + wage;
    }
}