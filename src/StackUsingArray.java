public class StackUsingArray {
    int top = -1;
    int []nums = new int[1000];

    public void push(int x){
        nums[++top] = x;
    }

    public int pop(){
        if(top!=-1){
            return nums[top--];
        }
        return -1;
    }

    public int top(){
        if(top==-1){
            return -1;
        }
        return nums[top];
    }
}
