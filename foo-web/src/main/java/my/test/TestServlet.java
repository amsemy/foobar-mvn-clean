package my.test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class TestServlet extends HttpServlet {

    @EJB
    TestBean testBean;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<html><head><title>TestServlet</title><body>");
        out.print("<h1>TestServlet</h1><h3>");
        out.print(testBean.getTestValue());
        out.print("</h3></body></html>");
    }

}
