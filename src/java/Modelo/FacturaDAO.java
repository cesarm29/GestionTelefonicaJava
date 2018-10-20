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
public class FacturaDAO {
    
PreparedStatement ps = null;
ResultSet rs = null;
FacturaDTO objlogin = new FacturaDTO();
ArrayList<FacturaDTO> ArregloUsuario = new ArrayList<FacturaDTO>(); 
private int rol;
private int opcion = 0;


    public FacturaDAO() {
    }
    
public FacturaDTO getPorID(int FACNUMERO) throws SQLException, NamingException, Exception {
        FacturaDTO contdto = null;
       
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM factura WHERE (FACNUMERO = ? )");
        ps.setInt(1, FACNUMERO);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new FacturaDTO();
            contdto.setLINUMEROLINEA(resul.getString("LINUMEROLINEA"));
            contdto.setFACFECHAEMISION(resul.getString("FACFECHAEMISION"));
            contdto.setFACVALOR(resul.getInt("FACVALOR")); 
            contdto.setFACNUMERO(FACNUMERO);
        }
        return contdto;
    }    

public String crearFactura(FacturaDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("INSERT INTO `factura` (`FACNUMERO`, `LINUMEROLINEA`, `FACFECHAEMISION`, `FACVALOR`)"
                    + " VALUES (?,?,?,?)");
            
            ps.setInt(1, contrdto.getFACNUMERO());
            ps.setString(2, contrdto.getLINUMEROLINEA());
            ps.setString(3, contrdto.getFACFECHAEMISION());
            ps.setInt(4, contrdto.getFACVALOR());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Insersion De Factura  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion De Factura Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Factura Ya Existe";
        }
        return Respuesta;
    }

public String ModificarFactura(FacturaDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("UPDATE factura SET LINUMEROLINEA = ?, FACFECHAEMISION = ?, FACVALOR = ?  WHERE (FACNUMERO = ?)");
            
           
            ps.setString(1, contrdto.getLINUMEROLINEA());
            ps.setString(2, contrdto.getFACFECHAEMISION());
            ps.setInt(3, contrdto.getFACVALOR());
            ps.setInt(4, contrdto.getFACNUMERO());
            
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion De Factura  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion De Factura Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Factura Ya Existe";
        }
        return Respuesta;
    }

public String EliminarFactura(FacturaDTO contrdto) throws Exception {
        
        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("delete from factura  where FACNUMERO= " + contrdto.getFACNUMERO());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Factura Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Factura Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Factura Ya Existe";
        }
        return Respuesta;
    }

public ResultSet getTabla(String filtro) throws SQLException, NamingException, Exception {        
        Connection cnn = Conectar.getInstace();
        String sql = "SELECT * FROM factura where FACNUMERO like '%"+filtro+"%' ";
        return cnn.createStatement().executeQuery(sql);
    }
 
public Boolean Exists(String FACNUMERO) throws Exception{
            
        Connection cnn = Conectar.getInstace();
        ResultSet r =  cnn.createStatement().executeQuery("SELECT * FROM factura where FACNUMERO="+FACNUMERO);
        boolean existe = false;
        while (r.next()) {          
          existe = true;
      }
        return existe;
  }

public ArrayList<FacturaDTO>  ListarTodos ()throws Exception{    
       Connection cnn = Conectar.getInstace();
       try {
            ps=cnn.prepareStatement("SELECT * FROM  factura");
            rs = ps.executeQuery();
            while (rs.next()){
            FacturaDTO objl = new FacturaDTO();
            objl.setFACNUMERO(rs.getInt("FACNUMERO"));
            objl.setLINUMEROLINEA(rs.getString("LINUMEROLINEA"));
            objl.setFACFECHAEMISION(rs.getString("FACFECHAEMISION"));
            objl.setFACVALOR(rs.getInt("FACVALOR"));
            ArregloUsuario.add(objl);
            }   
        }
        catch(SQLException ex){
            objlogin.setFACFECHAEMISION(ex.getMessage());    
        }   
    return ArregloUsuario;
    }
   
}
