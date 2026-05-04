/*
 * ModeloUsuario
 */
package modelo.usuario;

/**
 * Modelo Usuario.
 * Entidad que creara objetos de tipo ModeloUsuario 
 * para poder loguearse en el sistema.
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 16/10/2023
 */
public class ModeloUsuario {
    //Atributos O Variables miembro
    private String Usuario, Password, Nombre, Tipo ;
    
    //Constructores

    /**
     * Constructor ModeloUsuario.
     * Modelo que pide como parametro los 4 atributos.
     * @param Usuario (String).
     * @param Password (String).
     * @param Nombre (String).
     * @param Tipo (String).
     */
    public ModeloUsuario(String Usuario, String Password, String Nombre, String Tipo) {
        this.Usuario = Usuario;
        this.Password = Password;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }
    
    /**
     * Constructor ModeloUsuario() Vacio.
     * Este constructor nos servira para crear usuarios, con los atributos en null.
     */
    public ModeloUsuario() {
    }
    
    //GETTERS & SETTERS

    /**
     * getUsuario().
     * Retorna el nombre del Usuario.
     * @return Usuario (String).
     */
    public String getUsuario() {
        return Usuario;
    }
    /**
     * setUsuario().
     * Modifica el nombre de Usuario.
     * @param Usuario (String).
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    /**
     * getPassword().
     * Retorna la contraseña.
     * @return Password (String).
     */
    public String getPassword() {
        return Password;
    }
    /**
     * setPassword().
     * Modifica la contraseña.
     * @param Password (String).
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    /**
     * getNombre().
     * Retorna el nombre.
     * @return Nombre (String).
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * setNombre().
     * Modifica el Nombre.
     * @param Nombre (String).
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * getTipo().
     * Retorna el tipo.
     * @return Tipo (String).
     */
    public String getTipo() {
        return Tipo;
    }
    /**
     * setTipo().
     * Modifica el Tipo.
     * @param Tipo (String).
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}
