package bank.service.adapter;

import bank.domain.Account;
import bank.domain.AccountEntry;
import bank.service.dto.AccountDTO;
import bank.service.dto.AccountEntryDTO;
import bank.service.dto.CustomerDTO;

public class AccountAdapter {
    //should be static method and not relate to object
    public static AccountDTO getAccountDTO(Account account){
        //Account loadedAccount=accountDAO.loadAccount(accountNumber);
        AccountDTO accountDTO= new AccountDTO(account.getAccountnumber());
        //get customer from adapter
        CustomerDTO  customerDTO= CustomerAdapter.getCustomerDTO(account.getCustomer());
        accountDTO.setCustomer(customerDTO);

        for (AccountEntry accountEntry:account.getEntryList()) {
            AccountEntryDTO accountEntryDTO= AccountentryAdapter.getAccountEntryDto(accountEntry);
            accountDTO.addEntry(accountEntryDTO);
        }
        return accountDTO;
    }
}
