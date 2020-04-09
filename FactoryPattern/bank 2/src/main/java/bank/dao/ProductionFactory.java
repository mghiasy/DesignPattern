package bank.dao;

public class ProductionFactory implements MyFactory {
    @Override
    public IAccountDAO getAccountDAO() {
        return new AccountDAO();
    }

    @Override
    public IEmailSender getEmailSender() {
        return new EmailSender();
    }
}
