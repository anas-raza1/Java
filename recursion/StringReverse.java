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

    static void rev(String str, int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        rev(str, index-1);
}
    public static void main(String[] args) {
        String rev = revString("Anas");
        System.out.println(rev);
        String str = "Raza";
        rev(str, str.length()-1);
    }
}