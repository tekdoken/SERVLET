package minitest.controller;

import bai11_bt1.model.Product;
import minitest.model.Student;
import minitest.service.ServiceStudentImpl;
import minitest.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "/Students")
public class StudentServlet extends HttpServlet {
    StudentService studentService=new ServiceStudentImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                showEditStudent(request, response);
                break;
            case "delete":
                deleteStudent(request, response);
                break;

            default:
                showListStudent(request,response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                editStudent(request, response);
                break;
            default:

        }
    }
    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        studentService.delete(id);
        response.sendRedirect("/Students");
    }
    private void showListStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("student/list.jsp");
        List<Student> productList = studentService.findAll();
        request.setAttribute("list", productList);
        requestDispatcher.forward(request, response);
    }
    private void showEditStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("student/edit.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = studentService.findById(id);
        request.setAttribute("student", student);
        requestDispatcher.forward(request, response);
    }
    private void editStudent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        double scoreMath = Double.parseDouble(request.getParameter("math"));
        double scorePhysics = Double.parseDouble(request.getParameter("phy"));
        double scoreChemistry = Double.parseDouble(request.getParameter("che"));
        String name = request.getParameter("name");
        studentService.update(id, new Student(name, id, scoreMath,scorePhysics,scoreChemistry));
        response.sendRedirect("/Students");
    }
}
