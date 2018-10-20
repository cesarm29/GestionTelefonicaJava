/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author cesar1
 */
public class FacturaDTO {
    
    private int FACNUMERO;
    private String LINUMEROLINEA;
    private String FACFECHAEMISION;
    private int FACVALOR;

    public FacturaDTO() {
    }

    public FacturaDTO(int FACNUMERO, String LINUMEROLINEA, String FACFECHAEMISION, int FACVALOR) {
        this.FACNUMERO = FACNUMERO;
        this.LINUMEROLINEA = LINUMEROLINEA;
        this.FACFECHAEMISION = FACFECHAEMISION;
        this.FACVALOR = FACVALOR;
    }

    /**
     * @return the FACNUMERO
     */
    public int getFACNUMERO() {
        return FACNUMERO;
    }

    /**
     * @param FACNUMERO the FACNUMERO to set
     */
    public void setFACNUMERO(int FACNUMERO) {
        this.FACNUMERO = FACNUMERO;
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
     * @return the FACFECHAEMISION
     */
    public String getFACFECHAEMISION() {
        return FACFECHAEMISION;
    }

    /**
     * @param FACFECHAEMISION the FACFECHAEMISION to set
     */
    public void setFACFECHAEMISION(String FACFECHAEMISION) {
        this.FACFECHAEMISION = FACFECHAEMISION;
    }

    /**
     * @return the FACVALOR
     */
    public int getFACVALOR() {
        return FACVALOR;
    }

    /**
     * @param FACVALOR the FACVALOR to set
     */
    public void setFACVALOR(int FACVALOR) {
        this.FACVALOR = FACVALOR;
    }
    
    
    
}
