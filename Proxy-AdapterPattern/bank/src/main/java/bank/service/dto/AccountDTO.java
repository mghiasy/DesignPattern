package bank.service.dto;

import java.util.ArrayList;
import java.util.Collection;

//Since it contains Customer and list of AccountEntry, we should create both of them in DTO
//so we need to transfer from Customer to CustomerDTO and AccountEntry to AccountEntryDto -> we need 3 Adapter
public class AccountDTO {
    long accountnumber;
    //relation with AccountEntryDTO
    Collection<AccountEntryDTO> entryList = new ArrayList<AccountEntryDTO>();
    //relation with CustomerDTO
    CustomerDTO customer;

    public AccountDTO(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public Collection<AccountEntryDTO> getEntryList() {
        return entryList;
    }

    public void addEntry(AccountEntryDTO entry) {
        entryList.add(entry);
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

}
