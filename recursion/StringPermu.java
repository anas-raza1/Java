public class StringPermu {

    static void perm(String str, String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        for(int i =0; i<str.length();i++){
            char current = str.charAt(i);
            // abc = ab
            String newStr = str.substring(0,i) +str.substring(i+1);
            perm(newStr, result+current);
        }
    }
    public static void main(String[] args) {
        perm("abc", "");
    }
}