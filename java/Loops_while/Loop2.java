package Loops_while;

/**
 * Created by lenovo on 2018-04-15.
 */
public class Loop2 {
    public static void main(String[] args) {
        int i = 0;
        while(i<=4){
            int j = 0;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
