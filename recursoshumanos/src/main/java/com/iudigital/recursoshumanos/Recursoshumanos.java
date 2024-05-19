package com.iudigital.recursoshumanos;

import com.iudigital.recursoshumanos.dao.EmployeeDao;
import com.iudigital.recursoshumanos.dao.EmployeeDaoImplementation;
import com.iudigital.recursoshumanos.models.Employee;
import com.iudigital.recursoshumanos.ui.Inicio;
import java.util.List;
import java.util.Scanner;

public class Recursoshumanos {

    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        
        System.out.println("Listing tables");

        EmployeeDao employee = new EmployeeDaoImplementation();

        System.out.println("Register employee");
        
        Scanner scanner = new Scanner(System.in);
        Employee userEmployee = new Employee();
        
        int id = scanner.nextInt();
        userEmployee.setId(id);
        
        String typeId = scanner.nextLine();
        userEmployee.setTypeId(typeId);
        
        String name = scanner.nextLine();
        userEmployee.setName(name);
        
        String lastName = scanner.nextLine();
        userEmployee.setLastName(lastName);
        
        String maritalStatus = scanner.nextLine();
        userEmployee.setMaritalStatus(maritalStatus);
        
        String genre = scanner.nextLine();
        userEmployee.setGenre(genre);
        
        String address = scanner.nextLine();
        userEmployee.setAddress(address);
        
        String telphone = scanner.nextLine();
        userEmployee.setTelphone(telphone);
        
        String datebirth = scanner.nextLine();
        userEmployee.setDateBirth(datebirth);
        
        System.out.println(userEmployee);
        
        employee.addEmployee(userEmployee);
    }
}
