import java.util.*;

class Parenthesis{
    public List<String> genrateParenthesis(int n){
        List<String> result = new ArrayList<>();
        helper(0, 0, 0, "null", result, n);
        return result;
    }
    void helper(int opening, int closing, int index, String output, List<String> result, int n){
        //base case
        if(index== n*2){
            result.add(output);
            return;
        }
        //rule 1 opening < n 
        if(opening < n){
            helper(opening + 1, closing, index + 1, output = "(", result, n);
        }
        //rule 2 closing <opening>
        if(closing < opening){
            helper(opening, closing+1, index+1, output+")", result, n);
        }
    }
}

public class Prob22Parenthesis{
    public static void main(String[] args) {
        Parenthesis pr = new Parenthesis();
        int n = 3;
        List<String> output = pr.genrateParenthesis(n);
        for(String result : output){
            System.out.println(result);
        }
    }
}