package Employee;

import Employee.Interfaces.Responsibility;
import Employee.Interfaces.Salary;
import Employee.Interfaces.Working;


public class AutomationTester extends Employee implements Responsibility, Working, Salary {

    public AutomationTester(String firstName, String lastName, String workplace) {
        super(firstName, lastName, workplace);
    }

    @Override
    public String toString() {
        return super.toString() + '\n'+ "Responsibilities:"+ '\n' + printInfo();
    }

    @Override
    public int working(){
        return 12;
    }

    @Override
    public String printInfo() {
        return ("Create automatic tests");
    }

    @Override
    public double getSalary() {
        return 7586.52;
    }
}
