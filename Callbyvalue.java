package Basics;

public class Callbyvalue {
    void display(int value){
        value++;
        System.out.println(value +" in display time");
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number +" before call");
        Callbyvalue obj = new Callbyvalue();
        obj.display(number);
        System.out.println(number+" after call");
    }
}
