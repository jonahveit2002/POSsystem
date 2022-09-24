package PD;
import java.math.BigDecimal;
import java.time.*;

import java.util.*;

public class Item {

	private String number;
	private String description;
	private Collection<UPC> uPCs;
	private Collection<SaleLineItem> saleLineItems;
	private Collection<Price> prices;
	private TaxCategory taxCategory;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<UPC> getUPCs() {
		return this.uPCs;
	}

	public void setUPCs(Collection<UPC> uPCs) {
		this.uPCs = uPCs;
	}

	public Collection<SaleLineItem> getSaleLineItems() {
		return this.saleLineItems;
	}

	public void setSaleLineItems(Collection<SaleLineItem> saleLineItems) {
		this.saleLineItems = saleLineItems;
	}

	public Collection<Price> getPrices() {
		return this.prices;
	}

	public void setPrices(Collection<Price> prices) {
		this.prices = prices;
	}

	public TaxCategory getTaxCategory() {
		return this.taxCategory;
	}

	public void setTaxCategory(TaxCategory taxCategory) {
		this.taxCategory = taxCategory;
	}

	public Item() {
		// TODO - implement Item.Item
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 * @param description
	 */
	public Item(String number, String description) {
		// TODO - implement Item.Item
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public void addPrice(Price price) {
		// TODO - implement Item.addPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public void removePrice(Price price) {
		// TODO - implement Item.removePrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param upc
	 */
	public void addUPC(UPC upc) {
		// TODO - implement Item.addUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param upc
	 */
	public void removeUPC(UPC upc) {
		// TODO - implement Item.removeUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public Price getPriceForDate(LocalDate date) {
		// TODO - implement Item.getPriceForDate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public BigDecimal getTaxRateForDate(LocalDate date) {
		// TODO - implement Item.getTaxRateForDate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 * @param quantity
	 */
	public BigDecimal calcAmountForDateQty(LocalDate date, int quantity) {
		// TODO - implement Item.calcAmountForDateQty
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Item.toString
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sli
	 */
	public void addSaleLineItem(SaleLineItem sli) {
		// TODO - implement Item.addSaleLineItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sli
	 */
	public void removeSaleLineItem(SaleLineItem sli) {
		// TODO - implement Item.removeSaleLineItem
		throw new UnsupportedOperationException();
	}

}