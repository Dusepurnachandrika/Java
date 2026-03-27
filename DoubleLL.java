import java.util.*;
public class DoubleLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int val){
            this.val =val;
        }
    }
    static class DLL{
        ListNode head;
        ListNode tail;
        int size;
        void insertathead(int val){
            ListNode temp = new ListNode(val);
            if(head==null) {head = tail =temp;
            return;}
            temp.next = head;
            head.prev = temp;
            head = temp;
            size++;
        }
        void insertattail(int val) {
            ListNode temp = new ListNode(val);
            if(tail==null) {head = tail = temp;
                return;}
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
            size++;
        }
        void deleteathead(){
            if (head == null) return;

            if (head == tail) {
                head = tail = null;
                return;
            }
            head = head.next;
            head.prev = null;
            size--;

        }
        void deleteattail(){
            if(tail==null) return;
            if(head==tail) {head = tail = null;
            return;}
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        void display(){
            ListNode temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void reverse(){
            ListNode temp = tail;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.prev;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertathead(40);
        list.insertathead(30);
        list.insertathead(20);
        list.insertathead(10);
        list.display();
        list.insertathead(50);
        list.insertathead(60);
        list.insertathead(70);
        list.display();
        list.deleteathead();
        list.deleteattail();
        list.display();
        list.reverse();

    }
}
