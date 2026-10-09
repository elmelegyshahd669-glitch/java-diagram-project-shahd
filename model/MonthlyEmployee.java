package model;

public class MonthlyEmployee extends Employee {
    
    private double monthlySalary;
    private double bonus;

    public MonthlyEmployee(int id, String name, Gender gender, double monthlySalary, double bonus) {
        super(id, name, gender);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getEarnings() {
        return monthlySalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Monthly Salary: " + monthlySalary + ", Bonus: " + bonus;
    }
}