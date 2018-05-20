package Employee;



public class Tester extends Employee {


    public Tester(String firstName, String lastName, String workplace, String desc) {
        super(firstName, lastName, workplace, desc);
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
