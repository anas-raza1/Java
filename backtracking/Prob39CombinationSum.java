import java.util.ArrayList;
import java.util.List;

class CombinationSum{
    public List<List<Integer>> combinationSum(int [] candidates, int target){
        List<Integer> smallList= new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        helper(candidates, target, 0, smallList, bigList);
        return bigList;
    }
    void helper(int [] candidates, int target, int index, List<Integer> smallList, List<List<Integer>> bigList){
        //base case
        if(target == 0){
            bigList.add(new ArrayList<>(smallList));
            return;
        }
        if(target<0){
            return;
        }
        //iteration
        for(int i = index; i<candidates.length; i++){
            smallList.add(candidates[i]);   //modification
            helper(candidates,target - candidates[i], i, smallList, bigList);
            //backtracking stack fall
            smallList.remove(smallList.size()-1);
        }
    }
}

public class Prob39CombinationSum {
    public static void main(String[] args) {
        CombinationSum cSum = new CombinationSum();
        int [] candidates = {2,3,5};
        int target = 8;
        List<List<Integer>> result = cSum.combinationSum(candidates,target);
        for(List<Integer> ans : result){
            System.out.print(ans);
        }
    }
}
