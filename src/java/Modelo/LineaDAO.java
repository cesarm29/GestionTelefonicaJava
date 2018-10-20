/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import bd.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.NamingException;

/**
 *
 * @author cesar
 */
public class LineaDAO {
    

PreparedStatement ps = null;
ResultSet rs = null;
LineaDTO objlogin = new LineaDTO();
ArrayList<LineaDTO> ArregloUsuario = new ArrayList<LineaDTO>(); 
private int rol;
private int opcion = 0;    

    public LineaDAO() {
    }

public LineaDTO getPorID(int LINUMEROLINEA) throws SQLException, NamingException, Exception {
        LineaDTO contdto = null;
       
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM linea WHERE (LINUMEROLINEA = ? )");
        ps.setInt(1, LINUMEROLINEA);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new LineaDTO();
            contdto.setPERID(resul.getInt("PERID"));
            contdto.setLINESTADO(resul.getString("LINESTADO"));
            contdto.setLINUMEROLINEA(LINUMEROLINEA);
        }
        return contdto;
    } 
    

public String crearLinea(LineaDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("INSERT INTO `linea` (`LINUMEROLINEA`, `PERID`, `LINESTADO`)"
                    + " VALUES (?,?,?)");
            
            ps.setInt(1, contrdto.getLINUMEROLINEA());
            ps.setInt(2, contrdto.getPERID());
            ps.setString(3, contrdto.getLINESTADO());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Insersion De Linea  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion De Linea Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Linea Ya Existe";
        }
        return Respuesta;
    }
    
public String ModificarLinea(LineaDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("UPDATE linea SET PERID = ?, LINESTADO = ?  WHERE (LINUMEROLINEA = ?)");
            
           
            ps.setInt(1, contrdto.getPERID());
            ps.setString(2, contrdto.getLINESTADO());
            ps.setInt(3, contrdto.getLINUMEROLINEA());
            
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion De Linea  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion De Linea Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Linea Ya Existe";
        }
        return Respuesta;
    }


public String EliminarLinea(LineaDTO contrdto) throws Exception {
        
        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("delete from linea  where LINUMEROLINEA= " + contrdto.getLINUMEROLINEA());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Linea Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Linea Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Linea Ya Existe";
        }
        return Respuesta;
    }

public ResultSet getTabla(String filtro) throws SQLException, NamingException, Exception {        
        Connection cnn = Conectar.getInstace();
        String sql = "SELECT * FROM linea where LINUMEROLINEA like '%"+filtro+"%' ";
        return cnn.createStatement().executeQuery(sql);
    }


public Boolean Exists(String LINUMEROLINEA) throws Exception{
            
        Connection cnn = Conectar.getInstace();
        ResultSet r =  cnn.createStatement().executeQuery("SELECT * FROM linea where LINUMEROLINEA="+LINUMEROLINEA);
        boolean existe = false;
        while (r.next()) {          
          existe = true;
      }
        return existe;
  }


public ArrayList<LineaDTO>  ListarTodos ()throws Exception{    
       Connection cnn = Conectar.getInstace();
       try {
            ps=cnn.prepareStatement("SELECT * FROM  linea");
            rs = ps.executeQuery();
            while (rs.next()){
            LineaDTO objl = new LineaDTO();
            objl.setLINUMEROLINEA(rs.getInt("LINUMEROLINEA"));
            objl.setPERID(rs.getInt("PERID"));
            objl.setLINESTADO(rs.getString("LINESTADO"));
            ArregloUsuario.add(objl);
            }   
        }
        catch(SQLException ex){
            objlogin.setLINESTADO(ex.getMessage());    
        }   
    return ArregloUsuario;
    }
    
}
