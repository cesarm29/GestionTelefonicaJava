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
public class PersonaDAO {
    
PreparedStatement ps = null;
ResultSet rs = null;
PersonaDTO objlogin = new PersonaDTO();
ArrayList<PersonaDTO> ArregloUsuario = new ArrayList<PersonaDTO>(); 
private int rol;
private int opcion = 0;    

    public PersonaDAO() {
    }
    
public PersonaDTO getPorID(int PERID) throws SQLException, NamingException, Exception {
        PersonaDTO contdto = null;
       
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM persona WHERE (PERID = ? )");
        ps.setInt(1, PERID);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new PersonaDTO();
            contdto.setPERNOMBRE(resul.getString("PERNOMBRE"));
            contdto.setPERAPELLIDO(resul.getString("PERAPELLIDO"));
            contdto.setPERTELEFONOFIJO(resul.getString("PERTELEFONOFIJO")); 
            contdto.setPERFECHANACIMIENTO(resul.getString("PERFECHANACIMIENTO")); 
            contdto.setPERCEDULA(resul.getString("PERCEDULA")); 
            contdto.setPERID(PERID);
        }
        return contdto;
    }

public String crearPersona(PersonaDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("INSERT INTO `persona` (`PERID`, `PERNOMBRE`, `PERAPELLIDO`, `PERTELEFONOFIJO`, `PERFECHANACIMIENTO`, `PERCEDULA`)"
                    + " VALUES (?,?,?,?,?,?)");
            
            ps.setInt(1, contrdto.getPERID());
            ps.setString(2, contrdto.getPERNOMBRE());
            ps.setString(3, contrdto.getPERAPELLIDO());
            ps.setString(4, contrdto.getPERTELEFONOFIJO());
            ps.setString(5, contrdto.getPERFECHANACIMIENTO());
            ps.setString(6, contrdto.getPERCEDULA());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Insersion De Persona  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion De Persona Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Persona Ya Existe";
        }
        return Respuesta;
    }

public String ModificarPersona(PersonaDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("UPDATE persona SET PERNOMBRE = ?, PERAPELLIDO = ?, PERTELEFONOFIJO = ?, PERFECHANACIMIENTO = ?, PERCEDULA = ?  WHERE (PERID = ?)");
            
           
            ps.setString(1, contrdto.getPERNOMBRE());
            ps.setString(2, contrdto.getPERAPELLIDO());
            ps.setString(3, contrdto.getPERTELEFONOFIJO());
            ps.setString(4, contrdto.getPERFECHANACIMIENTO());
            ps.setString(5, contrdto.getPERCEDULA());
            ps.setInt(6, contrdto.getPERID());
            
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion De Persona  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion De Persona Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Persona Ya Existe";
        }
        return Respuesta;
    }

public String EliminarPersona(PersonaDTO contrdto) throws Exception {
        
        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("delete from persona  where PERID= " + contrdto.getPERID());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Persona Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Persona Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Persona Ya Existe";
        }
        return Respuesta;
    }

public ResultSet getTabla(String filtro) throws SQLException, NamingException, Exception {        
        Connection cnn = Conectar.getInstace();
        String sql = "SELECT * FROM persona where PERID like '%"+filtro+"%' ";
        return cnn.createStatement().executeQuery(sql);
    }

public Boolean Exists(String PERID) throws Exception{
            
        Connection cnn = Conectar.getInstace();
        ResultSet r =  cnn.createStatement().executeQuery("SELECT * FROM persona where PERID="+PERID);
        boolean existe = false;
        while (r.next()) {          
          existe = true;
      }
        return existe;
  }

public ArrayList<PersonaDTO>  ListarTodos ()throws Exception{    
       Connection cnn = Conectar.getInstace();
       try {
            ps=cnn.prepareStatement("SELECT * FROM  persona");
            rs = ps.executeQuery();
            while (rs.next()){
            PersonaDTO objl = new PersonaDTO();
            objl.setPERID(rs.getInt("PERID"));
            objl.setPERNOMBRE(rs.getString("PERNOMBRE"));
            objl.setPERAPELLIDO(rs.getString("PERAPELLIDO"));
            objl.setPERTELEFONOFIJO(rs.getString("PERTELEFONOFIJO"));
            objl.setPERFECHANACIMIENTO(rs.getString("PERFECHANACIMIENTO"));
            objl.setPERCEDULA(rs.getString("PERCEDULA"));
            ArregloUsuario.add(objl);
            }   
        }
        catch(SQLException ex){
            objlogin.setPERAPELLIDO(ex.getMessage());    
        }   
    return ArregloUsuario;
    }







}
