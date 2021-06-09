/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.services;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import my.models.Employee;

/**
 *
 * @author macbookair
 */
@WebService(endpointInterface = "my.interfaces.IEmployee")
@HandlerChain(file = "EmployeeImplService_handler.xml")
public class EmployeeImpl {

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();

        try {
            ResultSet rs = null;
            String query = "Select * from EMP";

            Connection con = initiateDbConnection();
            Statement statement = con.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                employees.add(new Employee(rs.getInt("EmpNo")+"", rs.getString("EmpName"), rs.getString("Department"), rs.getString("EmpJob"), rs.getString("Country")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
          
        return employees;
    }

    public List<String> getAllCountries() {
        List<String> countries = new ArrayList<>();

        try {
            ResultSet rs = null;
            String query = "Select * from Countries";

            Connection con = initiateDbConnection();
            Statement statement = con.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                countries.add(rs.getString("Country"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countries;
    }
    
      public Employee getEmployeeByID(int id) {
        Employee employee = null;

        try {
            ResultSet rs = null;
            String query = "Select * from EMP where EmpNo = ?";

            Connection con = initiateDbConnection();
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            rs = preparedStatement.executeQuery();

            if (rs.next()) {
             employee = new Employee(rs.getInt("EmpNo")+"", rs.getString("EmpName"), rs.getString("Department"), rs.getString("EmpJob"), rs.getString("Country"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return employee;
    }

    public int addEmployee(String name, String department, String job, String country) {
        Employee emp = new Employee();
        emp.setCountry(country);
        emp.setEmpName(name);
        emp.setDepartment(department);
        emp.setEmpJob(job);

        int row = 0;

        try {

            String query = "insert into EMP(EmpName,Department,EmpJob,Country) values(?,?,?,?)";

            Connection con = initiateDbConnection();

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, department);
            preparedStatement.setString(3, job);
            preparedStatement.setString(4, country);

            row = preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;

    }

    private Connection initiateDbConnection() {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_URL, db_Username, db_Password;
            db_URL = "jdbc:mysql://localhost:3306/As2_Sarbjot?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false";
            db_Username = "root";
            db_Password = "12345678";

            con = DriverManager.getConnection(db_URL, db_Username, db_Password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
