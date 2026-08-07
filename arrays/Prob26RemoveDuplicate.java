package arrays;

class Prob26 {
    public int removeDuplicate(int[] arr) {
        int writer = 0;
        for (int reader = 1; reader < arr.length; reader++) {
            if (arr[writer] != arr[reader]) {
                writer++;
                arr[writer] = arr[reader];
            }
        }
        return writer + 1;
    }
}

public class Prob26RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        Prob26 pr26 = new Prob26();
        int result = pr26.removeDuplicate(arr);
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}