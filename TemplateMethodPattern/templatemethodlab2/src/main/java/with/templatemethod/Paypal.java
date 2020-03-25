package with.templatemethod;

public class Paypal extends PaymentProcessor{
    private String paypalAddress;

    public String getPaypalAddress() {
        return paypalAddress;
    }

    public Paypal(String paypalAddress) {
        this.paypalAddress = paypalAddress;
    }

    public void setPaypalAddress(String paypalAddress) {
        this.paypalAddress = paypalAddress;
    }

    @Override
    public void processConvertedPayment(Customer customer, double dollarAmount) {
        boolean validation = validate();
        if (validation) {
            // logic to perform paypal payment
            System.out.println("Perform payment with paypal address "+getPaypalAddress()+" and amount $"+dollarAmount);

            // logic to notify customer
            System.out.println("Notify customer "+customer.getName()+" with email "+customer.getEmail()+" about paypal payment to address "+paypalAddress);
        }
    }
    	public boolean validate() {
		// logic to validate paypal address
		System.out.println("Validate paypal address "+getPaypalAddress());
		return true;
	}
}
