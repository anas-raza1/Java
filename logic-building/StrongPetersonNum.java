public class StrongPetersonNum {

    static int fact(int digit){
        int result =1;
        while(digit>0){
            result = result *digit;
            digit--;
        }
        return result;
    }
    public static void main(String[] args) {
        //sum of each digit factorial equal is to given number ex:145
        int num = 145;
        int cpy = num;
        int sum =0;
        while(cpy!=0){
        int digit = cpy%10;
        sum = sum + fact(digit);
        cpy/=10;
        }
        System.out.println(num==sum?"Strong Peterson Number":"Not Strong Peterson Number");
    }
}
