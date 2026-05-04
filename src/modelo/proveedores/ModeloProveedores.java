/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.proveedores;

/**
 *
 * @author Fernando
 */
public class ModeloProveedores {
     private String Nombre, ApellidoPaterno, ApellidoMaterno, Empresa, RFC;
     private int Telefono, Id;
     
     
     /**
      * 
     * @param Id (int).
      * @param Nombre (String).
     * @param ApellidoPaterno (String).
     * @param ApellidoMaterno (String).
     * @param Empresa (String).
      * @param Telefono (int).
      */

    public ModeloProveedores(int Id,  String Empresa, String Nombre, String ApellidoPaterno, String ApellidoMaterno, int Telefono) {
        this.Id = Id;
        this.Empresa = Empresa;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Telefono = Telefono;
        
    }
    
    /**
     * Construsctor vacio.
     */
    
    public ModeloProveedores() {
    }
    
    /**
     * getId
     * Retorna el Id
     * @return getId (int)
     */
    public int getId() {
        return Id;
    }
    
    /**
     * Modifica el ID
     * @param Id (int).
     */
    public void setId(int Id) {
        this.Id = Id;
    }
    
    
    public String getEmpresa() {
        return Empresa;
    }
     /**
      * Modifica la direccion. 
     * @param Empresa (String).
      */
    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
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
    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }
    /**
     * Modifica el apellido paterno
     * @param ApellidoPaterno (String).
     */
    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }
    /**
     * getApMaterno().
     * Retorna el apellido materno
     * @return ApellidoMaterno (String).
     */
    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }
    /**
     * Modifica el apellido materno.
     * @param ApellidoMaterno (String).
     */
    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }
    
    
   
    /**
     * getTelefono().
     * Retorna el Telefono
     * @return getTelefono (int).
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * Modifica el telefono.
     * @param Telefono (String).
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    
     
    
     
}