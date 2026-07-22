public class StringSearchReplace{
    static String repString(String str, char search, char replace ){
        if(str.length()==0){
            return "";
        }
        //small problem
        String r = repString(str.substring(1),search,replace);
        if(str.charAt(0)==search){
            return replace +r;
        }else
            return str.charAt(0)+r;
    }
    public static void main(String[] args) {
        String r = repString("Hello", 'l', 'x');
        System.out.println(r);
    }
}