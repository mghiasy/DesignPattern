package bank.domain;

public class SavingLessThen1000 implements  SavingAccount{
    @Override
    public double calcInterest() {
        return 1;
    }
}
