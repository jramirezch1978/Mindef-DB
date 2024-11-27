package com.mindefdb.services;

import java.util.List;

import com.mindefdb.dtos.CompanyDTO;
import com.mindefdb.dtos.DepartmentDTO;
import com.mindefdb.dtos.EmployeeDTO;

import jakarta.validation.Valid;

public interface ICompanyService {

	List<CompanyDTO> findAll();

	CompanyDTO findById(Long companyId);

	List<DepartmentDTO> findDepartmentsByCompanyId(Long companyId);

	DepartmentDTO createDepartment(Long companyId, DepartmentDTO departmentDTO);

	List<EmployeeDTO> findEmployeesByDepartmentId(Long companyId, Long departmentId);

	EmployeeDTO createEmployee(Long companyId, Long departmentId, @Valid EmployeeDTO employeeDTO);

	EmployeeDTO findEmployeeById(Long companyId, Long departmentId, Long employeeId);

}
