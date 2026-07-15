public class FactorialOfNum{
    static void factorial(int num, int result){
        if(num==1){
            System.out.println(result);
            return;
        }
        factorial(num-1, result*num);
    }
    static int factorial1(int num){
        if(num==1){
            return num;
        }
        int result = factorial1(num-1);
        return result *num;
    }
    public static void main(String[] args) {
        factorial(3,1);
        int fact = factorial1(5);
        System.out.println(fact);
    }
}