package com.ltts.springproject;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	
	  @Query(value="SELECT price FROM booking WHERE ps_id=:ps_id", nativeQuery=true)
	  List<Booking> getBookingById(@Param("ps_id") long ps_id);
	 
}