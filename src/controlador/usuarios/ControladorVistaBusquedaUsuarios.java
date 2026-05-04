/*
 CONTROLADOR VISTA BUSQUEDA
 */
package controlador.usuarios;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.TEXT_CURSOR;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.usuarios.ConsultasUsuarios;
import modelo.usuarios.ModeloUsuarios;
import modelo.tablas.usuarios.ModeloTablaUsuarios;
import vista.usuarios.VistaBusquedaUsuarios;

/**
 * Controlador Vista Busqueda.
 * Entidad que creara objetos de tipo VistaBusqueda
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 16/11/2023
 */
public class ControladorVistaBusquedaUsuarios implements MouseListener,KeyListener{
    ModeloTablaUsuarios ModeloTablaUsuarios;
    ModeloUsuarios ModeloUsuarios;
    VistaBusquedaUsuarios VistaBusquedaUsuarios;//Vista para la ventana de busqueda
    ConsultasUsuarios ConsultasUsuarios = new ConsultasUsuarios();//Objeto para consultas

    public ControladorVistaBusquedaUsuarios() {
    }

    
    public ControladorVistaBusquedaUsuarios(ModeloTablaUsuarios ModeloTablaUsuarios, ModeloUsuarios ModeloUsuarios, VistaBusquedaUsuarios VistaBusquedaUsuarios) {
        this.ModeloTablaUsuarios = ModeloTablaUsuarios;
        this.ModeloUsuarios = ModeloUsuarios;
        this.VistaBusquedaUsuarios = VistaBusquedaUsuarios;
        
        
        //TOMA EL MODELO DE LA TABLA, le coloca los campos, encabezado, ETC.
        VistaBusquedaUsuarios.Tabla.setModel(this.ModeloTablaUsuarios.getModeloTabla());
        
        oyentes();//MVC
        LlenarTablaProductos();//Hacer visible la tabla al ojo
        VistaBusquedaUsuarios.setVisible(true);//MVC se hace visible
    
        
    }
    
   
    

    private void oyentes() {
        //MOUsE
        VistaBusquedaUsuarios.TxtNombre.addMouseListener(this);
         VistaBusquedaUsuarios.Tabla.addMouseListener(this);
         
          VistaBusquedaUsuarios.BtnAceptar.addMouseListener(this);
        
          //TECLADO
           VistaBusquedaUsuarios.TxtNombre.addKeyListener(this);
    }

    private void LlenarTablaProductos() {
        //Consulta la tabla usuarios y llena el modelo con todosm  los registros
        ConsultasUsuarios.buscarTodosLosUsuarios(ModeloTablaUsuarios.getModeloTabla());
        //Actualiza la vista de la tabla con el modelo y todos los datos agregados
        VistaBusquedaUsuarios.Tabla.setModel(ModeloTablaUsuarios.getModeloTabla());
        
    }
    
    private void llenarModeloConSeleccionFilaTabla(){
        //obtiene el numero de filas de la tabla seleccionada
        int filaSeleccionada = VistaBusquedaUsuarios.Tabla.getSelectedRow();
        
        if (filaSeleccionada!=-1) {//-1 == no sse selecciona algo
            
            String usuario = ModeloTablaUsuarios.getModeloTabla().getValueAt(filaSeleccionada, 0).toString();
            
            String nombre = ModeloTablaUsuarios.getModeloTabla().getValueAt(filaSeleccionada, 1).toString();
            
            String tipo = ModeloTablaUsuarios.getModeloTabla().getValueAt(filaSeleccionada, 2).toString();
            
            
            //LLENAR EL ModeloArticulos
            ModeloUsuarios.setUsuario(usuario);
            ModeloUsuarios.setNombre(nombre);
            ModeloUsuarios.setTipo(tipo);
            
                    
            
                    
            
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
       if (e.getSource() == VistaBusquedaUsuarios.BtnAceptar) {
               VistaBusquedaUsuarios.BtnAceptar.setCursor(new Cursor(HAND_CURSOR));
               llenarModeloConSeleccionFilaTabla();
               VistaBusquedaUsuarios.dispose();//Cierra la ventana de bussqueda
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
        if (e.getSource() == VistaBusquedaUsuarios.BtnAceptar) {
               VistaBusquedaUsuarios.BtnAceptar.setCursor(new Cursor(HAND_CURSOR));
               
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
        if (e.getSource() == VistaBusquedaUsuarios.TxtNombre) {
               VistaBusquedaUsuarios.TxtNombre.setCursor(new Cursor(TEXT_CURSOR));
               ConsultasUsuarios.buscarFrase(VistaBusquedaUsuarios.TxtNombre, ModeloTablaUsuarios.getModeloTabla());
               
        }
    }

   
   
    
    
    
}
