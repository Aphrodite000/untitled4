import java.util.Stack;

public class solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<=0){
            return null;
        }
        Stack<ListNode> stack=new Stack<>();
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
            count++;
        }
        if(count<k){
            return null;
        }
        for(int i=1;i<k;i++){
            stack.pop();
        }
        return stack.pop();
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
