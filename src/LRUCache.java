import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    private class DLLNode{
        int key;
        int val;
        DLLNode pre,nex;
        DLLNode(int key, int val){
            this.key = key;
            this.val = val;

        }
    }

    int size;
    DLLNode head;
    DLLNode tail;

    HashMap<Integer, DLLNode> hm= new HashMap<>();

    LRUCache(int size){
        this.size = size;
        this.head = new DLLNode(0,0);
        this.tail= new DLLNode(0,0);;
        this.head.pre = null;
        this.head.nex = this.tail;
        this.tail.pre = this.head;
        this.tail.nex = null;
    }

    public int get(int key){
        if(hm.containsKey(key)){
            DLLNode temp = hm.get(key);
            remove(temp);

            DLLNode newNode = new DLLNode(temp.key,temp.val);
            insert(newNode);

            return temp.val;
        }

        return -1;
    }

    public void put(int key, int val){
        if(hm.containsKey(key)){
            remove(hm.get(key));
        }
        if(hm.size()==size){
            remove(tail.pre);
        }

        insert(new DLLNode(key,val));
    }

    private void remove(DLLNode node) {
        hm.remove(node.key);
        node.pre.nex = node.nex;
        node.nex.pre = node.pre;
    }

    private void insert(DLLNode node) {
        hm.put(node.key, node);
        node.nex = head.nex;
        node.nex.pre = node;
        head.nex = node;
        node.pre = head;
    }
}
