package arrays;
import java.util.*;

class LC1 {
    public int[] twoSum(int[] nums, int target) {

        int[] aux = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int i =0;
        int j = nums.length-1;
        int first = -1;
        int second = -1;
        while(i<j){
            int sum = nums[i] + nums[j];
            if(sum==target){
            first = nums[i];
            second = nums[j];
            break;
            }else if(sum>target){
                j--;
            } else if (sum<target){
                i++;
            }
        }
        int firstIndex = -1;
        int secondIndex = -1;
        for(int k = 0;k<aux.length;k++){
            if(firstIndex== -1 && aux[k]==first){
                firstIndex = k;
            } else
            if(secondIndex == -1 && aux[k] == second){
                secondIndex = k;
            }
        }
        return new int[]{firstIndex, secondIndex};
    }
}

public class LC1TwoSum {

    public static void main(String[] args) {
        LC1 lc1 = new LC1();
        int []nums = {2,7,11,15};
        int target = 9;
        int []result = lc1.twoSum(nums, target);
        for(int i :result){
            System.out.println(i);
        }
    }
}