//#13 reading symbol from stream System.in
package by.epam.learn.console;

import java.io.IOException;

public class ReadCharMain {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.printf("Character Code: %c = %d", c, x);
        } catch (IOException e) {
            System.err.println("i\\o error" + e);
        }

    }
}
