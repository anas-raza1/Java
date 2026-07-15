public class PalindromeNum{

    static void palindromeNum(int num, int reverse, int cpy){
        //base case
        if(num==0){
            System.out.println(reverse==cpy?"palindrome":"Not palindrome");
            return;
        }
        //logic
        int digit = num%10;
        reverse = reverse*10+digit;
        //small problem
        palindromeNum(num/10,reverse,cpy);
    }

    static boolean palindrome2(int num,int reverse, int cpy){
          //base case
        if(num==0){
            return reverse==cpy;
        }
        //logic
        int digit = num%10;
        reverse = reverse*10+digit;
        //small problem
        return palindrome2(num/10,reverse,cpy);
    }
    public static void main(String[] args) {
        int num =151;
        int cpy = num;
        palindromeNum(num, 0, cpy);
        boolean r =  palindrome2(num, 0, cpy);
        System.out.println(r?"Palindrome":"Not Palindrome");
    }
}