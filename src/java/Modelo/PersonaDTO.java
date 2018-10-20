/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author cesar1
 */
public class PersonaDTO {
    
    private int PERID;
    private String PERNOMBRE;
    private String PERAPELLIDO;
    private String PERTELEFONOFIJO;
    private String PERFECHANACIMIENTO;
    private String PERCEDULA;

    public PersonaDTO() {
    }
    
    
    public PersonaDTO(int PERID, String PERNOMBRE, String PERAPELLIDO, String PERTELEFONOFIJO, String PERFECHANACIMIENTO, String PERCEDULA) {
        this.PERID = PERID;
        this.PERNOMBRE = PERNOMBRE;
        this.PERAPELLIDO = PERAPELLIDO;
        this.PERTELEFONOFIJO = PERTELEFONOFIJO;
        this.PERFECHANACIMIENTO = PERFECHANACIMIENTO;
        this.PERCEDULA = PERCEDULA;
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
     * @return the PERNOMBRE
     */
    public String getPERNOMBRE() {
        return PERNOMBRE;
    }

    /**
     * @param PERNOMBRE the PERNOMBRE to set
     */
    public void setPERNOMBRE(String PERNOMBRE) {
        this.PERNOMBRE = PERNOMBRE;
    }

    /**
     * @return the PERAPELLIDO
     */
    public String getPERAPELLIDO() {
        return PERAPELLIDO;
    }

    /**
     * @param PERAPELLIDO the PERAPELLIDO to set
     */
    public void setPERAPELLIDO(String PERAPELLIDO) {
        this.PERAPELLIDO = PERAPELLIDO;
    }

    /**
     * @return the PERTELEFONOFIJO
     */
    public String getPERTELEFONOFIJO() {
        return PERTELEFONOFIJO;
    }

    /**
     * @param PERTELEFONOFIJO the PERTELEFONOFIJO to set
     */
    public void setPERTELEFONOFIJO(String PERTELEFONOFIJO) {
        this.PERTELEFONOFIJO = PERTELEFONOFIJO;
    }

    /**
     * @return the PERFECHANACIMIENTO
     */
    public String getPERFECHANACIMIENTO() {
        return PERFECHANACIMIENTO;
    }

    /**
     * @param PERFECHANACIMIENTO the PERFECHANACIMIENTO to set
     */
    public void setPERFECHANACIMIENTO(String PERFECHANACIMIENTO) {
        this.PERFECHANACIMIENTO = PERFECHANACIMIENTO;
    }

    /**
     * @return the PERCEDULA
     */
    public String getPERCEDULA() {
        return PERCEDULA;
    }

    /**
     * @param PERCEDULA the PERCEDULA to set
     */
    public void setPERCEDULA(String PERCEDULA) {
        this.PERCEDULA = PERCEDULA;
    }
       
}
