import java.util.ArrayList;
import java.util.List;

class LetterComb {
    String keys[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterComb(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<String>();
        } else {
            return helper(digits);
        }
    }

    public List<String> helper(String digits) {
        // base case
        if (digits.length() == 0) {
            List<String> list = new ArrayList<>();
            list.add(""); // traversable
            return list;
        }
        // new list
        List<String> newList = new ArrayList<>();
        char firstDigit = digits.charAt(0);
        int index = firstDigit - '0';
        String str = keys[index];
        // iteration
        for (int i = 0; i < str.length(); i++) {
            // small problem
            List<String> oldList = helper(digits.substring(1));
            for (int j = 0; j < oldList.size(); j++) {
                newList.add(str.charAt(i) + oldList.get(j));
            }
        }
        return newList;
    }
}

public class Prob17LetterComb {
    public static void main(String[] args) {
        LetterComb lc = new LetterComb();
        String digits = "23";
        List<String> result = lc.letterComb(digits);
        for (String ans : result) {
            System.out.println(ans);
        }
    }
}