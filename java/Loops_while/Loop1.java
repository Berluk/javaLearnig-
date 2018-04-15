package Loops_while;


public class Loop1 {
    public static void main(String[] args) {
        int i = 4;
        while(i>=0){
            int j = 0;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            i--;
          System.out.println("");
        }

    }
}
