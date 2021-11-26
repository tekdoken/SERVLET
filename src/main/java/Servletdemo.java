import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servletdemo", value = "/sum")
public class Servletdemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float a = Float.parseFloat(request.getParameter("a"));
        float b = Float.parseFloat(request.getParameter("b"));

        float sum = a + b;

        PrintWriter writer = response.getWriter();
        writer.println(sum);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String u = request.getParameter("a");
        String p = request.getParameter("b");
        if (u.equals("chào") && p.equals("admin")) {
            PrintWriter writer = response.getWriter();
            writer.println(u);
        }else{
            PrintWriter writer = response.getWriter();
            writer.println();
        }
    }
}
