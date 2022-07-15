package by.epam.learn.transfer.bean;

import by.epam.learn.transfer.action.Rounder;

public class Account {
    private long accountId;
    private float asset;
    //constructor without parameters:
    public Account() {
        /*if class is declared without constructor,
        then compiler will provide it in this form*/
    }
    //constructor with parameters:

    public Account(long accountId) {
        super();/* access to superclass is explicitly optional, compiler
                will add it automatically*/
        this.accountId = accountId;
    }

    public Account(long accountId, float asset) {
        this.accountId = accountId;
        this.asset = asset;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public float getAsset() {
        return asset;
    }

    public void setAsset(float asset) {
        this.asset = asset;
    }

    public void addAsset(float transActionAsset) {
        asset += transActionAsset;
        asset = Rounder.round(asset, 2);
    }

    @Override
    public String toString() {
        return "account#" + accountId +
                " ($" + asset + ")";
    }
}
