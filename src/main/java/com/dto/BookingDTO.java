package com.dto;

import org.springframework.stereotype.Component;

@Component
public class BookingDTO {
	
    private int busNumber;
	
	private String boardingStation;
	
	private String destinationStation;
	
	private int passengers;
	
	private String travelDate;
	
	private String email;
	
	public BookingDTO() {
	}
	
	public BookingDTO(int busNumber, String boardingStation, String destinationStation, int passengers,
			String travelDate, String email) {
		super();
		this.busNumber = busNumber;
		this.boardingStation = boardingStation;
		this.destinationStation = destinationStation;
		this.passengers = passengers;
		this.travelDate = travelDate;
		this.email = email;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public String getBoardingStation() {
		return boardingStation;
	}

	public void setBoardingStation(String boardingStation) {
		this.boardingStation = boardingStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "BookingDTO [busNumber=" + busNumber + ", boardingStation=" + boardingStation + ", destinationStation="
				+ destinationStation + ", passengers=" + passengers + ", travelDate=" + travelDate + ", email=" + email
				+ "]";
	}
	
	
}
