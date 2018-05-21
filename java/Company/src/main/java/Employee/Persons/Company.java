package Employee.Persons;

import Employee.Employee;
import Employee.Exceptions.ExludedPersonsException;
import Employee.Exceptions.NoMoreSpaceException;

import java.util.ArrayList;

public class Company {
    public static final int MAX_NUMBER_EMPLOYYES = 10;
    private ArrayList<Employee> persons = new ArrayList<Employee>();

    public ArrayList<Employee> getPersons() {
        return persons;
    }

    private int employeesNumber;


    public Company() {
        this.persons = new ArrayList<Employee>(MAX_NUMBER_EMPLOYYES);
        this.employeesNumber = 0;
    }

    public void add(Employee employee) throws NoMoreSpaceException, ExludedPersonsException {
        if (employeesNumber >= MAX_NUMBER_EMPLOYYES) {
            throw new NoMoreSpaceException("NOTE!!! Lack of place for new employee !!!" + "\n" +
                    "Maximum place is: " + persons.size());
        } else if ("Jan".equals(employee.getFirstName()) && "Kowalski".equals(employee.getLastName())) {
            throw new ExludedPersonsException("Cannot save this person: " + employee.getFirstName() + " " + employee.getLastName());
        } else {
            persons.add(employeesNumber, employee);
            employeesNumber++;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++) {
            result = result + persons.get(i);
        }
        return result;
    }
}

