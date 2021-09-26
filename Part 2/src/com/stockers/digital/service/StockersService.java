package com.stockers.digital.service;

import com.stockers.digital.model.Company;
import com.stockers.digital.model.Stockers;

public interface StockersService {
	
	public int getNumberOfAssociatedCompanies(Stockers stockers);
	
	public Company[] getCompanies(Stockers stockers, boolean isStockPriceAscending);

	public int getNumberOfAssociatedCompanies(Stockers stockers, boolean isStockPriceIncreasedInd);
	
	public boolean searchStockPrice(Stockers stockers, double stockPrice);

}
