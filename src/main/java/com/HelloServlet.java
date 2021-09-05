package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    Person person = new Person();
    DataBase db = new DataBase();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/hello-page.jsp").forward(request, response);
        request.getSession().getAttribute("person");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String login = request.getParameter("login");
//        String password = request.getParameter("password");
//        person.setLogin(login);
//        person.setPassword(password);
//        db.helloPerson(person);
    }
}
