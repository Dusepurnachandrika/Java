package StackExercise;

import java.util.Stack;

public class Stackex {
    private static void pushatbottom(Stack<Integer> s,int ele){
        if(s.size()==0){
            s.push(ele);
            return;
        }
        int top = s.pop();
        pushatbottom(s,ele);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        int ele = 100;
        pushatbottom(s,ele);
        System.out.println(s);
    }
}
