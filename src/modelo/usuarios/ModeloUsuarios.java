
package modelo.usuarios;


/**
 * Modelo Usuario.
 * Entidad que creara objetos de tipo ModeloUsuario.
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 06/11/2023
 */
public class ModeloUsuarios {
     private String Usuario, Pass, Nombre, Tipo;
     

     /**
      * CONSTRUCTOR USUARIO
      * @param Usuario(String).
      * @param Pass(String).
      * @param Nombre(String).
      * @param Tipo (String).
      */
    public ModeloUsuarios(String Usuario, String Pass, String Nombre, String Tipo) {   
        this.Usuario = Usuario;
        this.Pass = Pass;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }

/**
     * Constructor Vacio.
     */
    public ModeloUsuarios() {
    }

    
    //GETTESR & SETTERS
    /**
    * getUsuario().
    * Obtiene el Usuario. 
     * @return Usuario(String).
    */
    public String getUsuario() {
        return Usuario;
    }

    /**
    * setUsuario().
    * Modifica el Usuario.
     * @param Usuario(String).
    */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
    * getPass().
    * Obtiene el Password. 
     * @return Pass(String PASSFIELD).
    */
    public String getPass() {
        return Pass;
    }

    /**
    * setPass().
    * Modifica el Password.
    * @param Pass (String PASSFIELD).
    */
    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    /**
    * getNombre().
    * Obtiene el Nombre. 
     * @return Nombre(String).
    */
    public String getNombre() {
        return Nombre;
    }

    /**
    * setNombre().
    * Modifica el Nombre.
     * @param Nombre(String).
    */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
    * getTipo().
    * Obtiene el Tipo. 
     * @return Tipo(String).
    */
    public String getTipo() {
        return Tipo;
    }

    /**
    * setTipo().
    * Modifica el Tipo.
     * @param Tipo(String).
    */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
     /**
     * getidProveedores().
     * Retorna la idProveedores.
     * @return idProveedores (Int).
     */
    
    /**
 * setArticulo().
 * Modifica el Articulo.
 * @param Articulo. 
 */
    
   /**
     * getArticulo().
     * Retorna el nombre del Articulo.
     * @return Articulo (String).
     */
   
    
}
