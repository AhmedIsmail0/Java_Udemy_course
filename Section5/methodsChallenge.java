public class methodsChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Tim",calculateHighScorePosition(25  ));
       // System.out.println(calculateHighScorePosition(1000  ));
    }

    public static void displayHighScorePosition (String playerName, int playerPosition) {
        System.out.println( playerName + " managed to get into position " + playerPosition + " on the high score list");
    }
    public static int calculateHighScorePosition (int playerScore){
        int position = 0;
        if (playerScore >= 1000 ) {
            position = 1 ;
        }else if ((playerScore >= 500) && ( playerScore < 1000 )){
            position = 2;
        }else if ((playerScore >= 100) && ( playerScore < 500 )){
            position = 3;
        }else {
            position = 4;
        }
        return position;
    }
}
