import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(nums, smallList, finalList);
        return finalList;
    }

    static void helper(int[] nums, List<Integer> smallList, List<List<Integer>> finalList) {
        // base case
        if (nums.length == smallList.size()) {
            finalList.add(new ArrayList<>(smallList));
            return;
        }
        // small problem
        for (int i = 0; i < nums.length; i++) {
            if (!smallList.contains(nums[i])) {
                smallList.add(nums[i]);
                helper(nums, smallList, finalList);
                smallList.remove(smallList.size() - 1);
            }
        }
    }
}

public class Prob46Permutations {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = { 1, 2, 3 };

        List<List<Integer>> ans = sol.permute(nums);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}