
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter write =response.getWriter();
        write.println("<h1>login error</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter write =response.getWriter();
        write.println("<html>");
        if ("admin".equals(username)&&"admin".equals(password)){
            write.println("<h1>welcome"+username+" to website</h1>");
        }else{
            write.println("<h1>login error</h1>");
        }
        write.println("</html>");
    }
}
