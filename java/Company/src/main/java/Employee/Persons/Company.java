package Employee.Persons;

import Employee.Employee;
import Employee.Exceptions.ExludedPersonsException;
import Employee.Exceptions.NoMoreSpaceException;

public class Company {
    public static final int MAX_NUMBER_EMPLOYYES = 10;
    private Employee[] persons;
    private int employeesNumber;


    public Company() {
        this.persons = new Employee[MAX_NUMBER_EMPLOYYES];
        this.employeesNumber = 0;
    }

    public void add(Employee employee) throws NoMoreSpaceException, ExludedPersonsException {
        if (employeesNumber >= MAX_NUMBER_EMPLOYYES) {
            throw new NoMoreSpaceException("NOTE!!! Lack of place for new employee !!!" + "\n" +
                    "Maximum place is: " + persons.length);
        } else if ("Jan".equals(employee.getFirstName()) && "Kowalski".equals(employee.getLastName())) {
            throw new ExludedPersonsException("Cannot save this person: " + employee.getFirstName() + " " + employee.getLastName());
        } else {

            persons[employeesNumber] = employee;
            employeesNumber++;
        }
    }


    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++) {
            result = result + persons[i];
        }
        return result;
    }

}

