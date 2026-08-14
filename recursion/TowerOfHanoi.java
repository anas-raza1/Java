public class TowerOfHanoi {

    static void tower(int disks, String source, String help, String dest) {
        if (disks == 0) {
            return;
        }
        tower(disks - 1, source, dest, help);
        System.out.println("move disk " + disks + " from " + source + " to " + dest);
        tower(disks - 1, help, source, dest);
    }

    public static void main(String[] args) {
        tower(2, "s", "h", "d");
    }
}