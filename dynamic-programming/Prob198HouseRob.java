
class Prob198{
    public int rob(int[] nums) {
        return rob(nums, 0);
    }

    public int rob(int[] money, int houseNo) {
        //base case
        if (houseNo >= money.length) {
            return 0;
        }
        //case 1 -rob first house then skip next house
        int choice1 = money[houseNo] + rob(money, houseNo + 2);

        //case 2 = skip current house, move to next house
        int choice2 = rob(money, houseNo + 1);

        int result = Math.max(choice1, choice2);
        return result;
    }
}

//memoziation top down
// class Solution {
//     public int rob(int[] nums) {
//         Integer[] cache = new Integer[nums.length];
//         return rob(nums, 0, cache);
//     }

//     public int rob(int[] money, int houseNo, Integer[] cache) {
//         //base case
//         if (houseNo >= money.length) {
//             return 0;
//         }
//         //check first doing case 1 or case 2
//         if (cache[houseNo] != null) {
//             return cache[houseNo];
//         }
//         //case 1 -rob first house then skip next house
//         int choice1 = money[houseNo] + rob(money, houseNo + 2, cache);

//         //case 2 = skip current house, move to next house
//         int choice2 = rob(money, houseNo + 1, cache);

//         int result = Math.max(choice1, choice2);
//         cache[houseNo] = result;
//         return result;
//     }
// }

//tabulation bottom up
// class Prob198 {
//     public int rob(int[] money) {
//         //edge cases
//         if(money== null || money.length==0){
//             return 0;
//         }
//         if(money.length==1){
//             return money[0];
//         }
//         int[] dp = new int[money.length];
//         dp[0] = money[0];
//         dp[1] = Math.max(money[0], money[1]);
//         for (int i = 2; i < dp.length; i++) {
//             int choice1 = dp[i - 2] + money[i];
//             int choice2 = dp[i - 1];
//             int result = Math.max(choice1, choice2);
//             dp[i] = result;
//         }
//         return dp[dp.length - 1];
//     }
// }
public class Prob198HouseRob {
    public static void main(String[] args) {
        Prob198 pr = new Prob198();
        int[] nums = {2, 7, 9, 3, 1};
        int result = pr.rob(nums);
        System.out.println(result);
    }
}
