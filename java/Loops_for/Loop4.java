package Loops_for;

public class Loop4 {
    public static void main(String[] args) {
        for (int i=0; i<=3; i++){
            for(int j=0; j<=3-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=3; i>=0; i--){
            for(int j=0; j<=3-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
