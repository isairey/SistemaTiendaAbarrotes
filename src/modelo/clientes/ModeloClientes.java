/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.clientes;

/**
 *
 * @author Fernando
 */
public class ModeloClientes {
     private String Nombre, ApPaterno, ApMaterno, Direccion, RFC;
     private int Telefono, IdCliente;
     
     
     /**
      * 
      * @param Nombre (String)
      * @param ApPaterno (String)
      * @param ApMaterno (String)
      * @param Direccion (String)
      * @param RFC (String)
      * @param Telefono (int)
      * @param IdCliente (int)
      */

    public ModeloClientes(String Nombre, String ApPaterno, String ApMaterno, String Direccion, String RFC, int Telefono, int IdCliente) {
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.Direccion = Direccion;
        this.RFC = RFC;
        this.Telefono = Telefono;
        this.IdCliente = IdCliente;
    }
    
    /**
     * Construsctor vacio.
     */
    
    public ModeloClientes() {
    }
    
    /**
     * getNombre().
     * Retorna el nombre
     * @return Nombre (String)
     */
    public String getNombre() {
        return Nombre;
    }
    
    /**
     * Modifica el nombre.
     * @param Nombre (String).
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /**
     * getApPaterno().
     * Retorna el apellido paterno
     * @return ApPaterno (String).
     */
    public String getApPaterno() {
        return ApPaterno;
    }
    /**
     * Modifica el apellido paterno
     * @param ApPaterno (String).
     */
    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }
    /**
     * getApMaterno().
     * Retorna el apellido materno
     * @return ApMaterno (String)
     */
    public String getApMaterno() {
        return ApMaterno;
    }
    /**
     * Modifica el apellido materno.
     * @param ApMaterno (String).
     */
    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }
    
    /**
     * getDireccion().
     * Retorna la direccion
     * @return Direccion (String)
     */
    public String getDireccion() {
        return Direccion;
    }
     /**
      * Modifica la direccion.
      * @param Direccion (String).
      */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    /**
     * getRFC().
     * Retorna el RFC
     * @return RFC (String)
     */
    public String getRFC() {
        return RFC;
    }
    
    /**
     * Modifica el RFC.
     * @param RFC (String).
     */
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    /**
     * getTelefono().
     * Retorna el Telefono
     * @return getTelefono (int)
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * Modifica el telefono.
     * @param Telefono (int).
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * getIdCliente().
     * Retorna el IdCliente
     * @return getIdCliente (int).
     */
    public int getIdCliente() {
        return IdCliente;
    }
    
    /**
     * Modifica el IDCliente
     * @param IdCliente (int).
     */
    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }
     
    
     
}
