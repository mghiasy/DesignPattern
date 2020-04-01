package bank.domain;

public class DepositCommand implements IBankCommands{
    private Account account;
    double amount;

    public DepositCommand(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void unexecute() {
        account.withdraw(amount);
    }
}
