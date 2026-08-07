package arrays;

class Prob389{
    public char findTheDif(String s, String t){
        char r = 0;
        for(char e : s.toCharArray()){
            r^=e;
        }
        for(char e : t.toCharArray()){
            r^=e;
        }
        return r;
    }
}
public class Prob389Difference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        Prob389 pr389 = new Prob389();
        char result = pr389.findTheDif(s, t);
        System.out.println(result);
    }
}
