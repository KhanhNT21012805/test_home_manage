package com.nnh.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nnh.dal.service.IDepartmentService;
import com.nnh.model.dto.DepartmentDTO;

@CrossOrigin
@RestController
public class DepartmentAPI {
	@Autowired
	private IDepartmentService departmentService;
	
	@PostMapping("/department")
	public DepartmentDTO createModel(@RequestBody DepartmentDTO model) {
		return departmentService.save(model);
	}
	
	@PutMapping("/department/{id}")
	public DepartmentDTO updateModel(@RequestBody DepartmentDTO model, @PathVariable Long id) {
		model.setId(id);
		
		return departmentService.save(model);
	}
	
	@DeleteMapping("/department")
	public void deleteModel(@RequestBody Long[] ids) {
		departmentService.delete(ids);
	}
}
