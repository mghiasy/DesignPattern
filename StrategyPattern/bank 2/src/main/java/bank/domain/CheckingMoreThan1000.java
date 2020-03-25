package bank.domain;

public class CheckingMoreThan1000 implements CheckingAccount{
    @Override
    public double calcInterest() {
        return 2.5;
    }
}
