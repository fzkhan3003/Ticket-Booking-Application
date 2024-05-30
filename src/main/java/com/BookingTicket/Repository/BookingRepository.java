package com.BookingTicket.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.BookingTicket.Entity.BookingEntity;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Integer>{
	
	BookingEntity findByUserId(Integer userId);
	
    @Query("SELECT u.first AS first, u.section AS section FROM BookingEntity u")
	List<FirstAndSection> findFirstandSection();
	

}
