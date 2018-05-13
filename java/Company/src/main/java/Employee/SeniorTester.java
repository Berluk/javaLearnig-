package Employee;



public class SeniorTester extends Employee {
    public SeniorTester(String firstName, String lastName, String workplace, String desc) {
        super(firstName, lastName, workplace, desc);
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
