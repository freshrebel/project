/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Cd;
import Service.CdService;
import Service.NummerService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Arno
 */
public class insertSong extends HttpServlet
{

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
            throws ServletException, IOException
    {

        if (request.getParameter("actie").equals("terug"))
        {
            response.sendRedirect("userStart.jsp");
        }
        if (request.getParameter("actie").equals("toevoegen"))
        {
            Cd cd;
            if (!request.getParameter("cd_id").equals(""))
            {
                cd = CdService.selectOne(Integer.parseInt(request.getParameter("cd_id")));
            }
            else
            {
                cd = new Cd();
            }
            String titel = request.getParameter("titel");
            String artiest = request.getParameter("artiest");
            int minuten;
            if (request.getParameter("minuten").equals(""))
            {
                minuten = 0;
            }
            else
            {
                minuten = Integer.parseInt(request.getParameter("minuten"));
            }
            int seconden;
            if (!request.getParameter("seconden").equals(""))
            {
                seconden = Integer.parseInt(request.getParameter("seconden"));
            }
            else
            {
                seconden = 0;
            }
            int bpm;
            if (!request.getParameter("bpm").equals(""))
            {
                bpm  = Integer.parseInt(request.getParameter("bpm"));
            }
            else
            {
                bpm = 0;
            }
            String genres = request.getParameter("genres");
            String labels = request.getParameter("labels");
            Long result = NummerService.insert(titel, artiest, minuten, seconden, bpm, genres, labels, cd);
            int id = Integer.parseInt(result.toString());
            request.getSession().setAttribute("id", id);
            response.sendRedirect("watchSong.jsp");
            //aanpassing voor toevoegen via cd
            //request.getHeader("Referer") om vorige url op te vragen

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
            throws ServletException, IOException
    {
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
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
