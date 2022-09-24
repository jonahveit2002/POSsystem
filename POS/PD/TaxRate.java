package PD;
import java.math.BigDecimal;
import java.time.*;

public class TaxRate {

	private BigDecimal taxRate;
	private LocalDate effectiveDate;

	public BigDecimal getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	public LocalDate getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public TaxRate() {
		// TODO - implement TaxRate.TaxRate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param effectiveDate
	 * @param rate
	 */
	public TaxRate(LocalDate effectiveDate, BigDecimal rate) {
		// TODO - implement TaxRate.TaxRate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public Boolean isEffective(LocalDate date) {
		// TODO - implement TaxRate.isEffective
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxRate
	 */
	public int compareTo(TaxRate taxRate) {
		// TODO - implement TaxRate.compareTo
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement TaxRate.toString
		throw new UnsupportedOperationException();
	}

}