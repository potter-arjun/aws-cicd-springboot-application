package com.dkr.firstDkr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dkr.firstDkr.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>{

}
