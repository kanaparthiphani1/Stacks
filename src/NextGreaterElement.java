import java.util.Stack;

public class NextGreaterElement {
    int[] nums;
    int size;
    NextGreaterElement(int[] nums){
        this.nums = nums;
        this.size = nums.length;
    }

    public int[] nextGreater(){
        Stack<Integer> stk = new Stack<>();
        int[] nextgret = new int[this.size];
        for(int i =(2*nums.length-1);i>=0;i--){
            while(!stk.empty() && (stk.peek() <= nums[i%this.size])){
                stk.pop();
            }
            if(i<this.size){
                if(stk.empty()){
                    nextgret[i] = -1;
                }else{

                    nextgret[i] = stk.peek();
                }
            }

            stk.push(nums[i%this.size]);
        }
        return nextgret;
    }
}
