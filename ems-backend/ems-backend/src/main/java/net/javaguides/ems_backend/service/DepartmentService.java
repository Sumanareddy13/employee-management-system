package net.javaguides.ems_backend.service;

import net.javaguides.ems_backend.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    DepartmentDto createDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentById(Long DepartmentService);

    List<DepartmentDto> getAllDepartments();

    DepartmentDto updateDepartment(Long departmentId, DepartmentDto updateDepartment);

    void deleteDepartment(Long departmentId);
}
