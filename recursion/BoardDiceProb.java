public class BoardDiceProb {

    static void boardDice(int currentValue, int endValue, String result) {
        if (currentValue == endValue) {
            System.out.println(result);
            return;
        } else if (currentValue > endValue) {
            return;
        }
        for (int dice = 1; dice <= 6; dice++) {
            boardDice(currentValue + dice, endValue, result + dice);
        }
    }

    public static void main(String[] args) {
        boardDice(0, 5, "");
    }
}