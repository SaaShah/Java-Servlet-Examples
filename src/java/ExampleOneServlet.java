/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleOneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("method='GET'");
            out.println("<form action='1' method='GET'>");
            out.println("<input type='text' name='sometext'>");
            out.println("<input button type='Submit'>");
            out.println("</form>");
            
            out.println("method='POST'");
            out.println("<form action='1' method='POST'>");
            out.println("<input type='text' name='sometext'>");
            out.println("<input button type='Submit'>");
            out.println("</form>");
            
            out.close();
        } catch (Exception e) {
        }
        finally{
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String sometext = request.getParameter("sometext");
            out.println("'" + sometext + "' Send Via POST method.!");
            out.close();
        } catch (Exception e) {
        }
    }

}
