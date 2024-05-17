package utils.linklist;

import java.util.Objects;

public class linkList {
    public listNode head = null;
    private boolean briefPrint = true;

    linkList(int[] arr, boolean bfp){
        briefPrint = bfp;
        if (Objects.isNull(arr) || arr.length==0) return;
        var dummyHead = new listNode();
        var tail = dummyHead;
        listNode tmp;
        for (var x: arr) {
            tmp = new listNode(x);
            tail.next = tmp;
            tail = tmp;
        }
        head = dummyHead.next;
    }

    linkList(int[] arr){
        this(arr, true);
    }

    linkList(){
        this(null, true);
    }

    public listNode getHead() {
        return head;
    }

    public boolean isEmpty(){
        return Objects.isNull(head);
    }

    private int getNum(){
        int num = 0;
        var p = head;
        while (!Objects.isNull(p)){
            num++;
            p = p.next;
        }
        return num;
    }

    public void setBriefPrint(boolean b){
        briefPrint = b;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        if (briefPrint) sb.append(this.getClass().getName());
        sb.append(String.format("(%d): ", getNum()));
        var p = head;
        while (!Objects.isNull(p)){
            if (p!=head) sb.append(" -> ");
            sb.append(p.val);
            p = p.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 1, 5, 4, 9, 3};
        linkList ls = new linkList(a);
        System.out.println(ls);
    }
}
