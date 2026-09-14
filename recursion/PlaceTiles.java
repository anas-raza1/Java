public class PlaceTiles {

    static int countTiles(int n, int m) {
        // base case
        if (n == m) {
            return 2;
        } else if (n < m) {
            return 1;
        }
        // vertically
        int vertPlacement = countTiles(n - m, m);
        // horizontally
        int horPlacement = countTiles(n - 1, m);

        return vertPlacement + horPlacement;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        System.out.println(countTiles(n, m));
    }
}
