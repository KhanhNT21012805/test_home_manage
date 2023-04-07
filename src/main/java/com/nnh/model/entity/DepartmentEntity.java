package com.nnh.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class DepartmentEntity extends BaseEntity{
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "thumbnail")
	private String thumbnail;
	
	@Column(name = "price")
	private Integer price;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private CityEntity cityDepartment;
	
	@OneToOne(mappedBy = "department")
	private BookingEntity booking;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public CityEntity getCityDepartment() {
		return cityDepartment;
	}

	public void setCityDepartment(CityEntity cityDepartment) {
		this.cityDepartment = cityDepartment;
	}

	public BookingEntity getBooking() {
		return booking;
	}

	public void setBooking(BookingEntity booking) {
		this.booking = booking;
	}
	
	
}
