import java.util.*;

public class CounterWord {
    public static void main(String[] args) {
        while (true){
            System.out.println("Enter your words: ");
            CounterWord counterWord = new CounterWord();
            counterWord.getNumber();

        }
    }

    private void getNumber() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int position = 0;
        int counter = 0;
//        boolean nextWord = false;
        while (position < word.length()) {
            if (" ".charAt(0) == word.charAt(position)) {
                if(position++ < word.length())
                    counter++;
            }
//            if (nextWord) {
//                counter++;
//                nextWord = false;
//            }
            position++;
        }
        System.out.println(counter);
    }
}

