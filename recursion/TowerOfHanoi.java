public class TowerOfHanoi {

    static void tower(int disks,char a, char b, char c){
        if(disks==0){
            return;
        }
        tower(disks-1, a, c, b);
        System.out.println("Move disk "+disks+" from "+a+" to "+c);
        tower(disks-1, b, a, c);
    }
    public static void main(String[] args) {
        tower(3, 'a', 'b', 'c');
    }
}