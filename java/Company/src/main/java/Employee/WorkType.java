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

    static void allWorkType(){
        System.out.println("All work type: ");
        for(WorkType w: WorkType.values()){
            if(!w.name().equals(WorkType.CHAIRMAN.name()))
            System.out.println(w.getDescription());
        }
    }
}
