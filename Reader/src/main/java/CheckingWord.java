
import java.util.Arrays;
import java.util.Scanner;

public class CheckingWord {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter your words:");
            CheckingWord.checkAnagram();
        }
    }
    public static boolean checkAnagram(){
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.nextLine();
        String secondWord = sc.nextLine();

        if(firstWord.length()!=secondWord.length()){
            System.out.println(false);
        }

        char[]str1 = firstWord.toCharArray();
        char[]str2 = secondWord.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0; i<str1.length; i++){
            if(str1[i] != str2[i])
                return false;
        }
        System.out.println(true);
        return true;
    }
}
