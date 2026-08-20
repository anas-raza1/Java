import java.util.HashSet;

public class SubsequenceUnique {
    
    public static void printSeq(String str, String newStr, HashSet<String> set){
        if(str.length()==0){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        // not to take it
        printSeq(str.substring(1), newStr, set);
        //take it
        printSeq(str.substring(1), newStr + str.charAt(0), set);
    }
    public static void main(String[] args) {
        String str = "aaa ";
        HashSet<String> set = new HashSet<>();
        printSeq(str, "", set); 
    }
}
