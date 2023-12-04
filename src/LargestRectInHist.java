import java.util.Arrays;
import java.util.Stack;

public class LargestRectInHist {
    int[] nums;
    LargestRectInHist(int[] nums){
        this.nums = nums;

    }

    public int findMaxArea(){
        Stack<Integer> stk = new Stack<>();
        int len = nums.length;
        int preSmall[] = new int[len];
        for (int i = 0; i < len; i++) {
            while (!stk.isEmpty() && (nums[stk.peek()] >= nums[i])){
                stk.pop();
            }

            if(stk.isEmpty()){
                preSmall[i] = 0;
            }else{
                preSmall[i] = stk.peek()+1;
            }

            stk.push(i);
        }

        while(!stk.isEmpty()){
            stk.pop();
        }
        int nexSmall[] = new int[len];
        for (int i = len-1; i >= 0; i--) {
            while(!stk.isEmpty() && (nums[stk.peek()] >= nums[i])){
                stk.pop();
            }


            if(stk.isEmpty()){
                nexSmall[i] = len-1;
            }else{
                nexSmall[i] = stk.peek()-1;
            }

            stk.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < len; i++) {
            maxArea = Math.max(maxArea, (nexSmall[i] - preSmall[i]+1)*nums[i]);

        }

        return maxArea;
    }
}
