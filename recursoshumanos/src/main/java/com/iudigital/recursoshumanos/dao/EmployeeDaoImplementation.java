package com.iudigital.recursoshumanos.dao;

import com.iudigital.recursoshumanos.exceptions.ApplicationExceptions;
import com.iudigital.recursoshumanos.models.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeDaoImplementation implements EmployeeDao {

    private static final String url = "jdbc:postgresql://localhost:5432/postgresDB";
    private static final String user = "postgres";
    private static final String password = "root";

    private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM employee";
    private static final String INSERT_EMPLOYEES = "INSERT INTO employee (id, typeIdentification, names, lastnames, maritalStatus, genre, address, telphone, dateBirth) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String DELETE_EMPLOYEES = "DELETE FROM employee WHERE id = ?";
    
    @Override
    public List<Employee> list() {
        List<Employee> employees = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, user, password); PreparedStatement statement = connection.prepareStatement(SELECT_ALL_EMPLOYEES)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setTypeId(resultSet.getString("typeidentification"));
                employee.setName(resultSet.getString("names"));
                employee.setLastName(resultSet.getString("lastnames"));
                employee.setMaritalStatus(resultSet.getString("maritalstatus"));
                employee.setGenre(resultSet.getString("genre"));
                employee.setAddress(resultSet.getString("address"));
                employee.setTelphone(resultSet.getString("telphone"));
                employee.setDateBirth(resultSet.getString("datebirth"));
                employees.add(employee);
            }
        } catch (SQLException e) {
            throw new ApplicationExceptions("Error in the take data", e);
        }
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        try (Connection connection = DriverManager.getConnection(url, user, password); PreparedStatement statement = connection.prepareStatement(INSERT_EMPLOYEES)) {
            statement.setInt(1, employee.getId());
            statement.setString(2, employee.getTypeId());
            statement.setString(3, employee.getName());
            statement.setString(4, employee.getLastName());
            statement.setString(5, employee.getMaritalStatus());
            statement.setString(6, employee.getGenre());
            statement.setString(7, employee.getAddress());
            statement.setString(8, employee.getTelphone());
            statement.setString(9, employee.getDateBirth());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new ApplicationExceptions("Error in create data", e);
        }
    }

    @Override
    public void deleteEmployee(int id) {
        try (Connection conn = DriverManager.getConnection(url, user, password); PreparedStatement stmt = conn.prepareStatement(DELETE_EMPLOYEES)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new ApplicationExceptions("Error in delete date", e);
        }
    }

}
