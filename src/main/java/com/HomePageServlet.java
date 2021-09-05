package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class HomePageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/home-page.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataBase db = new DataBase();
        Person person = new Person();
        String login = request.getParameter("login");
        person.setLogin(login);
        db.checkLogin(person);
        if(db.checkLogin(person)){
            response.sendRedirect(request.getContextPath() + "/hello");
        }else{
            response.sendRedirect(request.getContextPath() + "/registration");
        }
        request.getSession().setAttribute("person",db.helloPerson(person));
    }
}