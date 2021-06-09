/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.interfaces;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import my.models.Employee;

/**
 *
 * @author macbookair
 */
@WebService
public interface IEmployee {

    @WebMethod
    @WebResult(name = "employeeList")
    public List<Employee> getAllEmployees();

    @WebMethod
    @WebResult(name = "countriesList")
    public List<String> getAllCountries();

    @WebMethod
    @WebResult(name = "addEmployee")
    public int addEmployee(String name, String department, String job, String country);
    
    @WebMethod
    @WebResult(name = "getEmployeeById")
    public Employee getEmployeeByID(int id);

}
