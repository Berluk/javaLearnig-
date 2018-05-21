package Employee;



public class AutomationTester extends Employee {

    public AutomationTester(String firstName, String lastName, String workplace, String desc) {
        super(firstName, lastName, workplace, desc);
        
    }

    @Override
    public String toString() {
        return super.toString() + '\n'+ "Responsibilities:"+ " " + printInfo() + '\n';
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
