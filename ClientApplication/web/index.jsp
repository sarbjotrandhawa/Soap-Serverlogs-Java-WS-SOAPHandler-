<%-- 
    Document   : index
    Created on : 7 Jun, 2021, 9:34:59 PM
    Author     : macbookair
--%>

<%@page import="java.util.List"%>
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
            <a href="ShowAllEmployees.jsp"> Display All Employees</a>
            <br><br><br>
            <h3>Add a new Employee</h3>
            <form action ="AddNewEmployeeService.jsp">
                <table>
                    <tr><td>Employee Name: </td>
                        <td><input type="text" name="Ename" required/></td>
                    </tr>
                    <tr><td>Employee Department </td>
                        <td><input type="text" name="department" required/></td>
                    </tr>
                    <tr><td>Employee Job: </td>
                        <td><input type="text" name="job" required/></td>
                    </tr>
                    <tr><td>Employee Country </td>
                        <td><select name="country" >
                                <%

                                    EmployeeImplService employeeImplService = new EmployeeImplService();
                                    List<String> countries = employeeImplService.getEmployeeImplPort().getAllCountries();

                                    for (String s : countries) {
                                %>
                                <option><%=s%></option>
                                <%}%>
                            </select></td>
                    </tr>

                    <tr><td></td><td><input type="submit" value ="Add"></td></tr>
                    <table>

                      
                        </form>

                        <br><br><br><br>
                        <form action="ShowEmployeeById.jsp">
                            <table><tr><td>Search Employee</td><td><input type="text" name ="id" placeholder=" Enter Employee Id" required></td>
                                    <td><input type="submit" value="Search"></td></tr></table>

                        </form>


                        <%String msg2 = request.getParameter("msg2");
                            if (msg2 != null) {
                        %>
                        <h1 style="color: red" ><%=msg2%></h1>
                        <%
                            }
                        %>

                        </div>

                        </body>
                        </html>
