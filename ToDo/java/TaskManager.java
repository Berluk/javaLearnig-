import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        while (true) {
            TaskManager tm = new TaskManager();
            try (Scanner sc = new Scanner(System.in)) {
                tm.mainEngine(sc);
            }
        }
    }

    private void printOptions() {
        for (Option o : Option.values()) {
            System.out.println(o);
        }
    }




    private void mainEngine(Scanner sc) {
        Queue<Task> lisTask = new PriorityQueue<>();
        Option next = null;
        while (next == null || next != Option.EXIT) {
            printOptions();
            next = Option.readOption(sc.nextInt());
            sc.nextLine();
            if (next == Option.ADD) {
                lisTask.offer(creatTaskandRead(sc));
                System.out.println();
            } else if (next == Option.TAKE) {
                take(lisTask.peek());
                System.out.println();
            }else if(next==Option.TAKEandREMOOVE){
                take(lisTask.poll());
                System.out.println();
            }
            else if (next == Option.EXIT) {
                System.out.println("Bye Bye");
                System.exit(2);
            }
        }
    }


    private void take(Task task) {
        System.out.println("Task to do:");
        System.out.println(task);
    }

    private Task creatTaskandRead(Scanner sc) {
        System.out.println("Enter task name:");
        String name = sc.nextLine();
        System.out.println("Enter description task: ");
        String desc = sc.nextLine();
        System.out.println("Enter priority");
        System.out.println("You can choose(LOW. MODERATE, HIGH");
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Task has been done.");
        return new Task(name, desc, priority);
    }
}