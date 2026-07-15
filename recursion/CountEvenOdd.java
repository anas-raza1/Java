public class CountEvenOdd {

    static int[] countEvenOdd(int range){
        //base case
        if(range==0){
            int result[] = new int[2];
            return result;
        }
        //small problem
        int result[] = countEvenOdd(range-1);
        //logic building
        if(range%2==0){
            result[0] = result[0] +1;
        } else {
            result[1] = result[1]+1;
        }
        return result;
    }

    static void countEvenOdd(int range, int even, int odd) {
        // base case
        if (range == 0) {
            System.out.println("even " + even + " odd " + odd);
            return;
        }
        // logic build
        if (range % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        // small problem
        countEvenOdd(range - 1, even, odd);
    }

    public static void main(String[] args) {
        countEvenOdd(13, 0, 0);
        int arr[] = countEvenOdd(10);
        System.out.println("even count "+arr[0]);
        System.out.println("odd count "+arr[1]);

    }
}