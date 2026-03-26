import java.util.*;
public class Enumset {
    enum e { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ };
    public static void main(String[] args) {
        EnumSet<e> s1,s2,s3,s4;
        s1 = EnumSet.of(e.CODE,e.CONTRIBUTE,e.QUIZ);
        s2 = EnumSet.allOf(e.class);
        s3 = EnumSet.complementOf(s1);
        s4 = EnumSet.range(e.CODE,e.QUIZ);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        EnumSet<e> obj = EnumSet.allOf(e.class);
        System.out.println(obj);
        EnumSet<e> g1 = EnumSet.allOf(e.class);
        EnumSet<e> g2 = EnumSet.noneOf(e.class);
        g2.add(e.CODE);
        System.out.println(g2);
        g2.addAll(g1);
        System.out.println(g2);
        Iterator<e> i = g1.iterator();

        System.out.print("EnumSet: ");

        while (i.hasNext()) {

            // Iterating and printing elements to
            // the console using next() method

            System.out.print(i.next());
            System.out.println(", ");
        }
        boolean b = g1.remove(e.CODE);

        System.out.println("Is CODE removed? " + b);

        // Using removeAll() and storing the boolean result
        boolean b2 = g1.removeAll(g1);

        System.out.println("Are all elements removed? "
                + b2);
    }
}
