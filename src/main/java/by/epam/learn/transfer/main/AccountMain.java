package by.epam.learn.transfer.main;

import by.epam.learn.transfer.action.TransferAction;
import by.epam.learn.transfer.action.TransferActionLowQuality;
import by.epam.learn.transfer.bean.Account;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account(1, 50);
        Account account2 = new Account(2, 100);
        TransferActionLowQuality taLQ = new TransferActionLowQuality(account2, account1, 2);
        taLQ.transferAction();
        message(taLQ, account1, account2);
        taLQ = new TransferActionLowQuality(account2, account1, 0.17f);
        taLQ.transferAction();
        message(taLQ, account1, account2);
        taLQ = new TransferActionLowQuality(account2, account1, 0.75f);
        taLQ.transferAction();
        message(taLQ, account1, account2);

        messageTransAction(37.50f, account1, account2);
        messageTransAction(15.43f, account2, account1);
    }

    private static void message(TransferActionLowQuality actionLowQuality, Account account1, Account account2) {
        System.out.println("operation success: " + actionLowQuality.isDone());
        System.out.println("acc1 = " + account1.getAsset() + "; acc2 = " + account2.getAsset());
    }

    /*
        ==transfer==
        from:
            account
                id:
                asset:
        to:
            account
                id:
                asset:
        amount:
        success:
        --------
        result:
     */

    private static void messageTransAction (float asset, Account from, Account to) {
        TransferAction transAction = new TransferAction();
        /*System.out.println("transfer from account" + from.getAccountId()
                + " to account" + to.getAccountId() + ", amount = " + asset);
        System.out.println("operation success: " + transAction.transferIntoAccount(asset, from, to));
        System.out.println("account" + from.getAccountId() + " asset = " + from.getAsset());
        System.out.println("account" + to.getAccountId() + " asset = " + to.getAsset());*/
        StringBuilder sb = new StringBuilder("==transfer==\n").append("from: ")
                .append(from).append("\nto: ").append(to)
                .append("\namount: ").append(asset).append("\nsuccess: ")
                .append(transAction.transferIntoAccount(asset, from, to))
                .append("\n==result==\n").append(from).append("\n").append(to);

        System.out.println(sb);
    }
}
