package Loops_for;

public class Loop8 {
    public static void main(String[] args) {
        for(int i=0; i<=3; i++) {
            for (int j = 0; j <= i*3; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
