package com.nnh.controller.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nnh.dal.service.IDepartmentService;
import com.nnh.model.dto.DepartmentDTO;
import com.nnh.model.dto.UserDTO;

import jakarta.servlet.http.HttpSession;

@Controller
public class Web {
	@Autowired
	private IDepartmentService departmentService;
	
	@GetMapping("/trang-chu")
	public String getView(Model model) {
		model.addAttribute("department", new DepartmentDTO());
		model.addAttribute("departmentsVietnam", departmentService.findAllInVietNam());
		model.addAttribute("departmentsForeign", departmentService.findAllInForeign());
		
		return "web/home";
	}
	
	@PostMapping("/tim-kiem")
	public String getSearch(@ModelAttribute("department") DepartmentDTO departmentDTO, Model model) {
		List<DepartmentDTO> departments = departmentService.findAllByCityName(departmentDTO.getCityName());
		model.addAttribute("departments", departments);
		
		return "web/searchPage";
	}
}
