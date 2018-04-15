package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String operator1 = "+";
        final String operator2 = "-";
        final String operator3 = "*";
        final String operator4 = "/";
        String operator;

        while (true) {
            double x = input.nextDouble();
            operator = input.next();
            double y = input.nextDouble();

            switch (operator){
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
            }
        }
    }
}