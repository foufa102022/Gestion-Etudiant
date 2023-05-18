package com.example.projet1705;


import java.util.List;

import com.example.projet1705.model.UserDao;
import com.example.projet1705.model.Users;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.ServletException;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        UserDao stdDao = new UserDao();
        List<Users> users = stdDao.userList();

        req.setAttribute("users", users);




        this.getServletContext().getRequestDispatcher("/userList.jsp").forward(req , resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        int age = Integer.parseInt(request.getParameter("age"));
        String email = request.getParameter("email");
        String motdepasse = request.getParameter("motdepasse");

        UserDao stdDao = new UserDao();
        stdDao.addusers(new Users(-1, nom, prenom ,  age , email , motdepasse));

//        this.getServletContext().getRequestDispatcher("/userList.jsp").forward(request , response);
        doGet(request , response);
    }
}