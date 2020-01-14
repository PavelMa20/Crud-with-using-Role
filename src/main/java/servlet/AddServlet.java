package servlet;

import exception.DBException;
import model.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = {"/admin/insert"})
public class AddServlet extends BaseServlet{


    @Override
    protected void doEX(HttpServletRequest request, HttpServletResponse response) throws IOException, DBException, SQLException {
        User newUser = new User(request.getParameter("name"), request.getParameter("password"),
                request.getParameter("login"),request.getParameter("role"));
        userService.addUser(newUser);
        response.sendRedirect("admin/list");
    }
}
