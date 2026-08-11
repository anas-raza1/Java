package arrays;

class Lc283 {
    public void moveZero(int[] nums) {
        int writer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writer] = nums[i];
                writer++;
            }
        }
        for (int j = writer; j < nums.length; j++) {
            nums[j] = 0;
        }
        for (int result : nums) {
            System.out.print(result + ", ");
        }
    }
}

public class LC283MoveZeros {
    public static void main(String[] args) {
        Lc283 lc283 = new Lc283();
        int[] nums = { 0, 1, 0, 3, 12 };
        lc283.moveZero(nums);
    }
}
