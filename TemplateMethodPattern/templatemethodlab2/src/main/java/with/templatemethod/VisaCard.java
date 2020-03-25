package with.templatemethod;

public class VisaCard  extends PaymentProcessor{
	private String creditCardNumber;
	private String customerName;
	private String validDate;
	private int securityCode;

	public VisaCard(String creditCardNumber, String customerName, String validDate, int securityCode) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.customerName = customerName;
		this.validDate = validDate;
		this.securityCode = securityCode;
	}

	@Override
	public void processConvertedPayment(Customer customer, double dollarAmount) {
		boolean validation = validate();
		if (validation) {
			// logic to perform payment visa card
			System.out.println("Perform payment with visa card with card number " + getCreditCardNumber()
					+ " and amount $" + dollarAmount);

			// logic to notify customer
			System.out.println("Notify customer " + customer.getName() + " with email " + customer.getEmail()
					+ " about visa credit card payment with card number " + getCreditCardNumber());
		}
	}

	@Override
	public boolean validate() {
		// logic to validate visa card
		System.out.println("Validate visa card with card number " + getCreditCardNumber());
		return true;
	}


	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

}
