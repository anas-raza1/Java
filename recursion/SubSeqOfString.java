public class SubSeqOfString {

    static void subSeqOfString(String str, String result){
        if(str.length()==0){
            System.out.print(result+" , ");
            return;
        }
        //not take it
        subSeqOfString(str.substring(1), result);
        //take it
        subSeqOfString(str.substring(1), result+str.charAt(0));
    }
    public static void main(String[] args) {
        subSeqOfString("abc", " ");
    }
}