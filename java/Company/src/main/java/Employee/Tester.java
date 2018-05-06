package Employee;

import Employee.Interfaces.Responsibility;
import Employee.Interfaces.Salary;
import Employee.Interfaces.Working;


public class Tester extends Employee implements Working, Responsibility, Salary {


    public Tester(String firstName, String lastName, String workplace) {
        super(firstName, lastName, workplace);
    }

    @Override
    public String toString() {

        return super.toString() + '\n' + "Responsibilities:" + "\n" + printInfo();
    }

    @Override
    public int working() {
        return 8;
    }

    @Override
    public String printInfo(){
        return ("Manual tester perform manual tests.");
    }

    @Override
    public double getSalary() {
        return 4555.55;
    }
}
