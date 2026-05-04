/*
 ModeloTablaArticulos
 */
package modelo.tablas;
import javax.swing.table.DefaultTableModel;
/**
 * Modelo Articulos.
 * Entidad que creara objetos de tipo ModeloTTablaArticulos
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 16/11/2023
 */
public class ModeloTablaArticulos {
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    
    //CONFIGURA LOS ENCABEZADOS DE LA TABLA
    public ModeloTablaArticulos(){
        ModeloTabla.addColumn("idArticulo");
        ModeloTabla.addColumn("Articulo");
        ModeloTabla.addColumn("Precio");
        ModeloTabla.addColumn("Marca");
        ModeloTabla.addColumn("Cantidad");
        ModeloTabla.addColumn("Descripcion");
        ModeloTabla.addColumn("Categoria");
        ModeloTabla.addColumn("idProveedores");
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
