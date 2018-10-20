/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import Modelo.EquipoDAO;
import Modelo.EquipoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cesar
 */
public class ControlEquipo extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String v_que_va_a_retornar = "";
        
        try{
            EquipoDAO acdao=new EquipoDAO();
            EquipoDTO actdto=new EquipoDTO();
            
            String s = request.getParameter("EQUSERIAL");
            actdto.setEQUSERIAL(Integer.parseInt(request.getParameter("EQUSERIAL")));
            actdto.setLINUMEROLINEA(request.getParameter("LINUMEROLINEA"));
            actdto.setEQUMARCA(request.getParameter("EQUMARCA"));
            actdto.setEQUDESCRIPCION(request.getParameter("EQUDESCRIPCION"));
            actdto.setEQUESTADO(request.getParameter("EQUESTADO"));
            
            
                if (request.getParameter("btnSubmit") !=null && request.getParameter("btnSubmit").equals("Crear")){
                      
                       String salida1=acdao.crearEquipo(actdto);
                       response.sendRedirect("equipo.jsp?msg="+salida1);       
                }  
               else if(request.getParameter("btnSubmit")!= null && request.getParameter("btnSubmit").equals("Modificar")){                 
                        String salida1=acdao.ModificarEquipo(actdto);
                        response.sendRedirect("equipo.jsp?msg="+salida1); 

                 }      
               else if (request.getParameter("btnSubmit")!= null && request.getParameter("btnSubmit").equals("Eliminar")){
                        String salida1=acdao.EliminarEquipo(actdto);
                        response.sendRedirect("equipo.jsp?msg="+salida1); 
                }                
            }catch (Exception ex){
                out.println(ex.getMessage()); 
            } 
        if(v_que_va_a_retornar.equals("")){
            String salida1 = "OK"; 
        }
        out.print(v_que_va_a_retornar); 
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
