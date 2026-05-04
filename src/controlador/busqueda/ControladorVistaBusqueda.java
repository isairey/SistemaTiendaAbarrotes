/*
 CONTROLADOR VISTA BUSQUEDA
 */
package controlador.busqueda;

import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.TEXT_CURSOR;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.articulos.ConsultasArticulos;
import modelo.articulos.ModeloArticulos;
import modelo.tablas.ModeloTablaArticulos;
import vista.busqueda.VistaBusqueda;

/**
 * Controlador Vista Busqueda.
 * Entidad que creara objetos de tipo VistaBusqueda
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 16/11/2023
 */
public class ControladorVistaBusqueda implements MouseListener,KeyListener{
    ModeloTablaArticulos ModeloTablaArticulos;
    ModeloArticulos ModeloArticulos;
    VistaBusqueda VistaBusqueda;//Vista para la ventana de busqueda
    ConsultasArticulos ConsultasArticulos = new ConsultasArticulos();//Objeto para consultas

    public ControladorVistaBusqueda() {
    }

    
    public ControladorVistaBusqueda(ModeloTablaArticulos ModeloTablaArticulos, ModeloArticulos ModeloArticulos, VistaBusqueda VistaBusqueda) {
        this.ModeloTablaArticulos = ModeloTablaArticulos;
        this.ModeloArticulos = ModeloArticulos;
        this.VistaBusqueda = VistaBusqueda;
        
        
        //TOMA EL MODELO DE LA TABLA, le coloca los campos, encabezado, ETC.
        VistaBusqueda.Tabla.setModel(this.ModeloTablaArticulos.getModeloTabla());
        
        oyentes();//MVC
        LlenarTablaProductos();//Hacer visible la tabla al ojo
        VistaBusqueda.setVisible(true);//MVC se hace visible
    
        
    }
    
   
    

    private void oyentes() {
        //MOUsE
        VistaBusqueda.TxtNombre.addMouseListener(this);
         VistaBusqueda.Tabla.addMouseListener(this);
         
          VistaBusqueda.BtnAceptar.addMouseListener(this);
           VistaBusqueda.BtnReporte.addMouseListener(this);
        
          //TECLADO
           VistaBusqueda.TxtNombre.addKeyListener(this);
    }

    private void LlenarTablaProductos() {
        //Consulta la tabla articulos y llena el modelo con todosm  los registros
        ConsultasArticulos.buscarTodosLosProductos(ModeloTablaArticulos.getModeloTabla());
        //Actualiza la vista de la tabla con el modelo y todos los datos agregados
        VistaBusqueda.Tabla.setModel(ModeloTablaArticulos.getModeloTabla());
        
    }
    
    private void llenarModeloConSeleccionFilaTabla(){
        //obtiene el numero de filas de la tabla seleccionada
        int filaSeleccionada = VistaBusqueda.Tabla.getSelectedRow();
        
        if (filaSeleccionada!=-1) {//-1 == no sse selecciona algo
            
            int idArticulo = Integer.parseInt(ModeloTablaArticulos.getModeloTabla().getValueAt(filaSeleccionada,0).toString());
                    
            String Articulo = ModeloTablaArticulos.getModeloTabla().getValueAt(filaSeleccionada, 1).toString();
            
            float Precio = Float.parseFloat(ModeloTablaArticulos.getModeloTabla().getValueAt(filaSeleccionada,2).toString());
            
            String Marca = ModeloTablaArticulos.getModeloTabla().getValueAt(filaSeleccionada, 3).toString();
            
            int Cantidad = Integer.parseInt(ModeloTablaArticulos.getModeloTabla().getValueAt(filaSeleccionada,4).toString());
             
            String Descripcion = ModeloTablaArticulos.getModeloTabla().getValueAt(filaSeleccionada, 5).toString();
            
            String Categoria = ModeloTablaArticulos.getModeloTabla().getValueAt(filaSeleccionada, 6).toString();
            
            int idProveedores = Integer.parseInt(ModeloTablaArticulos.getModeloTabla().getValueAt(filaSeleccionada,7).toString());
            
            
            //LLENAR EL ModeloArticulos
            ModeloArticulos.setId(idArticulo);
            ModeloArticulos.setArticulo(Articulo);
            ModeloArticulos.setPrecio(Precio);
            ModeloArticulos.setMarca(Marca);
            ModeloArticulos.setCantidad(Cantidad);
            ModeloArticulos.setDescripcion(Descripcion);
            ModeloArticulos.setCategoria(Categoria);
            ModeloArticulos.setidProveedores(idProveedores);
             
                
                    
            
                    
            
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
       if (e.getSource() == VistaBusqueda.BtnAceptar) {
               VistaBusqueda.BtnAceptar.setCursor(new Cursor(HAND_CURSOR));
               llenarModeloConSeleccionFilaTabla();
               VistaBusqueda.dispose();//Cierra la ventana de bussqueda
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
        if (e.getSource() == VistaBusqueda.BtnAceptar) {
               VistaBusqueda.BtnAceptar.setCursor(new Cursor(HAND_CURSOR));
               
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
        if (e.getSource() == VistaBusqueda.TxtNombre) {
               VistaBusqueda.TxtNombre.setCursor(new Cursor(TEXT_CURSOR));
               ConsultasArticulos.buscarFrase(VistaBusqueda.TxtNombre, ModeloTablaArticulos.getModeloTabla());
               
        }
    }

    
    
    
}
