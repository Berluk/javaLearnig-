package Employee.Persons;

import Employee.Employee;
import Employee.Exceptions.ExludedPersonsException;
import Employee.Exceptions.NoMoreSpaceException;

public class Company {


    public static final int MAX_NUMBER_EMPLOYYES = 5;
    private Employee[] persons;
    private int employeesNumber;


    public Company() {
        this.persons = new Employee[MAX_NUMBER_EMPLOYYES];
        this.employeesNumber = 0;
    }

    public void add(Employee employee) throws NoMoreSpaceException {
        if (employeesNumber >= MAX_NUMBER_EMPLOYYES) {
            throw new NoMoreSpaceException("NOTE!!! Lack of place for new employee !!!" +"\n"+
            "Maximum place is: " + persons.length );
        } else {
            persons[employeesNumber] = employee;
            employeesNumber++;
        }
    }
    public Employee exlcuded (String firstName, String lastName)throws ExludedPersonsException{

        boolean found = false;
        Employee foundElement = null;
        int index = 0;
        while (!found&&index<employeesNumber){
            if(persons[index].getFirstName().equals(firstName)&&
                    persons[index].getLastName().equals(lastName)){
                foundElement=persons[index];
                found=true;
            }
            else{
                index++;
            }
            if(foundElement == persons[index]){
                throw new ExludedPersonsException("This person cannot be added !!! "+ '\'' + firstName +'\'' + " "
                        + '\'' + lastName + '\'');
            }
        }
        return foundElement;
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

