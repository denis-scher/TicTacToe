import java.util.ArrayList;
import java.util.Random;

public class RndPlayer{ //gets the board state and returns coordinates for O.
    public String play(String[][] board){
        ArrayList playableLoc = new ArrayList<String>();
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                if (board[i][j].equals("[ ]")){
                    playableLoc.add(Integer.toString(i)+Integer.toString(j));
                }
            }
        }
        int rnd = new Random().nextInt(playableLoc.size());

        return playableLoc.get(rnd).toString();
    }
}
