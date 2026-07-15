public class ArmStrongNum{
    static int countDigit(int num){
        if(num==0){
            return 0;
        }
        int count = countDigit(num/10);
        return count+1;
    }
    static void computeArmstrong(int num, int sum, int cpy, int count){
        if(num==0){
            System.out.println(sum==cpy?"ArmStrong Number":"Not ArmStrongNum");
            return;
        }
        int digit = num%10;
        int result =(int)Math.pow(digit, count);
        sum = sum+result;
        computeArmstrong(num/10, sum, cpy, count);
    }
    public static void main(String[] args) {
        int num = 153;
        int cpy = num;
        int count = countDigit(num);
        computeArmstrong(num, 0,cpy, count);
    }
}