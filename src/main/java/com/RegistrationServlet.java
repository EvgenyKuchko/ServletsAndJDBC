package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    DataBase db = new DataBase();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/registration.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String age = request.getParameter("age");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setLogin(login);
        person.setPassword(password);
        db.addUser(person);
        response.sendRedirect(request.getContextPath() + "/home");
    }
}