package ss8_cleancode_refactoring.bai_tap;

public class TennisGame {
    public static String getScore(String player1,String player2,int player1Score,int player2Score){
        boolean isEqual = player1Score==player2Score;
        boolean isEnd = (player1Score>=4 || player2Score>=4);
        if(isEqual) {
            return getEqualScore(player1Score);
        }
        if(isEnd){
            return getEndGame(player1Score,player2Score);
        }
        String score = getScorePlayer(player1Score) + "-" + getScorePlayer(player2Score);
        return score;
    }
    public static String getEqualScore(int equalScore){
        switch (equalScore){
            case 0:
                return  "Love-All";
            case 1:
                return  "Fifteen-All";
            case 2:
                return  "Thirty-All";
            case 3:
                return  "Forty-All";
            default:
                return  "Deuce";
        }
    }
    public static String getScorePlayer(int playerScore){
        switch (playerScore){
            case 0:
                return  "Love";
            case 1:
                return  "Fifteen";
            case 2:
                return  "Thirty";
            case 3:
                return  "Forty";
            default:
                return  "";
        }
    }
    public static String getEndGame(int player1Score,int player2Score){
        int minusResult = player1Score-player2Score;
        if (minusResult==1) {
            return "Advantage player1";
        } else if (minusResult ==-1) {
            return  "Advantage player2";
        } else if (minusResult>=2) {
            return  "Win for player1";
        } else {
            return "Win for player2";
        }
    }
}
