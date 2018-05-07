import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by lenovo on 2018-05-06.
 */
public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String operator1 = "+";
        final String operator2 = "-";
        final String operator3 = "*";
        final String operator4 = "/";
        String operator = null;
        boolean error = true;
        while (error) {
            try {
                double x = input.nextDouble();
                operator = input.next();
                double y = input.nextDouble();
                error = false;

                switch (operator) {
                    case operator1:
                        System.out.println("= " + Operations.add(x, y));
                        break;
                    case operator2:
                        System.out.println("= " + Operations.sub(x, y));
                        break;
                    case operator3:
                        System.out.println("= " + Operations.mult(x, y));
                        break;
                    case operator4:
                        System.out.println("= " + Operations.div(x, y));
                        break;
                    default:
                        throw new UnkownOperatorException ("wrong");
                }
            } catch (UnkownOperatorException e) {
                System.out.println(e.getMessage());

            }
        }
    }
}


