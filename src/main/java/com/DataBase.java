package com;

import java.sql.*;

public class DataBase {
    String insert_user = "INSERT into user (first_name, last_name, age, login, password) VALUES (?,?,?,?,?)";
    String select_user = "SELECT * FROM USER WHERE login = ?";

    public void addUser(Person person) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/users", "root", "23081996ZHEnia");
             PreparedStatement preparedStatement = conn.prepareStatement(insert_user)) {
            preparedStatement.setString(1, person.getFirstName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setString(3, person.getAge());
            preparedStatement.setString(4, person.getLogin());
            preparedStatement.setString(5, person.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean checkLogin(Person person) {
        boolean status = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/users", "root", "23081996ZHEnia");
             PreparedStatement preparedStatement = conn.prepareStatement(select_user)) {
            preparedStatement.setString(1, person.getLogin());
            ResultSet resultSet = preparedStatement.executeQuery();
            status = resultSet.next();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return status;
    }

    public Person helloPerson(Person person) {
        Person personInfo = new Person();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/users", "root", "23081996ZHEnia");
             PreparedStatement preparedStatement = conn.prepareStatement(select_user)) {
            preparedStatement.setString(1, person.getLogin());
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                personInfo.setFirstName(resultSet.getString("first_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personInfo;
    }
}
