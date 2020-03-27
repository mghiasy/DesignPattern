package bank.service;

import Integration.IObserver;
import bank.domain.Account;

import java.util.ArrayList;
import java.util.Collection;

public interface ISubject {
     Collection<IObserver> observerList = new ArrayList<IObserver>();
     void removeObserver(IObserver observer);
     void addObserver(IObserver observer);
     void doNotify(Account account);
}
