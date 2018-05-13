package Employee;

public enum WorkType {
    AUTOMATION_TESTER("Automation Tester"),
    SENIOR_AUTOMATION_TESTER("Senior Automation Tester"),
    SENIOR_TESTER("Senior Tester"),
    TESTER("Manual Tester");



    private String desc;

    WorkType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
