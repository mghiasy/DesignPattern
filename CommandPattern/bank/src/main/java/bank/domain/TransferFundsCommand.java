package bank.domain;

public class TransferFundsCommand implements IBankCommands{
    private Account account;
    private Account toAccount;
    double amount;
    String description;
    @Override
    public void execute() {
        account.transferFunds(toAccount, amount, description);
    }

    public TransferFundsCommand(Account account, Account toAccount, double amount, String description) {
        this.account = account;
        this.toAccount = toAccount;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public void unexecute() {
        account.transferFunds(account, amount, description);
    }
}
