public class CountNumOfZero{
    static int countZero(int num){
        if(num ==0){
            return 0;
        }
       int count = countZero(num/10);
       int digit = num %10;
       return count+(digit==0?1:0);
    }
    public static void main(String[] args) {
        int count= countZero(1030043020);
        System.out.println(count);
    }
}