package Employee;

import Employee.Interfaces.Responsibility;
import Employee.Interfaces.Salary;
import Employee.Interfaces.Working;


public abstract class Employee implements Responsibility, Working, Salary {
    private String firstName;
    private String lastName;

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

    private String workplace;
    private String desc;


    public Employee(String firstName, String lastName, String workplace, String desc) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workplace = workplace;
        this.desc = desc;
    }



    @Override
    public String toString() {
        return "first name: " + '\'' + firstName + '\'' + ", last name: " + '\'' + lastName + '\''
                + ", work place: " + '\'' + workplace + '\'' + ", time working: " + working() + "h" + ","
                + " Salary: " + getSalary() + " zł gross" + "\n" + "Job position: " + desc;
    }
}
