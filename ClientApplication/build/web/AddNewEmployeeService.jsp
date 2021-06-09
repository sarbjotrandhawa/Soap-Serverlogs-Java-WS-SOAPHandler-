<%-- 
    Document   : AddNewEmployeeService
    Created on : 7 Jun, 2021, 11:21:52 PM
    Author     : macbookair
--%>

<%@page import="my.services.EmployeeImplService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = request.getParameter("Ename");
            String Dept = request.getParameter("department");
            String job = request.getParameter("job");
            String country = request.getParameter("country");

            EmployeeImplService employeeImplService = new EmployeeImplService();
            int row = employeeImplService.getEmployeeImplPort().addEmployee(name, Dept, job, country);

            if (row == 1) {
        %>
        <h1>Employee added Successfully!!!</h1>
        <%
    }
    else
    {
        %>
        <h1>Please check Data!!!</h1>
        <%
               
                    }
        %>

    </body>
</html>
