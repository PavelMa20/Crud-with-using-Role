package servlet;

import exception.DBException;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = {"/"})
public class LoginServlet extends BaseServlet {
    @Override
    void doEX(HttpServletRequest request, HttpServletResponse response) throws IOException, DBException, ServletException, SQLException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        if (login == null || login.isEmpty() || password == null || password.isEmpty()) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");
            dispatcher.forward(request, response);
            return;
        }
        User user = userService.getUserByLogin(login);
        if (user == null || !user.getPassword().equals(password)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");
            request.setAttribute("login", null);
            request.setAttribute("password", null);
            request.setAttribute("message", "incorrect login or password");
            dispatcher.forward(request, response);
            return;
        }
        request.getSession().setAttribute("user", user);
        response.sendRedirect("filter");


    }
}
