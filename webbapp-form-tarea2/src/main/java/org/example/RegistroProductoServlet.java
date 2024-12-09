package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/crear")
public class RegistroProductoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        String nombre = req.getParameter("nombre");
        String precio = req.getParameter("precio");
        String fabricante = req.getParameter("fabricante");


        try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <meta charset=\"UTF-8\">");
            out.println("        <title>Resultado Form</title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1>Resultado Form</h1>");
            out.println("         <ul>");
            out.println("         <li>Nombre: " + nombre +"</li>");
            out.println("         <li>Precio: " +precio +"</li>");
            out.println("         <li>Fabricante: " + fabricante +"</li>");
            out.println("    </body>");
            out.println("</html>");
        }

    }
}
