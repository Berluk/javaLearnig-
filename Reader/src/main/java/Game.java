import java.util.Random;


public class Game {
    static String player1 = "Player 1";
    static String player2 = "Player 2";
    public static void main(String[] args) {
        Game game = new Game();
        game.showThrows();
    }
    public int dice(){
        Random r = new Random();
        int number = r.nextInt(6)+1;
        return number;
    }
    public void showThrows(){
        Game game = new Game();
        System.out.println("First player threw:");
        int numbers;
        int sum_player1 = 0;
        int sum_player2 = 0;
        for(int i=0; i<3;i++){
            numbers=game.dice();
            sum_player1 = sum_player1 + numbers;
            System.out.print(numbers + " ");
        }
        System.out.println("");
        for(int i=0; i<3;i++) {
            numbers = game.dice();
            sum_player1 = sum_player1 + numbers;
            System.out.print(numbers + " ");
        }
        System.out.println("");
        System.out.println("Second player threw: ");
        for(int i=0; i<3;i++){
            numbers=game.dice();
            sum_player2 = sum_player2 + numbers;
            System.out.print(numbers + " ");
        }
        System.out.println("");
        for(int i=0; i<3;i++) {
            numbers = game.dice();
            sum_player1 = sum_player1 + numbers;
            System.out.print(numbers + " ");
        }
        System.out.println("");
        if(sum_player1>sum_player2){
            System.out.println("The winner is: " + player1);
        }else {
            System.out.println("The winner is: " + player2);
        }
    }
}
