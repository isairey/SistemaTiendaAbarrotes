/*
 ModeloTablaArticulos
 */
package modelo.tablas.usuarios;

import javax.swing.table.DefaultTableModel;
/**
 * Modelo Usuarios.
 * Entidad que creara objetos de tipo ModeloTablaUsuarios
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 16/11/2023
 */
public class ModeloTablaUsuarios {
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    
    //CONFIGURA LOS ENCABEZADOS DE LA TABLA
    public ModeloTablaUsuarios(){
        ModeloTabla.addColumn("Usuario");
        ModeloTabla.addColumn("Nombre");
        ModeloTabla.addColumn("Tipo");
    }

    /**
     * getModeloTabla()
     * @return ModeloTabla
     */
    public DefaultTableModel getModeloTabla() {
        return ModeloTabla;
    }

    /**
     * setModeloTabla()
     * @param ModeloTabla (Table model).
     */
    public void setModeloTabla(DefaultTableModel ModeloTabla) {
        this.ModeloTabla = ModeloTabla;
    }
    
    
}
