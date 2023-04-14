package com.nnh.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	@OneToMany(mappedBy = "department")
	private List<BookingEntity> bookings;
	
	@OneToMany(mappedBy = "departmentComment")
	private List<CommentEntity> comments = new ArrayList<CommentEntity>();
	
	

	public List<CommentEntity> getComments() {
		return comments;
	}

	public void setComments(List<CommentEntity> comments) {
		this.comments = comments;
	}

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

	public List<BookingEntity> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingEntity> bookings) {
		this.bookings = bookings;
	}
	
	
	
}
