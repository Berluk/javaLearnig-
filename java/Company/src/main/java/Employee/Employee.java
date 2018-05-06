package Employee;

import Employee.Interfaces.Responsibility;
import Employee.Interfaces.Salary;
import Employee.Interfaces.Working;

public abstract class Employee implements Responsibility, Working, Salary {
    private String firstName;
    private String lastName;
    private String workplace;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }


    public Employee(String firstName, String lastName, String workplace) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workplace = workplace;
    }

    @Override
    public String toString() {
        return "first name: " + '\'' + firstName + '\'' + ", last name: " + '\'' + lastName + '\''
                + ", work place: " + '\'' + workplace + '\'' + ", time working: " + working() + "h" + ","
                + " Salary: " + getSalary() + " zł gross";
    }

    @Override
    public String printInfo(){
        return null;
    }
    @Override
    public double getSalary(){
        return 0;
    }
}
