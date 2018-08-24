import java.util.Scanner;

public class CounterWords {
    public static void main(String[] args) {
        CounterWords counterWords = new CounterWords();
        counterWords.count();

    }

    public void count() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] line = word.split(" ");
        int counter = 0;
        for(String tmp: line){
            if(word.equals(line)){
        }counter++;
        }
    System.out.println(counter);
    }
}
