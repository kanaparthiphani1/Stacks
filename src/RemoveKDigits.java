import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        int len1 = num.length();
        if(k == 0)  return num;
        if(k == len1) return "0";

        Stack<Character> stk = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!stk.empty() && (stk.peek()>Integer.valueOf(num.charAt(i)))){
                if(k>0){

                    stk.pop();
                    k--;
                }else{
                    break;
                }
            }

            stk.push(num.charAt(i));

        }
        while(k-- > 0) stk.pop();

        String sol = "";
        int len =stk.size();
        for(int i=0;i<len;i++){
            sol = stk.pop() + sol;
        }

        while(sol.length() > 1 && sol.charAt(0) == '0')
            sol = sol.substring(1);


        return sol;

    }
}
