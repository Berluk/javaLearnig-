import java.util.Random;
import java.util.Scanner;

public class GameRest {
    String firstSide = "eagle";
    String secondSide = "tails";

    public static void main(String[] args) {
        while (true) {
            GameRest game = new GameRest();
            game.showSide();

        }
    }

    public void showSide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String choosenString = sc.nextLine();
        boolean choose = false;
        Random r = new Random();
        boolean drawn = r.nextBoolean();
        if (! firstSide.equals(choosenString) && ! secondSide.equals(choosenString)) {
            System.out.println("Wrong");
            System.exit(0);
        } else if (firstSide.equals(choosenString)) {
            choose = true;
        }
        System.out.println("Drawn " + drawn );
        System.out.println("Choosen " + choose);
        if (choose == drawn) {
            System.out.println("You winner");
        } else
            System.out.println("Wrong");

    }
}
