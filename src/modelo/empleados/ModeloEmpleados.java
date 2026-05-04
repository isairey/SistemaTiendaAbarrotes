/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.empleados;

/**
 * Modelo Articulos.
 * Entidad que creara objetos de tipo ModeloArticulos
 * @author Noemi Zavalza Valderrama
 * @version 1.
 * @since 06/11/23
 */
public class ModeloEmpleados{  
    private String Nombre;
    private String FechaNac;
    private String Apellidop;
    private String Apellidom;
    private String Horario;
    private int Telefono;
    private int idEmpleados;

     /**
      * Constructor.
      * @param Nombre(String).
      * @param FechaNac (String).
      * @param Apellidop (String).
      * @param Apellidom(Int).
      * @param Telefono (Int).
      * @param Horario  (Int).
     * @param idEmpleados (int).
      */
    public ModeloEmpleados(int idEmpleados,String Nombre, String FechaNac, String Apellidop, String Apellidom, String Horario, int Telefono) {   
        this.idEmpleados = idEmpleados;
        this.Nombre = Nombre;
        this.FechaNac = FechaNac;
        this.Apellidop = Apellidop;
        this.Apellidom = Apellidom;
        this.Horario = Horario;
        this.Telefono = Telefono;
        
    }

/**
     * Constructor Vacio.
     */
    public ModeloEmpleados() {
    }
   /**
     * getNombre().
     * Retorna la marca.
     * @return Marca (String).
     */
    public String getNombre() {
        return Nombre;
    }
/**
 * setMarca().
 * Modifica la Nombre.
 * @param Nombre. 
 */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
   /**
     * getFechaNac().
     * Retorna la Descripcion.
     * @return FechaNac(String).
     */
    public String getFechaNac() {
        return FechaNac;
    }
/**
 * setFechaNac().
 * Modifica la FechaNac.
 * @param FechaNac.
 */
    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }
   /**
     * getApellidop().
     * Retorna la Apellido Paterno.
     * @return Apellidop (String).
     */
    public String getApellidop() {
        return Apellidop;
    }
/**
 * getApellidop().
     * Retorna la Apellido Paterno.
     * @param Apellidop (String).
     */
 
    public void setApellidop(String Apellidop) {
        this.Apellidop = Apellidop;
    }
  /**
     * getApellidom().
     * Retorna la Apellido Materno.
     * @param Apellidom (String).
     */
    public void setApellidom(String Apellidom) {
       this.Apellidom = Apellidom;
    }
/**
 * getApellidop().
     * Retorna la Apellido Materno.
     * @return Apellidom (String).
     */
 
    public String getApellidom() {
        return Apellidom;
    }
/**
 * setHorario().
 * Modifica el Horario.
 * @param Horario. 
 */
    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
  /**
     * getCantidad().
     * Retorna la cantidad.
     * @return Cantidad (Int).
     */
    public String getHorario() {
        return Horario;
    }
/**
 * setTelefono().
 * Modifica el Telefono.
 * @param Telefono. 
 */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
  /**
     * getTelefono().
     * Retorna la Telefono.
     * @return Telefono (Int).
     */
    public int getTelefono() {
        return Telefono;
    } 

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    
}