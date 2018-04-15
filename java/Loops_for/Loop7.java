package Loops_for;


public class Loop7 {
    public static void main(String[] args) {
        for(int i=3; i>=1; i--){
            for(int j=0; j<=3-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
