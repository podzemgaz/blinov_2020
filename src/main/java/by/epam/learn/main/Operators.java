package by.epam.learn.main;

import static java.lang.Integer.toBinaryString;

public class Operators {
    public static void main(String[] args) {
        float f = 1;
        int y = 3;
        float r = f / (y * y);
        System.out.printf("r = %f%n", r);

        int b1 = 0b1110; // 14
        int b2 = 0b1001; // 9
        int i = 0;
        System.out.println(toBS(b1) + " | " + toBS(b2) + " = " + toBS(b1 | b2));
        System.out.println(toBS(b1) + " & " + toBS(b2) + " = " + toBS(b1 & b2));
        System.out.println(toBS(b1) + " ^ " + toBS(b2) + " = " + toBS(b1^b2) + " (исключающее или)");
        System.out.println( "~" + toBS(b2) + " = " + toBS(~b2));
        System.out.println(toBS(b1) + " >> " + ++i + " = " + toBS(b1>>i));
        System.out.println(toBS(b1) + " << " + i + " = " + toBS(b1<<i++));
        i = 5;
        System.out.println(toBS(b1) + " >>> " + i + " = " + toBS(b1>>>i) + " (сдвиг вправо с появлением нулей)");

        System.out.println("Логические операторы работают только со значениями boolean");

        int x = 0;
        y = 0;
        System.out.println( x++ == y++ || x++ != y++);
        System.out.println("x=" + x + ", y=" + y);
        System.out.println( x++ == y++ | x++ != y++);
        System.out.println("x=" + x + ", y=" + y);


    }

    private static String toBS(int n) {
        return toBinaryString(n);
    }

    private static int determineBonus(int numberProduct) {
        int bonus = numberProduct > 7 ? 10 : 0;

        return bonus;
    }

}
