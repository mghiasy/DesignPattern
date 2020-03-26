package bank.domain;

public class CheckingLessThan1000 implements CheckingAccount{
    @Override
    public double calcInterest() {
        return 1.5;
    }
}
