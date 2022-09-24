package PD;
import java.math.BigDecimal;
import java.time.*;

public class Price {

	private BigDecimal price;
	private LocalDate effectiveDate;
	private Item item;

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDate getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Price() {
		// TODO - implement Price.Price
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 * @param effectiveDate
	 */
	public Price(String price, String effectiveDate) {
		// TODO - implement Price.Price
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public Boolean isEffective(LocalDate date) {
		// TODO - implement Price.isEffective
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param quantity
	 */
	public BigDecimal calcAmountForQty(int quantity) {
		// TODO - implement Price.calcAmountForQty
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public int compareTo(Price price) {
		// TODO - implement Price.compareTo
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Price.toString
		throw new UnsupportedOperationException();
	}

}