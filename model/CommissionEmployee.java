package model;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(int id, String name, Gender gender, double grossSales, double commissionRate) {
        super(id, name, gender);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double getEarnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Earnings: $" + getEarnings();
    }
}