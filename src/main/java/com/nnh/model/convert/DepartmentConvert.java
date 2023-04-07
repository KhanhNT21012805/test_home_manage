package com.nnh.model.convert;

import org.springframework.stereotype.Component;

import com.nnh.model.dto.DepartmentDTO;
import com.nnh.model.entity.DepartmentEntity;

@Component
public class DepartmentConvert {
	public static DepartmentEntity toEntity(DepartmentDTO dto) {
		DepartmentEntity entity = new DepartmentEntity();
		entity.setTitle(dto.getTitle());
		entity.setDescription(dto.getDescription());
		entity.setThumbnail(dto.getThumbnail());
		entity.setPrice(dto.getPrice());
		
		return entity;
	}
	
	public static DepartmentEntity toEntity(DepartmentDTO dto, DepartmentEntity oldEntity) {
		DepartmentEntity entity = new DepartmentEntity();
		entity.setId(dto.getId());
		entity.setTitle(dto.getTitle());
		entity.setDescription(dto.getDescription());
		entity.setThumbnail(dto.getThumbnail());
		entity.setPrice(dto.getPrice());
		entity.setCreatedBy(oldEntity.getCreatedBy());
		entity.setCreatedDate(oldEntity.getCreatedDate());
		
		return entity;
	}
	
	public static DepartmentDTO toDto(DepartmentEntity entity) {
		DepartmentDTO dto = new DepartmentDTO();
		dto.setId(entity.getId());
		dto.setTitle(entity.getTitle());
		dto.setDescription(entity.getDescription());
		dto.setThumbnail(entity.getThumbnail());
		if(entity.getCityDepartment() != null) {
			dto.setCityName(entity.getCityDepartment().getName());
		}
		dto.setPrice(entity.getPrice());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		
		return dto;
	}
}
