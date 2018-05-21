package Employee;

import Employee.Interfaces.Responsibility;
import Employee.Interfaces.Salary;
import Employee.Interfaces.Working;

import java.util.Comparator;


public abstract class Employee implements Responsibility, Working, Salary, Comparable<Employee>{
    private String firstName;
    private String lastName;
    private String workplace;
    private String desc;

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

    public Employee(String firstName, String lastName, String workplace, String desc) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workplace = workplace;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "\n" + "first name: " + '\'' + firstName + '\'' + ", last name: " + '\'' + lastName + '\''
                + ", work place: " + '\'' + workplace + '\'' + ", time working: " + working() + "h" + ","
                + " Salary: " + getSalary() + " zł gross" + "\n" + "Job position: " + desc;
    }

    public static class ComparatorName implements Comparator<Employee>{


        @Override
        public int compare(Employee o1, Employee o2) {

            return o1.compareTo(o2);
        }
    }

    @Override
    public int compareTo(Employee o) {

        int lasteNameCompare = lastName.compareTo(o.getLastName());
        if(lasteNameCompare != 0){
            return lasteNameCompare;
        }
        int firstNameCompare = firstName.compareTo(o.getFirstName());
        if(firstNameCompare != 0){
         return firstNameCompare;
        }

        return firstNameCompare;
    }
}


