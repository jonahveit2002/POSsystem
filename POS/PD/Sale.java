package PD;
import java.math.BigDecimal;
import java.time.*;

import java.util.*;

public class Sale {

	private LocalDateTime dateTime;
	private Boolean taxFree;
	private Collection<Payment> payments;
	private Collection<SaleLineItem> saleLineItems;

	public LocalDateTime getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Boolean getTaxFree() {
		return this.taxFree;
	}

	public void setTaxFree(Boolean taxFree) {
		this.taxFree = taxFree;
	}

	public Collection<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(Collection<Payment> payments) {
		this.payments = payments;
	}

	public Collection<SaleLineItem> getSaleLineItems() {
		return this.saleLineItems;
	}

	public void setSaleLineItems(Collection<SaleLineItem> saleLineItems) {
		this.saleLineItems = saleLineItems;
	}

	public Sale() {
		// TODO - implement Sale.Sale
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxFree
	 */
	public Sale(Boolean taxFree) {
		// TODO - implement Sale.Sale
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param payment
	 */
	public void addPayment(Payment payment) {
		// TODO - implement Sale.addPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param payment
	 */
	public void removePayment(Payment payment) {
		// TODO - implement Sale.removePayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sli
	 */
	public void addSalesLineItem(SaleLineItem sli) {
		// TODO - implement Sale.addSalesLineItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sli
	 */
	public void removeSaleLineItem(SaleLineItem sli) {
		// TODO - implement Sale.removeSaleLineItem
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcTotal() {
		// TODO - implement Sale.calcTotal
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcSubTotal() {
		// TODO - implement Sale.calcSubTotal
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcTax() {
		// TODO - implement Sale.calcTax
		throw new UnsupportedOperationException();
	}

	public BigDecimal getTotalPaymens() {
		// TODO - implement Sale.getTotalPaymens
		throw new UnsupportedOperationException();
	}

	public Boolean isPaymentEnough() {
		// TODO - implement Sale.isPaymentEnough
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amtTendered
	 */
	public void calcAmountForPayments(BigDecimal amtTendered) {
		// TODO - implement Sale.calcAmountForPayments
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcChange() {
		// TODO - implement Sale.calcChange
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcAmtTendered() {
		// TODO - implement Sale.calcAmtTendered
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Sale.toString
		throw new UnsupportedOperationException();
	}

}