import java.util.*;

class Printer{
    void print(String msg) {
        System.out.println(msg);
    }
}

class Instancemethod{
    public static void main(String[] args) {

        Printer printer = new Printer();
        List<String> data = Arrays.asList("Java", "Spring", "Boot");

        data.forEach(printer::print);
    }
}