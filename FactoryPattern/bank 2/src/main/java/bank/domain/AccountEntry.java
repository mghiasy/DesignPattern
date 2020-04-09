package bank.domain;

import java.util.Date;

//remove setter methods so make it immutable
public class AccountEntry {
	private Date date;
	private double amount;
	private String description;
	private String fromAccountNumber;
	private String fromPersonName;
	//static inner class--> no need
public static class Builder{
	//has the same attr of enclosing class
		private Date date;
		private double amount;
		private String description;
		private String fromAccountNumber;
		private String fromPersonName;
//we create setter methods here --> to be clear instead of set by the name of with
//************all of type Builder --> and return this***************
		//we do this for all setters of enclosing class
		public Builder withDate(Date date) {
			this.date = date;
			//so we can do method chaining
			return this;
		}

		public Builder withAmount(double amount) {
			this.amount = amount;
			return this;
		}

		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder withFromAccountNumber(String fromAccountNumber) {
			this.fromAccountNumber = fromAccountNumber;
			return this;
		}

		public Builder withFromPersonName(String fromPersonName) {
			this.fromPersonName = fromPersonName;
			return this;
		}
		//Also has a method build --> returns AccountEntry based on Builder
		public AccountEntry build(){
			return new AccountEntry(this);
		}
	}

//	public AccountEntry(Date date, double amount, String description, String fromAccountNumber, String fromPersonName) {
//		super();
//		this.date = date;
//		this.amount = amount;
//		this.description = description;
//		this.fromAccountNumber = fromAccountNumber;
//		this.fromPersonName = fromPersonName;
//	}

	//we use a constructor with builder instead on previous constructor
	public AccountEntry(Builder builder){
	//copy all the attrs from the builder
	    this.date=builder.date;
	    this.amount=builder.amount;
		this.description=builder.description;
		this.fromAccountNumber=builder.fromAccountNumber;
		this.fromPersonName=builder.fromPersonName;
	}
	public double getAmount() {
		return amount;
	}

	public Date getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public String getFromAccountNumber() {
		return fromAccountNumber;
	}

	public String getFromPersonName() {
		return fromPersonName;
	}
	
}
