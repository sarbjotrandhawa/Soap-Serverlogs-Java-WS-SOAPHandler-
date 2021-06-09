<%-- 
    Document   : ShowEmployeeById
    Created on : 8 Jun, 2021, 12:31:26 AM
    Author     : macbookair
--%>

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
            <h3>Employee Record</h3>
            <table border="1">
                <tr><th>Emp No.</th><th>Emp. Name</th><th>Department</th><th>Emp Job</th><th>Country</th></tr>
                        <%
                            int id = Integer.parseInt(request.getParameter("id"));
                            EmployeeImplService employeeImplService = new EmployeeImplService();
                            Employee employee = employeeImplService.getEmployeeImplPort().getEmployeeByID(id);
                            if (null != employee) {
                        %>
                <tr><td><%=employee.getEmpNo()%></td><td><%=employee.getEmpName()%></td><td><%=employee.getDepartment()%></td>
                    <td><%=employee.getEmpJob()%></td><td><%=employee.getCountry()%></td></tr>

                <%} else {
                        response.sendRedirect("index.jsp?msg2= No Employee Record found!!!");
                    }
                %>

            </table>
        </div>
    </body>
</html>
