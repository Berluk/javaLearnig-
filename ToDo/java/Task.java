
public class Task implements Comparable<Task> {
    private String name;
    private String description;
    private Priority priority;

    public Task() {
    }

    public Task(String name, String description, Priority priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Name task -  " + name + '\n' + "Description task - " + description + '\n' + "Priority - " + priority;
    }

    @Override
    public int compareTo(Task o) {
        return priority.compareTo(o.priority);
    }

    public enum Priority {
        LOW, MODERATE, HIGH;
    }

}
