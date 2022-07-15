package by.epam.learn.transfer.action;

import by.epam.learn.transfer.bean.Account;

public class TransferAction {
    private static int taxRate = 12; // static field
    private double amountTaxes; // non-static field

    public double getAmountTaxes() { // non-static method
        return amountTaxes;
    }

    public static void increaseTaxRate() { // static method
        //this cannot be used - the object does not exist
        //amountTaxes cannot be used - the object does not exist
        /*methods getAmountTaxes() and transferIntoAccount cannot be called*/
        taxRate++;
    }

    public boolean transferIntoAccount(float asset, Account from, Account to) {
        if (asset <= 0 || from == null || to == null) {
            throw new IllegalArgumentException();
        }
        boolean isDone = false;
        float demand = from.getAsset() - asset;
        demand = Rounder.round(demand, 2);
        if (demand >= 0) {
            from.setAsset(demand);
            to.addAsset(asset);
            isDone = true;
        }

        return isDone;
    }
}
