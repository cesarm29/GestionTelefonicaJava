/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author cesar1
 */
public class LineaDTO {
    
    private int LINUMEROLINEA;
    private int PERID;
    private String LINESTADO;

    public LineaDTO() {
    }

    public LineaDTO(int LINUMEROLINEA, int PERID, String LINESTADO) {
        this.LINUMEROLINEA = LINUMEROLINEA;
        this.PERID = PERID;
        this.LINESTADO = LINESTADO;
    }

    /**
     * @return the LINUMEROLINEA
     */
    public int getLINUMEROLINEA() {
        return LINUMEROLINEA;
    }

    /**
     * @param LINUMEROLINEA the LINUMEROLINEA to set
     */
    public void setLINUMEROLINEA(int LINUMEROLINEA) {
        this.LINUMEROLINEA = LINUMEROLINEA;
    }

    /**
     * @return the PERID
     */
    public int getPERID() {
        return PERID;
    }

    /**
     * @param PERID the PERID to set
     */
    public void setPERID(int PERID) {
        this.PERID = PERID;
    }

    /**
     * @return the LINESTADO
     */
    public String getLINESTADO() {
        return LINESTADO;
    }

    /**
     * @param LINESTADO the LINESTADO to set
     */
    public void setLINESTADO(String LINESTADO) {
        this.LINESTADO = LINESTADO;
    }
    
    
    
}
