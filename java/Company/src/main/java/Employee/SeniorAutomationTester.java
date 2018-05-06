package Employee;

import Employee.Interfaces.Responsibility;
import Employee.Interfaces.Salary;
import Employee.Interfaces.Working;

/**
 * Created by lenovo on 2018-05-06.
 */
public class SeniorAutomationTester extends Employee implements Responsibility, Salary, Working {

    public SeniorAutomationTester(String firstName, String lastName, String workplace) {
        super(firstName, lastName, workplace);
    }

    @Override
    public double getSalary() {
        return 15000;
    }

    @Override
    public String printInfo() {
        return ("Lazy");
    }

    @Override
    public int working() {
        return 24;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "Responsibilities: " + '\n' + printInfo();
    }
}
