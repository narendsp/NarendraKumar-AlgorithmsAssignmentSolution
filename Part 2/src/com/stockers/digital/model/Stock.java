package com.stockers.digital.model;

public class Stock {
	
	private double currentPrice;
	
	private boolean changeInPricePositive;

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public boolean isChangeInPricePositive() {
		return changeInPricePositive;
	}

	public void setChangeInPricePositive(boolean changeInPricePositive) {
		this.changeInPricePositive = changeInPricePositive;
	}

}
