public class SwapDigit {
    public static void main(String[] args) {
        int num = 9246;
        int cpy =num;
        int count =0;
         while(cpy!=0){
            count++;
            cpy/=10;
        }
        int pow = (int)Math.pow(10, count-1);
        int firstDigit=num/pow;
        int lastDigit= num %10;
        num/=10;
        int pow2= (int)Math.pow(10, count-2);
        int middleNum = num % pow2;
        int result = lastDigit*pow +middleNum*10+firstDigit;

        System.out.println(firstDigit);
        System.out.println(lastDigit);
        System.out.println(middleNum);
        System.out.println(result);
    }
}
