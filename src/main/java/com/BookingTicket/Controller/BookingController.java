package com.BookingTicket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookingTicket.Entity.BookingEntity;
import com.BookingTicket.Repository.FirstAndSection;
import com.BookingTicket.Service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	//@PostMapping("/data/{FirstName}/lastname/{LastName}/email/{Email}/from/{From}/to/{To}/price/{Price}")
	@PostMapping("/data")
	public BookingEntity bookTicket(@RequestBody BookingEntity bookingEntity)
	{
		BookingEntity updated=bookingService.uploadData(bookingEntity);
		return updated;
	}
	
	@GetMapping("/get/{Id}")
	public BookingEntity getById(@PathVariable Integer Id)
	{
		BookingEntity userId= bookingService.userId(Id);
		return userId;
	}
	
	@GetMapping("/user/seat")
	public List<FirstAndSection> getUserandSection(){
		List<FirstAndSection> getall=this.bookingService.userandsection();
		return getall;
	}
	
	@DeleteMapping("/delete/{Id}")
	public String deleteUser(@PathVariable Integer Id) {
		String s=bookingService.deleteUser(Id);
		return s;
	}
	
	@PutMapping("/update/{Id}")
	public BookingEntity updateSeat(@RequestBody BookingEntity bookingEntity,@PathVariable Integer Id) {
		
		BookingEntity updateUser = bookingService.updateUser(bookingEntity, Id);
		return updateUser;
		
	}
	
	
	
	
	

}
