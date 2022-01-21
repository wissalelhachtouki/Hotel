/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Reservationn;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.ProfesseurService;
import service.ChambreService;

@WebServlet(name = "ProfesseurController", urlPatterns = {"/ProfesseurController"})
public class ReservationController extends HttpServlet {
    ReservationService reservationService = new ReservationService();
    ChambreService chambreService = new ChambreService();
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
         if (request.getParameter("op") != null) {
            if (request.getParameter("op").equals("delete")) {
            	reservationService.delete(reservationService.findById(Integer.parseInt(request.getParameter("id"))));
            }
        } else if (request.getParameter("id") == "") {
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String telephone = request.getParameter("telephone");
            String email = request.getParameter("email");
            String dateReserv = request.getParameter("dateReserv").replace("-", "/");
            String reservationLibelle = request.getParameter("chambre");
            int reservation = reservationService.findByLibelle(reservationLibelle).getId();
            String sexe = request.getParameter("sexe");
            reservationService.create(new Reservationn(nom, prenom, telephone, email, new Date(dateReserv), chambre, sexe));
        } else {
        	String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String telephone = request.getParameter("telephone");
            String email = request.getParameter("email");
            String dateReserv = request.getParameter("dateReserv").replace("-", "/");
            String reservationLibelle = request.getParameter("chambre");
            int reservation = reservationService.findByLibelle(reservationLibelle).getId();
            String sexe = request.getParameter("sexe");
            reservationService.create(new Reservationn(nom, prenom, telephone, email, new Date(dateReserv), chambre, sexe));
        }
        response.sendRedirect("reservations.jsp");
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
