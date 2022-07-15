package by.epam.learn.type;

import java.util.Arrays;

public class MethodReturnMain {
    public static void main(String[] args) {
        MethodAction method = new MethodAction();
        int num = 739_015_438;
        int[] result = new int[10];
        int length = method.numberParser(num, result);
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
