//reading line from console
package by.epam.learn.console;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        System.out.println("Enter name and press <Enter> & number and press <Enter>");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.printf("Hello, %s!%n", name);
        int num = scan.nextInt();
        System.out.printf("num = %d%n", num);
        scan.close();
    }
}
