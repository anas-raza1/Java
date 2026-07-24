import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solutio {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, 0, smallList, bigList);
        return bigList;
    }

    void helper(int[] nums, int index, List<Integer> smallList, List<List<Integer>> bigList) {
        if (!bigList.contains(smallList)) {
            bigList.add(new ArrayList<>(smallList));
        }
        for (int i = index; i < nums.length; i++) {
            smallList.add(nums[i]);
            helper(nums, i + 1, smallList, bigList);
            smallList.remove(smallList.size() - 1);
        }
    }
}

public class Prob90Subsets {
    public static void main(String[] args) {
        Solutio sol = new Solutio();
        int[] nums = { 1, 2, 2 };
        List<List<Integer>> ans = sol.subsetsWithDup(nums);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}