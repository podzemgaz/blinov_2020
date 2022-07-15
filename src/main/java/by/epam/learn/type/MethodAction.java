package by.epam.learn.type;

public class MethodAction {
    public int numberParser (int number, int[] numbers) {
        String str = String.valueOf(number);
        int length = str.length();
        int n;
        for (int i = 0; i < length; i++) {
            char code = str.charAt(i);
            n = Character.digit(code, 10);
            numbers[i] = n;
        }
        return length;
    }
}
