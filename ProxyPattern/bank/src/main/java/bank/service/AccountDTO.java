package bank.service;

import bank.domain.Account;
import bank.domain.AccountEntry;
import bank.domain.Customer;

import java.util.ArrayList;
import java.util.Collection;

public class AccountDTO {
    long accountnumber;
    Collection<AccountEntry> entryList = new ArrayList<AccountEntry>();
    Customer customer;

    public Collection<AccountEntry> getEntryList() {
        return entryList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public AccountDTO(long accountnumber, Collection<AccountEntry> entryList, Customer customer) {
        this.accountnumber = accountnumber;
        this.entryList = entryList;
        this.customer = customer;
    }

}
