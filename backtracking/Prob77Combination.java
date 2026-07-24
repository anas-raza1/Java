import java.util.*;

class Prob77 {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(1, n, k, smallList, finalList);
        return finalList;
    }

    void helper(int start, int n, int k, List<Integer> smallList, List<List<Integer>> finalList) {
        // base case
        if (k == smallList.size()) {
            finalList.add(new ArrayList<>(smallList));
            return;
        }
        // loop
        for (int i = start; i <= n; i++) {
            smallList.add(i);
            helper(i + 1, n, k, smallList, finalList);
            // backtracking
            smallList.remove(smallList.size() - 1);
        }
    }
}

public class Prob77Combination {
    public static void main(String[] args) {
        Prob77 ans = new Prob77();
        int n = 4;
        int k = 2;
        List<List<Integer>> result = ans.combine(n, k);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
