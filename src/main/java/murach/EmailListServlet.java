package murach;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;

public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) action = "join";

        String url = "/index.jsp";

        if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            User user = new User(firstName, lastName, email, null, null, null);
            request.setAttribute("user", user);
            url = "/thanks.jsp";
        }

        // Gán tháng và năm hiện tại cho request
        LocalDate now = LocalDate.now();
        request.setAttribute("month", now.getMonthValue());
        request.setAttribute("year", now.getYear());

        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }
}
