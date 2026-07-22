public class RemoveDuplicateString{
    static String remDuplicate(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return remDuplicate(str.substring(1));
        }else{
            return str.charAt(0)+remDuplicate(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "aavvvddvvdss";
        System.out.println(remDuplicate(str));
    }
}