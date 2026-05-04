/*
 ModeloTablaVentas
 */
package modelo.tablas.ventas;
import javax.swing.table.DefaultTableModel;
/**
 * Modelo Articulos.
 * Entidad que creara objetos de tipo ModeloTablaVentas
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 24/11/2023
 */
public class ModeloTablaVentas {
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    
    //CONFIGURA LOS ENCABEZADOS DE LA TABLA
    public ModeloTablaVentas(){
        ModeloTabla.addColumn("idVenta");
        ModeloTabla.addColumn("idArticulo");
        ModeloTabla.addColumn("Fecha");
        ModeloTabla.addColumn("Monto");
        ModeloTabla.addColumn("idCliente");
        ModeloTabla.addColumn("idEmpleado");
        
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
     * @param ModeloTabla (Table Model).
     */
    public void setModeloTabla(DefaultTableModel ModeloTabla) {
        this.ModeloTabla = ModeloTabla;
    }
    
    
}
