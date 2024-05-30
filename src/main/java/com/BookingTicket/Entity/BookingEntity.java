package com.BookingTicket.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String first;
	private String last;
	private String email;
	private String source;
	private String destination;
	private Integer price;
	private String section;

	
	/*
	 * public BookingEntity(String first, String section) { this.first=first;
	 * this.section=section; }// TODO Auto-generated constructor stub }
	 * 
	 * public BookingEntity() {
	 * }
	 */
	/*public BookingEntity(Integer userId, String first, String last, String email, String source, String destination,
			Integer price, String section) {
		super();
		this.userId = userId;
		this.first = first;
		this.last = last;
		this.email = email;
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.section = section;
	}*/

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

}
