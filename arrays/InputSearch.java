package Java.arrays;
import java.util.*;

public class InputSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        for(int i = 0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int searchN = sc.nextInt();
        for(int j = 0;j<array.length;j++){
            if(array[j]==searchN){
                System.out.println(array[j]);
            }
        }
    }
}
