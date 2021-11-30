package bai11_bt1.controller;

import bai11_bt1.model.Product;
import bai11_bt1.service.ProductService;
import bai11_bt1.service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    ProductService productService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showSaveProduct(request, response);
                break;
            case "edit":
                showEditProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            default:
                showListProduct(request, response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                saveProduct(request, response);
                break;
                case "edit":
               editProduct(request, response);
                break;
                case "delete":
               deleteProduct(request, response);
                break;
            default:

        }
    }

    private  void editProduct(HttpServletRequest request,HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Double price = Double.parseDouble(request.getParameter("price"));
        String name = request.getParameter("name");
        productService.update(id, new Product(name, id, price));
        response.sendRedirect("/products");
    }
    private  void deleteProduct(HttpServletRequest request,HttpServletResponse response) throws IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        productService.delete(id);
        response.sendRedirect("/products");
    }
    private void showEditProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/edit.jsp");
        int id= Integer.parseInt(request.getParameter("id"));
        Product product=productService.findById(id);
        request.setAttribute("productEdit",product);
        requestDispatcher.forward(request, response);
    }


    private void saveProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Double price = Double.parseDouble(request.getParameter("price"));
        String name = request.getParameter("name");
        productService.save(new Product(name, id, price));
        response.sendRedirect("/products");
    }
    private void showSaveProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/create.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showListProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/list.jsp");
        List<Product> productList = productService.findAll();
        request.setAttribute("list", productList);
        requestDispatcher.forward(request, response);
    }

}
