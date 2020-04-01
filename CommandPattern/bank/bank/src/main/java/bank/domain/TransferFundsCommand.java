package bank.domain;

public class TransferFundsCommand implements IBankCommands{
    private Account fromAccount;
    private Account toAccount;
    private double amount;
    private String description;
    @Override
    public void execute() {
        fromAccount.transferFunds(toAccount, amount, description);
    }

    public TransferFundsCommand(Account account, Account toAccount, double amount, String description) {
        this.fromAccount = account;
        this.toAccount = toAccount;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public void unexecute() {
        fromAccount.transferFunds(fromAccount, amount, description);
    }
}
