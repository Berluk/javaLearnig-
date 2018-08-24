import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Vowels num = new Vowels();
        System.out.println("Number of vowels: " + num.countVolwes(line));
    }
     int countVolwes(String line){
        int count = 0;
        for(int i = 0; i <line.length(); i++){
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count ++;
            }
        }
        return count;
    }
}

