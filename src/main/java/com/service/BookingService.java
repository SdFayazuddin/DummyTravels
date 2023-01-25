package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookingDAO;
import com.dto.BookingDTO;
import com.entity.Booking;

@Service
public class BookingService {
	
	@Autowired
	BookingDAO bookingDAO;
	
	@Autowired
	BookingDTO bookingDTO;
	
	@Autowired
	Booking booking;
	
	public BookingDTO getBooking(int bookingId) {
		Booking booking = bookingDAO.findById(bookingId).orElse(new Booking());
		BeanUtils.copyProperties(booking, bookingDTO);
		return bookingDTO;
	}
	
	public List<BookingDTO> getBooking(String email) {
		List<Booking> bookingList = bookingDAO.findByEmail(email);
		List<BookingDTO> bookingDTOList = new ArrayList<>();
		for(int i=0; i<bookingList.size();i++) {
			BeanUtils.copyProperties(bookingList.get(i), bookingDTO);
			bookingDTOList.add(bookingDTO);
		}
		return bookingDTOList;
	}
	
	public void bookTicket(BookingDTO bookingDTO) {
		BeanUtils.copyProperties(bookingDTO, booking);
		bookingDAO.save(booking);
	}
	
	public void bookTicket(BookingDTO bookingDTO,int bookingId) {
		BeanUtils.copyProperties(bookingDTO, booking);
		booking.setBookingId(bookingId);
		bookingDAO.save(booking);
	}

}
