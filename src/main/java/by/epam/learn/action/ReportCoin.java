package by.epam.learn.action;

import by.epam.learn.bean.Coin;

public class ReportCoin {
    public void reportCompareDiameterCoin (Coin first, Coin second) {
        CompareCoin compare = new CompareCoin();
        int result = compare.compareDiameter(first, second);
        double delta = first.getDiameter() - second.getDiameter();
        switch (result) {
            case 1 -> System.out.printf("The first coin is more than the second for %.2f%n", delta);
            case -1 -> System.out.printf("The second coin is more than the first for %.2f%n", -delta);
            default -> System.out.println("Coins have the same diameter");
        }
    }
}
