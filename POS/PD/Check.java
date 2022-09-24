package PD;

public class Check extends AuthorizedPayment {

	private String routingNumber;
	private String accountNumber;
	private String checkNumber;

	public String getRoutingNumber() {
		return this.routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public Check() {
		// TODO - implement Check.Check
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 * @param accountNumber
	 */
	public Check(String amount, String accountNumber) {
		// TODO - implement Check.Check
		throw new UnsupportedOperationException();
	}

	public Boolean isAuthorized() {
		// TODO - implement Check.isAuthorized
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Check.toString
		throw new UnsupportedOperationException();
	}

}