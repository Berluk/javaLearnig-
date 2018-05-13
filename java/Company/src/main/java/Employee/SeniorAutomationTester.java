package Employee;


/**
 * Created by lenovo on 2018-05-06.
 */
public class SeniorAutomationTester extends Employee {

    public SeniorAutomationTester(String firstName, String lastName, String workplace, String desc) {
        super(firstName, lastName, workplace, desc);
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
