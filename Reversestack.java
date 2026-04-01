package StackExercise;

import java.util.Stack;

public class Reversestack {
    private static void pushatbottom(Stack<Integer> s,int ele){
        if(s.size()==0){
            s.push(ele);
            return;
        }
        int top = s.pop();
        pushatbottom(s,ele);
        s.push(top);
    }
    private static void reverse(Stack<Integer> s){
        if(s.size()<=1)return;
        int top = s.pop();
        reverse(s);
        pushatbottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s);
        reverse(s);
        System.out.println(s);

    }
}
