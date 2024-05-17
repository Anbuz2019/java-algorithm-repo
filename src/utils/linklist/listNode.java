package utils.linklist;

public class listNode {
    public int val;
    public listNode next;

    public listNode(){
        this(0, null);
    }

    public listNode(int val){
        this(val, null);
    }

    public listNode(int val, listNode node){
        this.val = val;
        this.next = node;
    };
}
