package org.rodrigo.apiservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/crear")
public class CrearServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String nombre = req.getParameter("nombre");
        String precio = req.getParameter("precio");
        String fabricante = req.getParameter("fabricante");

        List<String> errores =new ArrayList<>();
        if (nombre == null || nombre.isEmpty()){
            errores.add("El nombre no puede estar vacio");
        }
        if (precio == null || precio.isEmpty()){
            errores.add("El precio no puede estar vacio");
        }
        if (fabricante == null || fabricante.length() > 10 || fabricante.length() <4){
            errores.add("El fabricante no puede estar vacio y debe estar entre 4 caracteres o 10 caracteres");
        }

        if (errores.isEmpty()){
            try(PrintWriter out = resp.getWriter()) {
                out.println("<p>El nombre es " + nombre + "</p>");
                out.println("<p>El precio es " + precio + "</p>");
                out.println("<p>El fabricante es " + fabricante + "</p>");
            }
        }else {
            req.setAttribute("errores", errores);
            getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}
