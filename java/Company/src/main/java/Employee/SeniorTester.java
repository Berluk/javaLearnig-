package Employee;

import Employee.Interfaces.Responsibility;
import Employee.Interfaces.Salary;
import Employee.Interfaces.Working;

public class SeniorTester extends Employee implements Salary, Responsibility, Working {
    public SeniorTester(String firstName, String lastName, String workplace) {
        super(firstName, lastName, workplace);
    }
    @Override
    public int working(){
        return 8;
    }
    @Override
    public String printInfo(){
        return ("Paweł się obija.");
    }
    @Override
    public double getSalary() {
        return 11500.00;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" + "Responsibilities: " + "\n" + printInfo() ;

    }
}
