package com.stockers.digital.model;

public class Stockers {
	
	private int totalAssociatedCompany;
	
	private int totalGainersToday;
	
	private int totalLosersToday;
	
	private Company[] companies;
	
	public Stockers(int totalAssociatedCompany) {
		this.totalAssociatedCompany = totalAssociatedCompany;
		this.companies = new Company[totalAssociatedCompany];
	}

	public int getTotalAssociatedCompany() {
		return totalAssociatedCompany;
	}


	public void setTotalAssociatedCompany(int totalAssociatedCompany) {
		this.totalAssociatedCompany = totalAssociatedCompany;
	}

	public Company[] getCompanies() {
		return companies;
	}


	public int getTotalGainersToday() {
		return totalGainersToday;
	}


	public void setTotalGainersToday(int totalGainersToday) {
		this.totalGainersToday = totalGainersToday;
	}


	public int getTotalLosersToday() {
		return totalLosersToday;
	}

	public void setTotalLosersToday(int totalLosersToday) {
		this.totalLosersToday = totalLosersToday;
	}

}
