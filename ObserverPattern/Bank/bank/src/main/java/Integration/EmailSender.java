package Integration;

import bank.domain.Account;

public class EmailSender implements IObserver{
    @Override
    public void update(Account account) {
        SendEmail(account);
    }
    public void SendEmail(Account account){
        System.out.println("Send email to customer "+account.getCustomer().getName()+" by accountNumber " + account.getAccountnumber());
    }
}
