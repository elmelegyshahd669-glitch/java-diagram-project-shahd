package employeenmanagementsystem;

import model.CommissionEmployee;
import model.Gender;

public class EmployeeNManagementSystem {

    public static void main(String[] args) {
        CommissionEmployee emp = new CommissionEmployee(
            101, 
            "Ahmed Hassan", 
            Gender.MALE, 
            50000.0, 
            0.10
        );

        System.out.println("=== Employee Details ===");
        System.out.println(emp.toString());
        System.out.println("\nCalculated Earnings: $" + emp.getEarnings());
    }
}