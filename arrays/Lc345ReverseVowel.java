package arrays;

class Lc345 {
    boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) >= 0;
    }
    public String reverseVowel(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length - 1;
        while (left <= right) {
            if (!isVowel(str[left])) {
                left++;
            } else if (!isVowel(str[right])) {
                right--;
            } else {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
        return new String(str);
    }
}

public class Lc345ReverseVowel {
    public static void main(String[] args) {
        String s = "IceCreAm";
        Lc345 lc345 = new Lc345();
        System.out.println(lc345.reverseVowel(s));
    }
}
