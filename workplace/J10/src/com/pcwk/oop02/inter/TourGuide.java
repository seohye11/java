package com.pcwk.oop02.inter;

public class TourGuide {
	
	//private Providable tour = new KoreaTour();
	private Providable tour = null;
	
	public TourGuide() {
		
	}
	//약한 결합 : koreaTour()인지 JapanTour()인지 알 필요가 없음
	public TourGuide(Providable tour) {
		this.tour = tour;
	}
	
	public void leisureSports() {
		tour.leisureSports();
	}
	
	public void sightseeing() {
		tour.sightseeing();
	}
	
	public void food() {
		tour.food();
	}

}
