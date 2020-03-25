package with.templatemethod;

public abstract class PaymentProcessor {

	protected void proccessPayment(double amount, String currency, Customer customer) {
		double convertedAmount;
		convertedAmount=convert(amount,currency);
		processConvertedPayment(customer,convertedAmount);
		validate();

	}

	private double convert(double amount,String currency){
		double dollarAmount = amount;

		if (currency.contentEquals("EUR")) { // European Euro
			dollarAmount = amount * 1.1;
			System.out.println("Convert "+amount+" "+currency+" to US dollars");

		}
		if (currency.contentEquals("INR")) { // Indian Rupee
			dollarAmount = amount * 0.014;
			System.out.println("Convert "+amount+" "+currency+" to US dollars");

		}
		return dollarAmount;
	}
	
	public abstract boolean validate();
	public abstract void processConvertedPayment(Customer customer, double dollarAmount);

}
