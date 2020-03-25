package bank.domain;

public class SavingBetween1000and5000 implements  SavingAccount {
    @Override
    public double calcInterest() {
        return  2;
    }
}
