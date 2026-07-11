public class ArmstrongNum {
    public static void main(String[] args) {
        int num =153;
        int count =0;
        int cpy =num;
        int sum = 0;
        //count digits
        while(cpy!=0){
            count++;
            cpy/=10;
        }
        System.out.println("count: "+count);
        cpy=num;
        //check armstrong
        while(cpy!=0){
            int digit = cpy%10;
            sum = sum+(int)Math.pow(digit, count);
            cpy/=10;
        }
        System.out.println(sum==num?"Armstrong Number":"Not an Armstrong Number");
    }
}
