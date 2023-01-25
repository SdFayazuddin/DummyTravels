package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Booking;

public interface BookingDAO extends JpaRepository<Booking, Integer>{
	
	public List<Booking> findByEmail(String email);
}
