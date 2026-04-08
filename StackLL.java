package StackExercise;


    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    class myStack{
        Node head;
        int len;
        int peek(){
            return head.val;
        }
        int pop(){
            if(head==null) {
                System.out.println("stack is empty");
                return -1;
            }

                int x = head.val;
                head = head.next;
                len--;
                return x;



        }
        void push(int ele){
            Node temp = new Node(ele);
            if(len==0) head = temp;
            else {
                temp.next = head;
                head = temp;
            }
            len++;
        }
        int size(){
            return len;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
public class StackLL {
    public static void main(String[] args) {
        myStack s = new myStack();
        s.push(1);s.push(2);s.push(3);s.push(4);
        s.display();
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        s.display();
    }
}
