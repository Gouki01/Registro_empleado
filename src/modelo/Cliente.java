/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yeltsin.rodriguez
 */
public class Cliente extends Persona{
    private String nit;
    public Cliente(){}
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    protected String[] crear(){
        try{
            String datos [] = new String[6];
            datos[0] = this.getNit();
            datos[1] = this.getNombres();
            datos[2] = this.getApellidos();
            datos[3] = this.getDireccion();
            datos[4] = this.getTelefono();
            datos[5] = this.getFecha_nacimiento();
            
           //Se realizo una correccion ya que retornaba null 
            return datos;
        }catch (Exception ex){
            System.out.println("algo salio mal: " + ex.getMessage());
        }
    return null;
}
    
}
