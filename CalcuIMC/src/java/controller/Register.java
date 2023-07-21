package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.user;
import util.BMIUtil;

@WebServlet(name="register", urlPatterns={"/register"})
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fullName = request.getParameter("fullName");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("sex");
        double height = Double.parseDouble(request.getParameter("height"));
        double weight = Double.parseDouble(request.getParameter("weight"));


        if (!BMIUtil.isValidHeight(height) || !BMIUtil.isValidAge(age)) {
   
            response.sendRedirect("error.jsp");
            return;
        }


        user user = new user();
        user.setFullName(fullName);
        user.setAge(age);
        user.setSex(sex);
        user.setHeight(height);
        user.setWeight(weight);
        user.setBmi(BMIUtil.calculateBMI(height, weight));

        user.setBmiDate(java.time.LocalDate.now().toString());


        request.getSession().setAttribute("user", user);


        response.sendRedirect("bmi.jsp");
    }
}

