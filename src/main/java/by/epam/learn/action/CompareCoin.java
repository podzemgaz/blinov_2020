//#11 method of comparison of instances by one field
package by.epam.learn.action;

import by.epam.learn.bean.Coin;

public class CompareCoin {
    public int compareDiameter(Coin first, Coin second) {
        double delta = first.getDiameter() - second.getDiameter();
        if (delta > 0) {
            return 1;
        } else if (delta < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
