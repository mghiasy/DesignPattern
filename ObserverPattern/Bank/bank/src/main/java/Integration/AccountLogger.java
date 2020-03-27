package Integration;

import bank.domain.Account;

public class AccountLogger implements IObserver{
    @Override
    public void update(Account account) {
        log(account);
    }
    public void log(Account account){
        System.out.println("Log for customer "+account.getCustomer().getName()+" by accountNumber " + account.getAccountnumber());
    }
}
