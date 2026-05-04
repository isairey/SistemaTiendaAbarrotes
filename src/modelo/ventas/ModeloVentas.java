/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.ventas;



/**
 * Modelo Ventas.
 * Entidad que creara objetos de tipo ModeloVentas.
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 06/11/2023.
 */
public class ModeloVentas {
     private String Fecha;
     private int idVenta, idArticulo, idCliente, idEmpleados;
     private float monto;
     
     /**
      * COnstructor.
      * @param Fecha(String).
      * @param idVenta(Int).
      * @param idArticulo(Int).
      * @param idCliente(Int).
      * @param idEmpleados(Int).
      * @param monto(Float).
      */
    public ModeloVentas(String Fecha, int idVenta, int idArticulo, int idCliente, int idEmpleados, float monto) {
        this.Fecha = Fecha;
        this.idVenta = idVenta;
        this.idArticulo = idArticulo;
        this.idCliente = idCliente;
        this.idEmpleados = idEmpleados;
        this.monto = monto;
    }

     
    
/**
 * Constructor Vacio.
 */
    public ModeloVentas() {
    }

    //GETTERS & SETTERS
    /**
     * getFecha().
     * Retorna el nombre del Fecha.
     * @return Fecha (String).
     */
    public String getFecha() {
        return Fecha;
    }

    /**
    * setFecha().
    * Modifica el Fecha.
    * @param Fecha. 
    */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * getFecha().
     * Retorna el nombre del Fecha.
     * @return Fecha (String).
     */
    public int getIdVenta() {
        return idVenta;
    }

     /**
    * setFecha().
    * Modifica el idVenta.
    * @param idVenta (int). 
    */
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * getFecha().
     * Retorna el nombre del Fecha.
     * @return Fecha (String).
     */
    public int getIdArticulo() {
        return idArticulo;
    }

     /**
    * setFecha().
    * Modifica el idArticulo.
    * @param idArticulo (int). 
    */
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    /**
     * getFecha().
     * Retorna el nombre del Fecha.
     * @return Fecha (String).
     */
    public int getIdCliente() {
        return idCliente;
    }

     /**
    * setFecha().
    * Modifica el idCliente.
    * @param idCliente (int). 
    */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * getFecha().
     * Retorna el nombre del idEmpleados.
     * @return idEmpleados (int).
     */
    public int getIdEmpleados() {
        return idEmpleados;
    }

     /**
    * setFecha().
    * Modifica el idEmpleados.
    * @param idEmpleados (int). 
    */
    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    /**
     * getFecha().
     * Retorna el nombre del monto.
     * @return Monto (float).
     */
    public float getMonto() {
        return monto;
    }

     /**
    * setFecha().
    * Modifica el monto.
    * @param monto (float). 
    */
    public void setMonto(float monto) {
        this.monto = monto;
    }
    
   
}
