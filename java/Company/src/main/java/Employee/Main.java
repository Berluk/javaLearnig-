package Employee;

import Employee.Exceptions.ExludedPersonsException;
import Employee.Exceptions.NoMoreSpaceException;
import Employee.Persons.Company;

import java.util.Collection;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        Company person = new Company();
        try {
            person.add(new Tester("Jan", "Nowak", "Manual Tester", WorkType.TESTER.toString()));
            person.add(new AutomationTester("Tom", "Addo", "Automation Team", WorkType.AUTOMATION_TESTER.toString()));
            person.add(new SeniorTester("Paweł", "Frack", "Senior Tester", WorkType.SENIOR_TESTER.toString()));
            person.add(new SeniorAutomationTester("Puff", "daddy", "Lazy", WorkType.SENIOR_AUTOMATION_TESTER.toString()));
            try{
                person.add(new Tester("Jan", "Kowalski", "Lazy", WorkType.TESTER.toString()));
            }
            catch (ExludedPersonsException e){
                System.err.println(e.getMessage());
            }
            person.add(new Employee("Paweł", "Frąckowiak", "Lazy Buster", WorkType.CHAIRMAN.toString() ) {

                @Override
                public String printInfo() {
                    return null;
                }

                @Override
                public double getSalary() {
                    return 0;
                }

                @Override
                public int working() {
                    return 0;
                }
            });
            System.out.println("Employees list: ");
            System.out.println(person);
            Collections.sort(person);
        } catch (NoMoreSpaceException e) {
            System.err.println(e.getMessage());
        }
         System.out.println("All work type: ");
        for(WorkType w: WorkType.values()){
            System.out.println(w.getDescription());
        }

    }
}

