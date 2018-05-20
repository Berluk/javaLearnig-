package Employee;

public enum WorkType {
    AUTOMATION_TESTER ("AutomationTester"),
    SENIOR_AUTOMATION_TESTER("SeniorAutomationTester"),
    SENIOR_TESTER("SeniorTester"),
    TESTER("Tester"),
    CHAIRMAN("Chairman");

    private String description;

    WorkType(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }
}
