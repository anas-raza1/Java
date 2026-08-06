import java.util.Scanner;

public class BitManupulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opr = sc.nextInt();
        int num = 5; //0101
        int pos = 1;

        int bitMask = opr<<pos;
        if(opr ==1){
            // set
            int newNum = bitMask | num;
            System.out.println(newNum);
        } else {
            //clear
            int newBitmask = ~(bitMask);
            int newNum = newBitmask & num;
            System.out.println(newNum);
        }
    }
}
