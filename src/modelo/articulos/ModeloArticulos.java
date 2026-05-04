/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.articulos;

/**
 * Modelo Articulos.
 * Entidad que creara objetos de tipo ModeloArticulos
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 17/10/2023
 */
public class ModeloArticulos {
     private String Articulo, Marca, Descripcion,Categoria;
     private int id, cantidad, idProveedores;
     private float precio;

     /**
      * 
      * @param Articulo (String).
      * @param Marca(String).
      * @param Descripcion(String).
      * @param Categoria(String).
      * @param id (int).
      * @param precio (float).
      * @param cantidad (int).
      * @param idProveedores (int).
      */
    public ModeloArticulos(String Articulo, String Marca, String Descripcion, String Categoria, int id, float precio, int cantidad, int idProveedores) {
        this.Articulo = Articulo;
        this.Marca = Marca;
        this.Descripcion = Descripcion;
        this.Categoria = Categoria;
        this.id = id;
        this.precio = precio;
        this.cantidad = cantidad;
        this.idProveedores = idProveedores;
    }
/**
 * Constructor Vacio.
 */
    public ModeloArticulos() {
    }
   /**
     * getArticulo().
     * Retorna el nombre del Articulo.
     * @return Articulo (String).
     */
    public String getArticulo() {
        return Articulo;
    }
/**
 * setArticulo().
 * Modifica el Articulo.
 * @param Articulo. 
 */
    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }
   /**
     * getMarca().
     * Retorna la marca.
     * @return Marca (String).
     */
    public String getMarca() {
        return Marca;
    }
/**
 * setMarca().
 * Modifica la Marca.
 * @param Marca. 
 */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
   /**
     * getDescripcion().
     * Retorna la Descripcion.
     * @return Descripcion (String).
     */
    public String getDescripcion() {
        return Descripcion;
    }
/**
 * setDescripcion().
 * Modifica la Descripcion.
 * @param Descripcion.
 */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
   /**
     * getCategoria().
     * Retorna la Categoria.
     * @return Categoria (String).
     */
    public String getCategoria() {
        return Categoria;
    }
/**
 * setCategoria().
 * Modifica la categoria.
 * @param Categoria.
 */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
  /**
     * getId().
     * Retorna el Id.
     * @return Id (Int).
     */
    public int getId() {
        return id;
    }
/**
 * setId().
 * Modifica el id.
 * @param id.
 */
    public void setId(int id) {
        this.id = id;
    }
  /**
     * getPrecio().
     * Retorna el Precio.
     * @return Precio (Int).
     */
    public float getPrecio() {
        return precio;
    }
/**
 * setPrecio().
 * Modifica el precio.
 * @param precio. 
 */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
  /**
     * getCantidad().
     * Retorna la cantidad.
     * @return Cantidad (Int).
     */
    public int getCantidad() {
        return cantidad;
    }
/**
 * setCantidad().
 * Modifica la cantidad.
 * @param cantidad (Int).
 */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
       /**
     * getidProveedores().
     * Retorna la idProveedores.
     * @return idProveedores (Int).
     */
    public int getidProveedores() {
        return idProveedores;
    }
/**
 * setidProveedores().
 * Modifica la idProveedores.
 * @param idProveedores (Int).
 */
    public void setidProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }
     
}
