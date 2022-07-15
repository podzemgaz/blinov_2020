//#6 output command line arguments to console
package by.epam.learn.arg;

public class PrintArgumentMain {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.printf("Argument --> %s%n", arg);
        }
    }
}
