import java.util.Stack;

public class MinStack {
    Stack<Integer> stk;
    int min;

    MinStack(){
        stk=new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val){
        if(stk.empty() || val>=min){
            stk.push(val);
            if(val<min){
                min = val;
            }

            return;
        }else{
            int temp = (2*val) - (min);
            min= val;
            stk.push(temp);
        }
    }

    public int pop(){
        if(stk.empty()) return -1;
        int temp = stk.pop();

        if(temp<min){
            int curMin = min;
            min = 2*min - temp;
            return curMin;
        }
        
        return temp;
    }
    
    public int top(){
        int temp = stk.peek();
        if(temp<min){
            return min;
        }
        return temp;
    }

    public int getMin(){
        return min;
    }
}
