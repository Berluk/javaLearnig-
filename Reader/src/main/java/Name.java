import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String name1 = sc.nextLine();
            String name2 = " ";


            for (int i = 0; i<=name1.length()-1; i++) {
                name2 = name2 + name1.charAt(name1.length()-1-i);
            }
            System.out.println(name2);
        }
    }
}