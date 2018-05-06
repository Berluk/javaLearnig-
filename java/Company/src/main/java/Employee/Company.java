package Employee;

import Employee.Interfaces.Responsibility;

public class Company implements Responsibility{
    public static final int MAX_NUMBER_EMPLOYYES = 100;
    private Employee[] persons;
    private int employeesNumber;

    public Employee[] getPersons() {
        return persons;
    }

    public void setPersons(Employee[] persons) {
        this.persons = persons;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public Company() {
        this.persons = new Employee[MAX_NUMBER_EMPLOYYES];
        this.employeesNumber =0;
    }

    public void add(Employee employee) {
        if (getEmployeesNumber() < MAX_NUMBER_EMPLOYYES) {
            getPersons()[getEmployeesNumber()] = employee;
            setEmployeesNumber(getEmployeesNumber() + 1);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++) {
            result = result + persons[i] + '\n';
        }
        return result;
    }

    @Override
    public String printInfo() {
        return null;
    }
}

