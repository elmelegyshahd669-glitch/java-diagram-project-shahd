package employeenmanagementsystem;

import model.CommissionEmployee;
import model.Department;
import model.Gender;
import model.HourlyEmployee;
import model.MonthlyEmployee;

public class MainTest {
    public static void main(String[] args) {
        MonthlyEmployee mEmp = new MonthlyEmployee(1, "Ahmed", Gender.MALE, 5000.0, 500.0);
        CommissionEmployee cEmp = new CommissionEmployee(2, "Sara", Gender.FEMALE, 10000.0, 0.1);
        HourlyEmployee hEmp = new HourlyEmployee(3, "Mohamed", Gender.MALE, 45.0, 50.0);

        Department dept = new Department("IT Department", mEmp);
        dept.addEmployee(mEmp);
        dept.addEmployee(cEmp);
        dept.addEmployee(hEmp);

        System.out.println(dept.toString());
        System.out.println("--------------------------------------------------");
        System.out.println(mEmp.toString() + ", Total Earnings: " + mEmp.getEarnings());
        System.out.println(cEmp.toString() + ", Total Earnings: " + cEmp.getEarnings());
        System.out.println(hEmp.toString() + ", Total Earnings: " + hEmp.getEarnings());
    }
}