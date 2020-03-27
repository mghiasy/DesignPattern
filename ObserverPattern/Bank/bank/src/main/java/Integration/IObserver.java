package Integration;

import bank.domain.Account;

public interface IObserver {
    void update(Account account);
}
