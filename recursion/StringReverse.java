public class StringReverse{
    static String revString(String str){
        //base case
        if(str.length()==0){
            return "";
        }
        //small problem
        String smallString = revString(str.substring(1));
        char firstChar = str.charAt(0);
        return smallString+firstChar;
    }
    public static void main(String[] args) {
        String rev = revString("Anas");
        System.out.println(rev);
    }
}