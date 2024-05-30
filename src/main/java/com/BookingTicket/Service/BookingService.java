package com.BookingTicket.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookingTicket.Entity.BookingEntity;
import com.BookingTicket.Repository.BookingRepository;
import com.BookingTicket.Repository.FirstAndSection;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository bookingRepository;
	
	public BookingEntity uploadData(BookingEntity bookingEntity)
	{
		BookingEntity updated=bookingRepository.save(bookingEntity);
		return updated;
	}
	
	public BookingEntity userId(Integer Id)
	{
		BookingEntity updated=bookingRepository.findByUserId(Id);
		return updated;
	}
	
	public List<FirstAndSection> userandsection()
	{
		List<FirstAndSection> updated=bookingRepository.findFirstandSection();
		return updated;
	}
	
	public String deleteUser(Integer id) {
		BookingEntity updated=bookingRepository.findByUserId(id);
		bookingRepository.delete(updated);
		return "Deleted";

		
	}
	
	
	public BookingEntity updateUser(BookingEntity bookingEntity, Integer Id)
	{
		
		BookingEntity latest=bookingRepository.findByUserId(Id);
		
		
		latest.setSection(bookingEntity.getSection());
		BookingEntity updated=bookingRepository.save(latest);
		return updated;
	}
	
	

}
