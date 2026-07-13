public class AlphabetPat {
    public static void main(String[] args) {
        int range = 5;
        char character = 'A';
        for (int i = 0; i <= range; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(character + "");
                character++;
            }
            System.out.println();
        }
    }
}
