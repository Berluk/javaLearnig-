package Employee;

import Employee.Exceptions.ExludedPersonsException;
import Employee.Exceptions.NoMoreSpaceException;
import Employee.Persons.Company;

public class Main {
    public static void main(String[] args) {
        Company person = new Company();
        try {
            person.add(new Tester("Jan", "Nowak", "Manual Tester", WorkType.TESTER.getDesc()));
            person.add(new AutomationTester("Tom", "Addo", "Automation Team", WorkType.AUTOMATION_TESTER.getDesc()));
            person.add(new SeniorTester("Paweł", "Frack", "Senior Tester", WorkType.SENIOR_TESTER.getDesc()));
            person.add(new SeniorAutomationTester("Puff", "daddy", "Lazy", WorkType.SENIOR_AUTOMATION_TESTER.getDesc()));
            person.add(new Tester("Jan", "Kowalski", "Lazy", WorkType.TESTER.getDesc()));
            System.out.println("Employees list: ");
            System.out.println(person);
        } catch (NoMoreSpaceException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(person.exlcuded("Jan", "Kowalski"));
        }
        catch (ExludedPersonsException e){
            System.err.println(e.getMessage());
        }
    }
}

