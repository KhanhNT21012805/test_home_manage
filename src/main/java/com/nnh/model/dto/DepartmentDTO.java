package com.nnh.model.dto;

public class DepartmentDTO extends AbstractDTO<DepartmentDTO>{
	private String title;
	private String description;
	private String thumbnail;
	private Integer price;
	private String cityCode;
	private String cityName;
	private Integer cPage;
	private Integer dPage = 7;
	private Integer tPage;
	
	public Integer getcPage() {
		return cPage;
	}
	public void setcPage(Integer cPage) {
		this.cPage = cPage;
	}
	public Integer getdPage() {
		return dPage;
	}
	public void setdPage(Integer dPage) {
		this.dPage = dPage;
	}
	public Integer gettPage() {
		return tPage;
	}
	public void settPage(Integer tPage) {
		this.tPage = tPage;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
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
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	
	
}
