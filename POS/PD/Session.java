package PD;
import java.math.BigDecimal;
import java.time.*;
import java.util.*;

public class Session {

	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;
	private Cashier cashier;
	private Collection<Sale> sales;
	private Register register;

	public LocalDateTime getStartDateTime() {
		return this.startDateTime;
	}

	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public LocalDateTime getEndDateTime() {
		return this.endDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}

	public Cashier getCashier() {
		return this.cashier;
	}

	public void setCashier(Cashier cashier) {
		this.cashier = cashier;
	}

	public Collection<Sale> getSales() {
		return this.sales;
	}

	public void setSales(Collection<Sale> sales) {
		this.sales = sales;
	}

	public Register getRegister() {
		return this.register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public Session() {
		// TODO - implement Session.Session
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cashier
	 * @param register
	 */
	public Session(Cashier cashier, Register register) {
		// TODO - implement Session.Session
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sale
	 */
	public void addSale(Sale sale) {
		// TODO - implement Session.addSale
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sale
	 */
	public void removeSale(Sale sale) {
		// TODO - implement Session.removeSale
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cash
	 */
	public BigDecimal calcCashCountDiff(BigDecimal cash) {
		// TODO - implement Session.calcCashCountDiff
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcTotal() {
		// TODO - implement Session.calcTotal
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Session.toString
		throw new UnsupportedOperationException();
	}

}