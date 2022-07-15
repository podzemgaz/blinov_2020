//low-quality way to create a method for transferring money from account to account
package by.epam.learn.transfer.action;

import by.epam.learn.transfer.bean.Account;

public class TransferActionLowQuality {
    private final Account from;
    private final Account to;
    private final float transActionAsset;
    private boolean isDone;

    public TransferActionLowQuality(Account from, Account to, float transActionAsset) {
        if (transActionAsset * 100 % 1 != 0) {
            System.err.println("asset = " + transActionAsset);
            throw new IllegalArgumentException();
        }
        if (transActionAsset > 0 && from != null & to != null) {
            this.transActionAsset = transActionAsset;
            this.from = from;
            this.to = to;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public boolean isDone() {
        return isDone;
    }
    public void transferAction() {
        float demand = from.getAsset() - transActionAsset;
        demand = Rounder.round(demand, 2);
        if (demand >= 0) {
            from.setAsset(demand);
            to.addAsset(transActionAsset);
            isDone = true;
        }
    }
}
