package com.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookings")
@Component
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	
	private int busNumber;
	
	private String boardingStation;
	
	@Column(name = "Dest_Station")
	private String destinationStation;
	
	private int passengers;
	
	private String travelDate;
	
	private String email;
	
	public Booking() {
	}
	
	public Booking(int busNumber, String boardingStation, String destinationStation, int passengers, String date,
			String email) {
		super();
		this.busNumber = busNumber;
		this.boardingStation = boardingStation;
		this.destinationStation = destinationStation;
		this.passengers = passengers;
		this.travelDate = date;
		this.email = email;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
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
		return "Booking [bookingId=" + bookingId + ", busNumber=" + busNumber + ", boardingStation=" + boardingStation
				+ ", destinationStation=" + destinationStation + ", passengers=" + passengers + ", travelDate="
				+ travelDate + ", email=" + email + "]";
	}

}
