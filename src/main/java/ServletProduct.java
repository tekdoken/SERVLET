import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletProduct", value = "/display-discount")
public class ServletProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    //    Product : Mô tả của sản phẩm
//    List Price: Giá niêm yết của sản phẩm
//    Discount Percent: Tỷ lệ chiết khấu (phần trăm)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Description = request.getParameter("Description");
        double Price = Double.parseDouble(request.getParameter("Price"));
        double Percent = Double.parseDouble(request.getParameter("Percent"));
        double DiscountAmount=(Price*Percent)*0.01;
        PrintWriter writer= response.getWriter();

        writer.println("<h1>Product Description: "+Description +"</h1>");
        writer.println("<h1>"+Price+"</h1>");
        writer.println("<h1>"+Percent+"</h1>");

        writer.println("<h1>Discount Amount: "+DiscountAmount+"</h1>");
        writer.println("<h1>Discount Price: "+(Price-DiscountAmount)+"</h1>");
    }
}
