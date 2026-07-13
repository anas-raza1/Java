public class AlphabetPat2 {
    public static void main(String[] args) {
        int range = 5;
        char character = 'A';
        for (int row = 0; row <= range; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print((char) (character + col));
            }
            System.out.println();
        }
    }
}
