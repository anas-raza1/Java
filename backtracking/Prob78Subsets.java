import java.util.*;

class Soluti {
   public List<List<Integer>> subsets(int[] nums) {
      List<Integer> smallList = new ArrayList<>();
      List<List<Integer>> bigList = new ArrayList<>();
      helper(nums, smallList, bigList, 0);
      return bigList;
   }

   void helper(int[] nums, List<Integer> smallList, List<List<Integer>> bigList, int index) {
      // fake base case
      if (index > nums.length) {
         return;
      }
      // add smallList into bigList
      bigList.add(new ArrayList<Integer>(smallList));
      for (int i = index; i < nums.length; i++) {
         // if(!smallList.contains(nums[i])){
         smallList.add(nums[i]);
         helper(nums, smallList, bigList, i + 1);
         // backtracking
         smallList.remove(smallList.size() - 1);
         // }
      }
   }
}

public class Prob78Subsets {
   public static void main(String[] args) {
      Soluti sol = new Soluti();
      int[] nums = { 1, 2, 3 };
      List<List<Integer>> ans = sol.subsets(nums);
      for (List<Integer> list : ans) {
         System.out.println(list);
      }
   }
}