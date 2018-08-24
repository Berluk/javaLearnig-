import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int h = a.length();

        boolean kk = true;
        for(int i=0; i<h; i++){
            if(a.charAt(i) != a.charAt(h-1-i)){
                kk = false;
                break;
            }
        }
        if(kk)
            System.out.println("Is palindrom");
        else
            System.out.println("It isn't palindrom");
    }
}
