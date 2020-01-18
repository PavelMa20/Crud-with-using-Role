package servlet;


import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/filter"})
public class FilterServlet extends BaseServlet {
    @Override
    void doEX(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = (User) request.getSession().getAttribute("user");
        if (user != null && user.getRole().equals("admin")) {
            response.sendRedirect("admin/list");
        } else if (user != null && user.getRole().equals("user")) {
            request.setAttribute("user", user);
            response.sendRedirect("user");
        } else {
            response.sendError(401, "incorrect role");
        }
    }
}
