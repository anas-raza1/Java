package arrays;

class Prob66{
    public int[] plusOne(int[] digits){
        for(int i = digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        // if all digits are 9
        int[] all = new int[digits.length+1];
        all[0]=1;
        return all;
    }
}

public class Prob66PlusOne {
    public static void main(String[] args) {
        Prob66 pr66 = new Prob66();
        int[] arr = {1,9,9};
        int[] result = pr66.plusOne(arr);
        for(int i : result){
            System.out.print(i);
        }
    }
}