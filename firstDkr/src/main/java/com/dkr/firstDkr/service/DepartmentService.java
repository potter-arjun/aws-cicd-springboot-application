package com.dkr.firstDkr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.dkr.firstDkr.entity.Department;
import com.dkr.firstDkr.repo.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo departmentRepo;

	public List<Department> createDepartment(List<Department> departments) {

		return departmentRepo.saveAll(departments);

	}

	public List<Department> getDepartment(Long departId) {

		List<Department> departments = new ArrayList<>();
		if(ObjectUtils.isEmpty(departId)) {
			return departmentRepo.findAll();

		}else {
			departments.add(departmentRepo.findById(departId).get());
			return departments;
		}

	}

}
