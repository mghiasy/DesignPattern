package bank.domain;

public class WithdrawCommand implements IBankCommands{
    private Account account;
    double amount;

    public WithdrawCommand(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void unexecute() {
        account.deposit(amount);
    }
}
