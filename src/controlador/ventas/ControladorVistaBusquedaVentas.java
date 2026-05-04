/*
 CONTROLADOR VISTA BUSQUEDA
 */
package controlador.ventas;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.TEXT_CURSOR;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.ventas.ConsultasVentas;
import modelo.ventas.ModeloVentas;
import modelo.tablas.ventas.ModeloTablaVentas;
import vista.ventas.VistaBusquedaVentas;

/**
 * Controlador Vista Busqueda.
 * Entidad que creara objetos de tipo VistaBusqueda
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 16/11/2023
 */
public class ControladorVistaBusquedaVentas implements MouseListener,KeyListener{
    ModeloTablaVentas ModeloTablaVentas;
    ModeloVentas ModeloVentas;
    VistaBusquedaVentas VistaBusquedaVentas;//Vista para la ventana de busqueda
    ConsultasVentas ConsultasVentas = new ConsultasVentas();//Objeto para consultas

    public ControladorVistaBusquedaVentas() {
    }

    
    public ControladorVistaBusquedaVentas(ModeloTablaVentas ModeloTablaVentas, ModeloVentas ModeloVentas, VistaBusquedaVentas VistaBusquedaVentas) {
        this.ModeloTablaVentas = ModeloTablaVentas;
        this.ModeloVentas = ModeloVentas;
        this.VistaBusquedaVentas = VistaBusquedaVentas;
        
        
        //TOMA EL MODELO DE LA TABLA, le coloca los campos, encabezado, ETC.
        VistaBusquedaVentas.Tabla.setModel(this.ModeloTablaVentas.getModeloTabla());
        
        oyentes();//MVC
        LlenarTablaProductos();//Hacer visible la tabla al ojo
        VistaBusquedaVentas.setVisible(true);//MVC se hace visible
    
        
    }
    
   
    

    private void oyentes() {
        //MOUsE
        VistaBusquedaVentas.TxtNombre.addMouseListener(this);
         VistaBusquedaVentas.Tabla.addMouseListener(this);
         
          VistaBusquedaVentas.BtnAceptar.addMouseListener(this);
        
          //TECLADO
           VistaBusquedaVentas.TxtNombre.addKeyListener(this);
    }

    private void LlenarTablaProductos() {
        //Consulta la tabla articulos y llena el modelo con todosm  los registros
        ConsultasVentas.buscarTodosLosProductos(ModeloTablaVentas.getModeloTabla());
        //Actualiza la vista de la tabla con el modelo y todos los datos agregados
        VistaBusquedaVentas.Tabla.setModel(ModeloTablaVentas.getModeloTabla());
        
    }
    
    private void llenarModeloConSeleccionFilaTabla(){
        //obtiene el numero de filas de la tabla seleccionada
        int filaSeleccionada = VistaBusquedaVentas.Tabla.getSelectedRow();
        
        if (filaSeleccionada!=-1) {//-1 == no sse selecciona algo
            
            int idVenta = Integer.parseInt(ModeloTablaVentas.getModeloTabla().getValueAt(filaSeleccionada,0).toString());
            
            int idArticulo = Integer.parseInt(ModeloTablaVentas.getModeloTabla().getValueAt(filaSeleccionada,1).toString());  
            
            String Fecha = ModeloTablaVentas.getModeloTabla().getValueAt(filaSeleccionada, 2).toString();
            
            float Monto = Float.parseFloat(ModeloTablaVentas.getModeloTabla().getValueAt(filaSeleccionada,3).toString());
           
            int idCliente = Integer.parseInt(ModeloTablaVentas.getModeloTabla().getValueAt(filaSeleccionada,4).toString());

            int idEmpleados = Integer.parseInt(ModeloTablaVentas.getModeloTabla().getValueAt(filaSeleccionada,5).toString());
            
            
            //LLENAR EL ModeloArticulos
            ModeloVentas.setIdVenta(idVenta);
            ModeloVentas.setIdArticulo(idArticulo);
            ModeloVentas.setFecha(Fecha);
            ModeloVentas.setMonto(Monto);
            ModeloVentas.setIdCliente(idCliente);
            ModeloVentas.setIdEmpleados(idEmpleados);
             
                
                    
            
                    
            
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
       if (e.getSource() == VistaBusquedaVentas.BtnAceptar) {
               VistaBusquedaVentas.BtnAceptar.setCursor(new Cursor(HAND_CURSOR));
               llenarModeloConSeleccionFilaTabla();
               VistaBusquedaVentas.dispose();//Cierra la ventana de bussqueda
       }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == VistaBusquedaVentas.BtnAceptar) {
               VistaBusquedaVentas.BtnAceptar.setCursor(new Cursor(HAND_CURSOR));
               
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == VistaBusquedaVentas.TxtNombre) {
               VistaBusquedaVentas.TxtNombre.setCursor(new Cursor(TEXT_CURSOR));
               ConsultasVentas.buscarFrase(VistaBusquedaVentas.TxtNombre, ModeloTablaVentas.getModeloTabla());
               
        }
    }

   
   
    
    
    
}
