package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.BookingDTO;
import com.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@GetMapping("/get-booking/{bookingId}")
	public BookingDTO getBooking(@PathVariable int bookingId) {
		return bookingService.getBooking(bookingId);
	}
	
	@GetMapping("/get-bookings/{email}")
	public List<BookingDTO> getBooking(@PathVariable String email) {
		return bookingService.getBooking(email);
	}
	
	@PostMapping("/book-ticket")
	public String addBooking(@RequestBody BookingDTO bookingDTO) {
		bookingService.bookTicket(bookingDTO);
		return "Successfull";
	}
	
	@PutMapping("/update-ticket/{bookingId}")
	public String updateBooking(@RequestBody BookingDTO bookingDTO, @PathVariable int bookingId) {
		bookingService.bookTicket(bookingDTO,bookingId);
		return "Successfull";
	}

}
