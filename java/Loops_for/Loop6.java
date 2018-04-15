package Loops_for;

public class Loop6 {
    public static void main(String[] args) {
        for (int i = 3; i >= 0; i--) {
            for (int j = 1; j <= i*2; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
