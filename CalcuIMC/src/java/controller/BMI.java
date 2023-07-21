package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.user;

@WebServlet(name="bmi", urlPatterns={"/bmi"})
public class BMI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

          user user = (user) request.getSession().getAttribute("user");

        if (user == null) {

            response.sendRedirect("login.jsp");
            return;
        }

       request.getRequestDispatcher("bmi.jsp").forward(request, response);
    }
}
