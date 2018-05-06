package Employee;

public class Main {
    public static void main(String[] args) {
        Company person = new Company();
        person.add(new Tester("Jan", "Nowak", "Manual Tester"));
        person.add(new AutomationTester("Tom", "Addo", "Automation Team"));
        person.add(new SeniorTester("Paweł", "Frack", "Senior Tester"));
        person.add(new SeniorAutomationTester("Puff", "daddy", "Lazy"));
        System.out.println(person);
    }
}
