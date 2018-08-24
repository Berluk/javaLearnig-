import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            boolean isPrime = true;
            int num;
            String line = sc.nextLine();
            try {
                num = Integer.parseInt(line);
            } catch (Exception e) {
                if (line.equals("end")) {
                    System.out.println("Bye Bye");
                    break;
                } else {
                    System.out.println("Wtf?");
                    continue;
                }
            }
            if (num == 1 || num == 0) {
                System.out.println("Is not prime");
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    int tmp = num % i;
                    if (tmp == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("is Prime");
                } else {
                    System.out.println("is not Prime");
                }

            }
        }
    }
}
