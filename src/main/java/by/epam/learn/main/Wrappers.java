package by.epam.learn.main;

import java.math.BigDecimal;
import java.math.MathContext;

public class Wrappers {
    public static void main(String[] args) {
        String arg = "042";

        try {
            int value1 = Integer.parseInt(arg);
            Integer value2 = Integer.valueOf(arg);
            Integer value3 = Integer.decode(arg);

            System.out.println("val1 = " + value1);
            System.out.println("val2 = " + value2);
            System.out.println("val3 = " + value3);
        } catch (NumberFormatException e) {
            System.err.println("invalid number format: " + arg + " : " + e);
        }
        System.out.println( Integer.valueOf("42", 8));
        System.out.println(Integer.valueOf("100010", 2));
        System.out.println(Integer.valueOf("22", 16));

        char ch0 = '7';
        Character ch1 = Character.valueOf(ch0);
        int value0 = Character.digit(ch0, 10); // Character into int, value0 will be 7
        int value1 = Character.digit(55, 10); // CodePoint into int, value1 will be 7
        int value2 = Character.getNumericValue(ch1);
        System.out.println("ch1 = " + ch1);
        System.out.println("value0 = " + value0);
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);

        Float f = 42F; // it will be correct (float)42 or 42F instead of 42
        Float f1 = Float.valueOf(42);
        Float f0 = Float.valueOf("42");// or valueOf("42f") or valueOf("42.0")

        System.out.printf("f = %f; f1 = %f; f2 = %f%n", f, f1, f0);

        // autoboxing & unboxing:
        Integer i = 420; // autoboxing
        ++i; // unboxing + operation + autoboxing
        int j = i; // unboxing

        System.out.println("j = " + j);

        Integer j1 = null; // the object is not instantiated ! This is not zero!
        try {
            int i1 = j1; // generating an exception at runtime
            System.out.println(i1);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        float res = 0.4f - 0.3f;
        System.out.println("Float to Int Bits 0.4f: " + Float.floatToRawIntBits(0.4f));
        float flo = 0.3f;
        System.out.println("flo = " + flo);
        System.out.println("res = " + res);
        double d = 0.4d - 0.3d;

        System.out.println("d = " + d);

        BigDecimal big1 = new BigDecimal("0.4");
        BigDecimal big2 = new BigDecimal("0.3");
        BigDecimal bigRes = big1.subtract(big2, MathContext.DECIMAL32);

        System.out.println("bigRes = " + bigRes);
        System.out.println("1 == 1f / 3 * 3 = " + (1 == 1f / 3 * 3));
        System.out.println("1.00000001f == 1.00000002f = " + (1.00000001f == 1.00000002f));
    }
}
