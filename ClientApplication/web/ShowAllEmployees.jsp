<%-- 
    Document   : ShowAllEmployees
    Created on : 7 Jun, 2021, 11:44:00 PM
    Author     : macbookair
--%>

<%@page import="java.util.List"%>
<%@page import="my.interfaces.Employee"%>
<%@page import="my.services.EmployeeImplService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div align="center">
        <h1>Employee Management System</h1>
        <br><br>
        <h3>All Employees Record</h3>
           <table border="1">
               <tr><th>Emp No.</th><th>Emp. Name</th><th>Department</th><th>Emp Job</th><th>Country</th></tr>
        <%
        EmployeeImplService employeeImplService = new EmployeeImplService();
        List<Employee> employees= employeeImplService.getEmployeeImplPort().getAllEmployees();
        for(Employee e : employees)
        {
        %>
               <tr><td><%=e.getEmpNo()%></td><td><%=e.getEmpName()%></td><td><%=e.getDepartment()%></td>
                   <td><%=e.getEmpJob()%></td><td><%=e.getCountry()%></td></tr>
     
               <%}%>
            
        </table>
       </div>
     
    </body>
</html>
