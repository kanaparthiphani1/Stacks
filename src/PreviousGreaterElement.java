import java.util.Stack;

public class PreviousGreaterElement {
    int[] nums;
    int size;
    PreviousGreaterElement(int[] nums){
        this.nums = nums;
        this.size = nums.length;
    }

    public int[] prevGreater() {
        Stack<Integer> stk = new Stack<>();
        int[] prevGret = new int[this.size];
        for(int i =0;i<this.size-1;i++){
            while(!stk.empty() && (stk.peek() <= nums[i])){
                stk.pop();
            }

                if(stk.empty()){
                    prevGret[i] = nums[i];
                }else{

                    prevGret[i] = stk.peek();
                }

            stk.push(nums[i]);
        }
        return prevGret;
    }
}
