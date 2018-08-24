import java.util.Scanner;

public class CheckName {
    public static void main(String[] args) {
        while (true) {
            CheckName checkName = new CheckName();
            checkName.checking();
        }
    }

    public void checking(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(name.endsWith("a")){
            System.out.println("Is female name");

        }else {
            System.out.println("Is male name" );
        }
    }
}
