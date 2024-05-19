package com.iudigital.recursoshumanos.dao;
import com.iudigital.recursoshumanos.models.Employee;
import java.util.List;

public interface EmployeeDao {
    List<Employee> list();
    void addEmployee(Employee employee);
    void deleteEmployee(int id);
}
