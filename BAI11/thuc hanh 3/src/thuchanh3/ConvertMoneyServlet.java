package thuchanh3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Minh_Nguyen on  6/20/2019
 * @Project ${NAME}
 * @Email:
 */
@WebServlet(name = "ConvertMoneyServlet", urlPatterns = "/convert")
public class ConvertMoneyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Rate:" + rate + "</h1>");
        printWriter.println("<h1>USD:" + usd + "</h1>");
        printWriter.println("<h1>VND:" + vnd + "</h1>");
        printWriter.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
