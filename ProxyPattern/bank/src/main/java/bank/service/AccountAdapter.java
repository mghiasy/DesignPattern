package bank.service;

import bank.dao.AccountDAO;
import bank.domain.Account;

public class AccountAdapter {
   private AccountDAO accountDAO ;
    public AccountDTO getAccountDTO(Account account){
        //Account loadedAccount=accountDAO.loadAccount(accountNumber);
        AccountDTO accountDTO= new AccountDTO(account.getAccountnumber(),account.getEntryList(),account.getCustomer());
        return accountDTO;
    }
    public AccountDTO getAccountDTObById(long accountNumber){
        Account loadedAccount=accountDAO.loadAccount(accountNumber);
        AccountDTO accountDTO= new AccountDTO(loadedAccount.getAccountnumber(),loadedAccount.getEntryList(),loadedAccount.getCustomer());
        return accountDTO;
    }
    public Account getAccount(AccountDTO accountDTO){
        Account account = new Account(accountDTO.accountnumber);
        account.setCustomer(accountDTO.getCustomer());
        return account;
    }
}
