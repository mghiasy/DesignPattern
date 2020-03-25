package bank.domain;

public class SavingMoreThen5000 implements  SavingAccount{
    @Override
    public double calcInterest() {
        return  4;
    }
}
