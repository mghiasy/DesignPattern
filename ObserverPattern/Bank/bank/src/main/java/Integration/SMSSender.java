package Integration;

import bank.domain.Account;

public class SMSSender implements IObserver {
    @Override
    public void update(Account account) {

        SendSMS(account);
    }
    public void SendSMS(Account account){
        System.out.println("Send SMS to customer "+account.getCustomer().getName()+" by accountNumber " + account.getAccountnumber());
    }
}
