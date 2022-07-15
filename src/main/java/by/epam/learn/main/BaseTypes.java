package by.epam.learn.main;

public class BaseTypes {
    public static void main(String[] args) {
        int i = 42;//integer
        int oct = 042;//octal
        int hex = 0x42b;//hexadecimal
        int bin = 0b101010;//binary
        System.out.printf("42 = %d; 042 = %d; 0x42b = %d; 0b101010 = %d%n", i, oct, hex, bin);
        long l = 0xffffl;
        System.out.printf("0xffffl = %d%n", l);
        int value = 4_200_000;
        System.out.printf("4_200_000 = %d%n", value);
        byte b = 1;
        final byte B = 100;
//        b = B + 28;//compile error
        byte valueByte = 42;
//        valueByte = valueByte + 86;//compile error
        valueByte += 86;
        System.out.printf("(byte)(42 + 86) = %d%n", valueByte);

        int height = 2;
        {
            int width = 3;
            System.out.printf("width = %d%n", width);
        }
//        int rectangleArea = height * width; // width is not initialized
        var counter = 1;
        counter++;
        var name = "Nikola";
        name += "s";
        System.out.printf("counter = %d, name = %s%n", counter, name);
    }
}
