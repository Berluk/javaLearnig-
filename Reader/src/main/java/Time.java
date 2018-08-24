
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;

public class Time {
    public static void main(String[] args) {
        while(true) {
            Scanner input = new Scanner(System.in);
            String line = input.nextLine();
            LocalDate localDate = null;

            try {
                localDate = LocalDate.parse(line, ISO_LOCAL_DATE);
            } catch (InputMismatchException ex) {
                ex.printStackTrace();
            }
            if (localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                String work = "Not working";
                if (localDate.minusDays(8).getMonth() != localDate.getMonth() || localDate.plusDays(8).getMonth() != localDate.getMonth()) {
                    work = "working";
                }
                System.out.println("The Sunday is " + work + " day");
            } else {
                System.out.println("Not Sunday");
            }
        }
    }
}
