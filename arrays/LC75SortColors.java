package arrays;
class LC75{
    public void swap(int[] nums, int i, int j){
        int temp = 0;
        temp = nums[i];
        nums[i] =nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums){
        int low =0;
        int mid =0;
        int high = nums.length-1;
        while(mid<high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid]==1) {
                mid++;
            } else if(nums[mid]==2) {
                swap(nums, mid, high);
                high--;
            }
        }
        for(int result : nums){
            System.out.print(result+ ", ");
        }
    }
}
public class LC75SortColors {
    public static void main(String[] args) {
        LC75 lc75 = new LC75();
        int[] nums = {2,0,2,1,1,0};
        lc75.sortColors(nums);
    }
}
