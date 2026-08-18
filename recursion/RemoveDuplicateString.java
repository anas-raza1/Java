public class RemoveDuplicateString{
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.print(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicate(str, idx+1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newString);
        }
    }

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
        String str = "aaaavvvddsvvdss";
        System.out.println(remDuplicate(str));

        removeDuplicate(str, 0, "");
    }
}