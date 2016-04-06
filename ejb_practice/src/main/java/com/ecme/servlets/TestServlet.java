package com.ecme.servlets;

import com.ecme.sessionbeans.MySingletonBeanLocal;
import com.ecme.sessionbeans.QuestionRemote;
import com.ecme.sessionbeans.StatefulBean;
import com.ecme.sessionbeans.StatefulBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edgar
 */
public class TestServlet extends HttpServlet {

    @EJB
    QuestionRemote qbean;
    
    @EJB
    StatefulBeanLocal statefulBean;
    
    @EJB
    MySingletonBeanLocal singletonBean;
//    QuestionRemote qbean = (QuestionRemote)
//         InitialContext.lookup("java:global/ejb_practice-1.0-SNAPSHOT/QuestionBean");
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TestServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TestServlet at " + request.getContextPath() + "</h1>");
            singletonBean.increment();
            statefulBean.setPartName("Parteeeeee");
            statefulBean.setPartNumer(1000);
            statefulBean.finish();
            statefulBean.endBean();
            qbean.addQuestion("EJEMPLO DE PREGUNRAA????");
            out.println("<h2>Stateless QuestionBean " + qbean.getQuestion() + "</h2>");
            out.println("<h2>Stateless Parts " + qbean.getParts().toString()+ "</h2>");
            out.println("<h3>Count " +singletonBean.getNumber()+ "</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
