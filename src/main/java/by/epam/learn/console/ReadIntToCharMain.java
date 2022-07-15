//reading int and convert it to char
package by.epam.learn.console;

import java.util.Scanner;

public class ReadIntToCharMain {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        char c = (char) x;
        System.out.printf("Symbol: %d = %c", x, c);
        scanner.close();
    }
}
