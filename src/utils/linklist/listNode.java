package utils.linklist;

public class listNode {
    int val;
    listNode next;

    listNode(){
        this(0, null);
    }

    listNode(int val){
        this(val, null);
    }

    listNode(int val, listNode node){
        this.val = val;
        this.next = node;
    };
}
