package org.example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/index.html")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String nombre = req.getParameter("nombre");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("    <head>");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title>Tarea 1: Servlet y envío de parámetros</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <h1>Tarea 1: Servlet y envío de parámetros</h1>");
        out.println("<h2>Hola mi nombre es: " + nombre + "</h2>");
        out.println("    </body>");
        out.println("</html>");
        out.close();
    }
}
