import java.util.Stack;

public class NextSmallerElement {
    int[] nums;
    int size;
    NextSmallerElement(int[] nums){
        this.nums = nums;
        this.size = nums.length;
    }

    public int[] nextSmall(){
        Stack<Integer> stk = new Stack<>();
        int[] nextSmall = new int[this.size];
        for (int i = this.size-1; i >=0 ; i--) {
            while (!stk.empty() && stk.peek() >= nums[i]){
                stk.pop();
            }

            if(!stk.empty()){
                nextSmall[i]=stk.peek();
            }else{
                nextSmall[i] = -1;
            }

            stk.push(nums[i]);
        }

        return nextSmall;
    }
}
