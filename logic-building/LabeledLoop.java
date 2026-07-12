public class LabeledLoop {
    public static void main(String[] args) {
        outer: // labeled loop
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == j) {
                    break outer;
                }
                System.out.println("i is " + i + "and j is " + j);
            }
        }
    }

}
