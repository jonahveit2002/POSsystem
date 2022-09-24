package PD;
import java.math.BigDecimal;
import java.util.*;
import java.time.*;

public class TaxCategory {

	private String category;
	private Collection<TaxRate> taxRates;

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Collection<TaxRate> getTaxRates() {
		return this.taxRates;
	}

	public void setTaxRates(Collection<TaxRate> taxRates) {
		this.taxRates = taxRates;
	}

	public TaxCategory() {
		// TODO - implement TaxCategory.TaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param category
	 */
	public TaxCategory(String category) {
		// TODO - implement TaxCategory.TaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public BigDecimal getTaxRateForDate(LocalDate date) {
		// TODO - implement TaxCategory.getTaxRateForDate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxRate
	 */
	public void addTaxRate(TaxRate taxRate) {
		// TODO - implement TaxCategory.addTaxRate
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement TaxCategory.toString
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxRate
	 */
	public void removeTaxRate(TaxRate taxRate) {
		// TODO - implement TaxCategory.removeTaxRate
		throw new UnsupportedOperationException();
	}

}