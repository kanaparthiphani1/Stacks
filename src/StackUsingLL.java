public class StackUsingLL {
    private class StackNode{
        int data;
        StackNode next;
        StackNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    StackNode top;
    int size;

    StackUsingLL(){
        this.top = null;
        this.size = 0;
    }

    public void push(int x){
        StackNode sn =new StackNode(x);
        sn.next = top;
        top = sn;
        this.size++;
    }

    public int pop(){
        int data = this.top.data;
        this.top = this.top.next;
        this.size--;
        return data;
    }

    public int printTop(){
        return this.top.data;
    }

    public void printStack(){
        StackNode temp = top;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("");
    }

}
