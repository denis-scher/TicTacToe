import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TicTacToe game = new TicTacToe();
        game.printBoard();
        System.out.println("""
                You are X's, please enter the location of the first X.
                Enter two numbers, first number represents the line and the second number represents the column.
                For example, to put an X in the middle square of the first line enter 12.""");

        Scanner sc = new Scanner(System.in);
        MinimaxPlayer smart = new MinimaxPlayer();
        while(true){
            String xLoc = sc.nextLine();
            if(game.legal(xLoc)){
                game.setX(xLoc);
            }else {
                System.out.println("Try again please");
                continue;
            }
            if(game.gameOver() != "notOver"){
                game.printBoard();
                switch (game.gameOver()){
                    case "X":
                        System.out.println("X is the winner");
                        return;
                    case "O":
                        System.out.println("O is the winner");
                        return;
                    case "Draw":
                        System.out.println("It's a draw");
                        return;
                }
            }
            game.setO(smart.play(game.getBoard()));
            if(game.gameOver() != "notOver"){
                game.printBoard();
                switch (game.gameOver()){
                    case "X":
                        System.out.println("X is the winner");
                        return;
                    case "O":
                        System.out.println("O is the winner");
                        return;
                    case "Draw":
                        System.out.println("It's a draw");
                        return;
                }
            }
            game.printBoard();
        }
    }

}