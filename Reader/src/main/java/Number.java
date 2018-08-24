import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            Number num = new Number();
            double a = 0;
            try{
                a = sc.nextDouble();
                System.out.println(num.getSqrt(a));
            }catch (InputMismatchException e){
                System.out.println("Please enter the correct number !");
                sc.next();
            }


            if (a < 0) {throw new IllegalArgumentException("Number should be addition");
            }
        }
    }
    double getSqrt(double a) {
        return Math.sqrt(a);
    }
}
