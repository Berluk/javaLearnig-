import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter your text:");
            Text.getLetter();
            System.out.println();

        }
    }
    public static void getLetter() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");

            for(String tmp: str)
            System.out.print(tmp.charAt(0) + " ");
        }
    }


