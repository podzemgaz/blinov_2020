package by.epam.learn.main;

import by.epam.learn.order.MutableType;

public class Test {

    public static void main(String[] args) {
        final Integer TEST_FINAL_INT = 167;
        Integer i = TEST_FINAL_INT;
        final MutableType mutable = new MutableType(14);

        MutableType dipop = mutable;
        Integer numji = dipop.getCoreMutaType();

        System.out.println(numji);
    }
}
