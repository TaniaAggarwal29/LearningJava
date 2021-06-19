package taniaaggarwal;

public class Main {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tania", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Mridula", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Sourav", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Tammu", position);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name
                + " managed to get into position "
                + position
                + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000)
            return 1;
        else if (score >= 500)
            return 2;
        else if (score >= 100)
            return 3;
        return 4;
    }
}
