package murach;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;

public class SurveyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String heardFrom = request.getParameter("heardFrom");
        String updates = request.getParameter("updates");
        String contactVia = request.getParameter("contactVia");

        User user = new User(firstName, lastName, email, heardFrom, updates, contactVia);
        request.setAttribute("user", user);

        // Gán tháng và năm hiện tại cho request
        LocalDate now = LocalDate.now();
        request.setAttribute("month", now.getMonthValue());
        request.setAttribute("year", now.getYear());

        getServletContext().getRequestDispatcher("/survey.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }
}
