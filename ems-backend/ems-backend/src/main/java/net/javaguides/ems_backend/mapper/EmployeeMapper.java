package net.javaguides.ems_backend.mapper;

import net.javaguides.ems_backend.dto.EmployeeDto;
import net.javaguides.ems_backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        //Long departmentId = (employee.getDepartment() != null) ? employee.getDepartment().getId() : null;
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                //departmentId
                employee.getDepartment().getId()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());
        return employee;
    }

}

