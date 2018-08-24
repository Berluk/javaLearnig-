public enum Priority {
    LOW("LOW"), MODERATE("MODERATE"), HIGH("HIGH");

   String decriptions;

    Priority(String decriptions) {
        this.decriptions = decriptions;
    }

    public String getDecriptions() {
        return decriptions;
    }

    @Override
    public String toString() {
        return "Priority{" + decriptions;
    }
}
