import java.util.ArrayList;
import java.util.List;

class Solut {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] isVisited = new boolean[nums.length];
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        helper(nums, smallList, bigList, isVisited);
        return bigList;
    }

    void helper(int[] nums, List<Integer> smallList, List<List<Integer>> bigList, boolean[] isVisited) {
        // base case
        if (nums.length == smallList.size() && !bigList.contains(smallList)) {
            bigList.add(new ArrayList<>(smallList));
            return; // stack fall
        }
        // iteration
        for (int i = 0; i < nums.length; i++) {
            // modifications
            if (!isVisited[i]) {
                smallList.add(nums[i]);
                isVisited[i] = true;
                helper(nums, smallList, bigList, isVisited);
                // backtracking(undo)
                smallList.remove(smallList.size() - 1);
                isVisited[i] = false;
            }
        }
    }
}

public class Prob47Permutations {
    public static void main(String[] args) {
        Solut sol = new Solut();
        int[] nums = { 1, 1, 2 };
        List<List<Integer>> ans = sol.permuteUnique(nums);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}