/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author cesar1
 */
public class EquipoDTO {
    
    private int EQUSERIAL;
    private String LINUMEROLINEA;
    private String EQUMARCA;
    private String EQUDESCRIPCION;
    private String EQUESTADO;

    public EquipoDTO() {
    }

    public EquipoDTO(int EQUSERIAL, String LINUMEROLINEA, String EQUMARCA, String EQUDESCRIPCION, String EQUESTADO) {
        this.EQUSERIAL = EQUSERIAL;
        this.LINUMEROLINEA = LINUMEROLINEA;
        this.EQUMARCA = EQUMARCA;
        this.EQUDESCRIPCION = EQUDESCRIPCION;
        this.EQUESTADO = EQUESTADO;
    }

    /**
     * @return the EQUSERIAL
     */
    public int getEQUSERIAL() {
        return EQUSERIAL;
    }

    /**
     * @param EQUSERIAL the EQUSERIAL to set
     */
    public void setEQUSERIAL(int EQUSERIAL) {
        this.EQUSERIAL = EQUSERIAL;
    }

    /**
     * @return the LINUMEROLINEA
     */
    public String getLINUMEROLINEA() {
        return LINUMEROLINEA;
    }

    /**
     * @param LINUMEROLINEA the LINUMEROLINEA to set
     */
    public void setLINUMEROLINEA(String LINUMEROLINEA) {
        this.LINUMEROLINEA = LINUMEROLINEA;
    }

    /**
     * @return the EQUMARCA
     */
    public String getEQUMARCA() {
        return EQUMARCA;
    }

    /**
     * @param EQUMARCA the EQUMARCA to set
     */
    public void setEQUMARCA(String EQUMARCA) {
        this.EQUMARCA = EQUMARCA;
    }

    /**
     * @return the EQUDESCRIPCION
     */
    public String getEQUDESCRIPCION() {
        return EQUDESCRIPCION;
    }

    /**
     * @param EQUDESCRIPCION the EQUDESCRIPCION to set
     */
    public void setEQUDESCRIPCION(String EQUDESCRIPCION) {
        this.EQUDESCRIPCION = EQUDESCRIPCION;
    }

    /**
     * @return the EQUESTADO
     */
    public String getEQUESTADO() {
        return EQUESTADO;
    }

    /**
     * @param EQUESTADO the EQUESTADO to set
     */
    public void setEQUESTADO(String EQUESTADO) {
        this.EQUESTADO = EQUESTADO;
    }
    
    
    
    
}
