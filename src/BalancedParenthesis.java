import java.util.Stack;

public class BalancedParenthesis {
    String str;
    BalancedParenthesis(String str){
        this.str = str;
    }

    public boolean valid(){
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stk.push(str.charAt(i));
            }else{
                Character top = stk.peek();
                if((str.charAt(i)==')' && top =='(' ) || (str.charAt(i)==']' && top =='[' ) || (str.charAt(i)=='}' && top =='{' )){
                    stk.pop();
                    continue;
                }else{
                    return false;
                }
            }
        }

        if(!stk.empty()){
            return false;
        }
        return true;

    }
}
