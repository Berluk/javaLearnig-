/**
 * Created by lenovo on 2018-03-10.
 */
public class First {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        long a = 22223265;
        int sum = x + y;
        int sub = y - x;
        long summ = sum + a;
        long subb = a - (x + y) * 1000;
        long mod = summ % a;

        System.out.println("Numbers: ");
        System.out.println("1. x = " + x);
        System.out.println("2. y = " + y);
        System.out.println("3. a = " + a);
        System.out.println("Outcomes actions:");
        System.out.println("1. x + y =  " + sum);
        System.out.println("2. y - x = " + sub);
        System.out.println("3. x + y + a = " + summ);
        System.out.println("4. a - (x + y)*1000 = " + subb);
        System.out.println("5. Rest from divided " + summ + "/" + a + " = " + mod);
    }
}
