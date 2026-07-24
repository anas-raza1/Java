public class ClimbStairs {
    static int climbStairs(int n){
        if(n<=1){
            return n;
        }
        int count1 = climbStairs(n-1);
        int count2 = climbStairs(n-2);
        return count1 + count2;
    }
    public static void main(String[] args) {
        int result = climbStairs(3);
        System.out.println(result);
    }
}