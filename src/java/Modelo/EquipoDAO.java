/*
 * To change this template, choose Tools | Templates
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
 * @author cesar1
 */
public class EquipoDAO {
    
PreparedStatement ps = null;
ResultSet rs = null;
EquipoDTO objlogin = new EquipoDTO();
ArrayList<EquipoDTO> ArregloUsuario = new ArrayList<EquipoDTO>(); 
private int rol;
private int opcion = 0;

    public EquipoDAO() {
    }


public EquipoDTO getPorID(int EQUSERIAL) throws SQLException, NamingException, Exception {
        EquipoDTO contdto = null;
       
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM equipo WHERE (EQUSERIAL = ? )");
        ps.setInt(1, EQUSERIAL);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new EquipoDTO();
            contdto.setLINUMEROLINEA(resul.getString("LINUMEROLINEA"));
            contdto.setEQUMARCA(resul.getString("EQUMARCA"));
            contdto.setEQUDESCRIPCION(resul.getString("EQUDESCRIPCION")); 
            contdto.setEQUESTADO(resul.getString("EQUESTADO")); 
            contdto.setEQUSERIAL(EQUSERIAL);
        }
        return contdto;
    }


public String crearEquipo(EquipoDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("INSERT INTO `equipo` (`EQUSERIAL`, `LINUMEROLINEA`, `EQUMARCA`, `EQUDESCRIPCION`, `EQUESTADO`)"
                    + " VALUES (?,?,?,?,?)");
            
            
            ps.setInt(1, contrdto.getEQUSERIAL());
            ps.setString(2, contrdto.getLINUMEROLINEA());
            ps.setString(3, contrdto.getEQUMARCA());
            ps.setString(4, contrdto.getEQUDESCRIPCION());
            ps.setString(5, contrdto.getEQUESTADO());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Insersion De Equipo  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion De Equipo Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Equipo Ya Existe";
        }
        return Respuesta;
    }


public String ModificarEquipo(EquipoDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("UPDATE equipo SET LINUMEROLINEA = ?, EQUMARCA = ?, EQUDESCRIPCION = ?, EQUESTADO = ?  WHERE (EQUSERIAL = ?)");
            
           
            ps.setString(1, contrdto.getLINUMEROLINEA());
            ps.setString(2, contrdto.getEQUMARCA());
            ps.setString(3, contrdto.getEQUDESCRIPCION());
            ps.setString(4, contrdto.getEQUESTADO());
            ps.setInt(5, contrdto.getEQUSERIAL());
            
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion De Equipo  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion De Equipo Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Equipo Ya Existe";
        }
        return Respuesta;
    }


public String EliminarEquipo(EquipoDTO contrdto) throws Exception {
        
        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("delete from equipo  where EQUSERIAL= " + contrdto.getEQUSERIAL());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Equipo Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Equipo Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Equipo Ya Existe";
        }
        return Respuesta;
    }


public ResultSet getTabla(String filtro) throws SQLException, NamingException, Exception {        
        Connection cnn = Conectar.getInstace();
        String sql = "SELECT * FROM equipo where EQUSERIAL like '%"+filtro+"%' ";
        return cnn.createStatement().executeQuery(sql);
    }

public Boolean Exists(String EQUSERIAL) throws Exception{
            
        Connection cnn = Conectar.getInstace();
        ResultSet r =  cnn.createStatement().executeQuery("SELECT * FROM equipo where EQUSERIAL="+EQUSERIAL);
        boolean existe = false;
        while (r.next()) {          
          existe = true;
      }
        return existe;
  }


public ArrayList<EquipoDTO>  ListarTodos ()throws Exception{    
       Connection cnn = Conectar.getInstace();
       try {
            ps=cnn.prepareStatement("SELECT * FROM  equipo");
            rs = ps.executeQuery();
            while (rs.next()){
            EquipoDTO objl = new EquipoDTO();
            objl.setEQUSERIAL(rs.getInt("EQUSERIAL"));
            objl.setLINUMEROLINEA(rs.getString("LINUMEROLINEA"));
            objl.setEQUMARCA(rs.getString("EQUMARCA"));
            objl.setEQUDESCRIPCION(rs.getString("EQUDESCRIPCION"));
            objl.setEQUESTADO(rs.getString("EQUESTADO")); 
            ArregloUsuario.add(objl);
            }   
        }
        catch(SQLException ex){
            objlogin.setEQUESTADO(ex.getMessage());    
        }   
    return ArregloUsuario;
    }

    
    
}
