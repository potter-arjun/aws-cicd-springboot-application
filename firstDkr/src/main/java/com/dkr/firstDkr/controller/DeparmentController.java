package com.dkr.firstDkr.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dkr.firstDkr.entity.Department;
import com.dkr.firstDkr.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DeparmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/insert")
	public List<Department> createDepartment(@RequestBody List<Department> departments) {

		return departmentService.createDepartment(departments);

	}
	
	@GetMapping("/get-department")
	public List<Department> getDepartment(Long departId) {

		return departmentService.getDepartment(departId);

	}

}
