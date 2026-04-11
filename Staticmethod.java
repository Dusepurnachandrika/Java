import java.util.*;

class MathUtil{
    static void square(int n) {
        System.out.println(n * n);
    }
}

class Staticmethod{
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4);
        list.forEach(MathUtil::square);
    }
}