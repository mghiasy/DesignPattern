package with.templatemethod;

public class Application {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Frank Brown", "fbrown@gmail.com");
		VisaCard visaCard = new VisaCard("1111 2222 3333 4444", "Frank Brown", "09/2026",112);

		visaCard.proccessPayment(125.75, "USD", customer1);
		
		System.out.println("------------------------------------");
		
		Customer customer2 = new Customer("John Doe", "jdoe@gmail.com");
		Paypal paypal = new Paypal("jdoe@gmail.com");
		paypal.proccessPayment(175000.0, "INR",customer2);

	}
}
