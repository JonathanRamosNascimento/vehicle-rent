package model.services;

import model.entities.CarRental;

public class RentalService {
	
	private Double pricePerDay;
	private Double pricaPerHour;
	
	private BrazilTaxService taxService;

	public RentalService(Double pricePerDay, Double pricaPerHour, BrazilTaxService taxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricaPerHour = pricaPerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
	}

}
