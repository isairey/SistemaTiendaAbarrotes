/*
 * CONTROLADOR VISTA Ventas
 */
package controlador.ventas;

import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.TEXT_CURSOR;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.tablas.ventas.ModeloTablaVentas;
import modelo.ventas.ConsultasVentas;
import modelo.ventas.ModeloVentas;
import vista.ventas.VistaBusquedaVentas;

import vista.ventas.VistaVentas;

/**
 * Controlador Vista Ventas.
 * Controla un objeto de tipo VistaVentas.
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 06/11/23.
 */
public class ControladorVistaVentas implements MouseListener, KeyListener{
    protected ModeloVentas ModeloVentas;
    protected VistaVentas VistaVentas;
 
    
    protected ConsultasVentas ConsultasVentas = new ConsultasVentas();
    
    public ControladorVistaVentas(ModeloVentas ModeloVentas, VistaVentas VistaVentas) {
       this.ModeloVentas = ModeloVentas;
        this.VistaVentas = VistaVentas;
         
        oyentes();//Llamada a los oyentes
       this.VistaVentas.setVisible(true);
    }
/**
 * Oyentes.
 */
    private void oyentes() {
        //TXT
        VistaVentas.TxtIdVenta.addMouseListener(this);
        VistaVentas.TxtIdArticulo.addMouseListener(this);
        VistaVentas.TxtFecha.addMouseListener(this);
        VistaVentas.TxtMonto.addMouseListener(this);
        VistaVentas.TxtIdCliente.addMouseListener(this);
        VistaVentas.TxtIdEmpleados.addMouseListener(this);
        
        //BTN
        VistaVentas.BtnBorrar.addMouseListener(this);
        VistaVentas.BtnIngresar.addMouseListener(this);
        VistaVentas.BtnActualizar.addMouseListener(this);
        VistaVentas.BtnSalir.addMouseListener(this);
        VistaVentas.BtnBuscar.addMouseListener(this);
        VistaVentas.BtnSearch.addMouseListener(this);
    }
    private void busquedaMVC(){
        //Crear el MVC para la ventana Modale de buqueda +  el modelo tabla
        ModeloTablaVentas ModeloTablaVentas = new ModeloTablaVentas();
        VistaBusquedaVentas VistaBusquedaVentas = new VistaBusquedaVentas(new JFrame(), true);//Original
        
        //COntrolador
        ControladorVistaBusquedaVentas ControladorSearch = new ControladorVistaBusquedaVentas(ModeloTablaVentas, ModeloVentas, VistaBusquedaVentas);
        llenarVistaConModelo();
        }

    @Override
    public void mouseClicked(MouseEvent e) {
       
  
     if (e.getSource() == VistaVentas.BtnBorrar) {
               VistaVentas.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
               eliminar();
        }
    if (e.getSource() == VistaVentas.BtnIngresar) {
               VistaVentas.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
                  insertar();
        }
    if (e.getSource() == VistaVentas.BtnActualizar) {
               VistaVentas.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
                  modificar();
        }
    if (e.getSource() == VistaVentas.BtnBuscar) {
               VistaVentas.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
                  buscar();
        }
    if (e.getSource() == VistaVentas.BtnSearch) {
               VistaVentas.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                 busquedaMVC();
        }
    if (e.getSource() == VistaVentas.BtnSalir) {
               VistaVentas.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
               salir();
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
           //Txt
    if (e.getSource() == VistaVentas.TxtIdVenta) {
               VistaVentas.TxtIdVenta.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaVentas.TxtIdArticulo) {
               VistaVentas.TxtIdArticulo.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaVentas.TxtFecha) {
               VistaVentas.TxtFecha.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaVentas.TxtMonto) {
               VistaVentas.TxtMonto.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaVentas.TxtIdCliente) {
               VistaVentas.TxtIdCliente.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaVentas.TxtIdEmpleados) {
               VistaVentas.TxtIdEmpleados.setCursor(new Cursor(TEXT_CURSOR));

        }
    
    if (e.getSource() == VistaVentas.BtnBorrar) {
               VistaVentas.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaVentas.BtnIngresar) {
               VistaVentas.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
                 
        }
    if (e.getSource() == VistaVentas.BtnActualizar) {
               VistaVentas.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
                
        }
    if (e.getSource() == VistaVentas.BtnBuscar) {
               VistaVentas.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaVentas.BtnSearch) {
               VistaVentas.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                 //Pendiente
        }
    if (e.getSource() == VistaVentas.BtnSalir) {
               VistaVentas.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
            
        }
    
    }
    //BTN
        

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
    private void llenarModeloConVista(){
        ModeloVentas.setIdVenta(Integer.parseInt(VistaVentas.TxtIdVenta.getText()));
        ModeloVentas.setIdArticulo(Integer.parseInt(VistaVentas.TxtIdArticulo.getText()));
        ModeloVentas.setFecha(VistaVentas.TxtFecha.getText());
        ModeloVentas.setMonto(Float.parseFloat(VistaVentas.TxtMonto.getText()));
        ModeloVentas.setIdCliente(Integer.parseInt(VistaVentas.TxtIdCliente.getText()));
        ModeloVentas.setIdEmpleados(Integer.parseInt(VistaVentas.TxtIdEmpleados.getText()));
    }
    
    private void llenarVistaConModelo(){
         VistaVentas.TxtIdVenta.setText(ModeloVentas.getIdVenta()+"");
          VistaVentas.TxtIdArticulo.setText(ModeloVentas.getIdArticulo()+"");
           VistaVentas.TxtFecha.setText(ModeloVentas.getFecha()+"");
            VistaVentas.TxtMonto.setText(ModeloVentas.getMonto()+"");
             VistaVentas.TxtIdCliente.setText(ModeloVentas.getIdCliente()+"");
              VistaVentas.TxtIdEmpleados.setText(ModeloVentas.getIdEmpleados()+"");
               
    }
    private void limpiaarCampos(){
         VistaVentas.TxtIdVenta.setText("");
          VistaVentas.TxtIdArticulo.setText("");
           VistaVentas.TxtFecha.setText("");
            VistaVentas.TxtMonto.setText("");
             VistaVentas.TxtIdCliente.setText("");
              VistaVentas.TxtIdEmpleados.setText("");
               
    }
    private boolean validarCampoId(){
        if (VistaVentas.TxtIdVenta.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private boolean validarTodosLosCampos(){
        if (VistaVentas.TxtIdVenta.getText().isEmpty()||
                VistaVentas.TxtIdArticulo.getText().isEmpty()||
                VistaVentas.TxtFecha.getText().isEmpty()||
                VistaVentas.TxtMonto.getText().isEmpty()||
                VistaVentas.TxtIdCliente.getText().isEmpty()||
                VistaVentas.TxtIdEmpleados.getText().isEmpty()){
                return false;
        }
        return true;
    }
    private void insertar(){
        if (validarTodosLosCampos()) {
           
        ModeloVentas.setIdVenta(Integer.parseInt(VistaVentas.TxtIdVenta.getText()));
        if (ConsultasVentas.buscar(ModeloVentas) == true) {
           JOptionPane.showMessageDialog(VistaVentas, "Esa Venta ya existe");
        }else{
          llenarModeloConVista();//llenarlo con datos
            if (ConsultasVentas.insertar(ModeloVentas)==true) {
              JOptionPane.showMessageDialog(null, "Venta Guardada Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar la Venta");
        
            }
        }
    }else{
       JOptionPane.showMessageDialog(null, "El campo IdVenta no debe estar vacio");
        
        }
}
    private void modificar(){
        if (validarTodosLosCampos()) {
            llenarModeloConVista();//DATOS DE MODIFICACION
            
            //para buscar el dato en el modelo Temporal y no modifique al modelo original
            ModeloVentas ModeloTemporal = new ModeloVentas();
            ModeloTemporal.setIdVenta(Integer.parseInt(VistaVentas.TxtIdVenta.getText()));
        
            if (ConsultasVentas.buscar(ModeloTemporal)==false) {//Busca con modelo temporal
                JOptionPane.showMessageDialog(VistaVentas, "Esa Venta no existe");
                
            }else{
                if (ConsultasVentas.modificar(ModeloVentas)) {
              JOptionPane.showMessageDialog(null, "Venta Modificada Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar la Venta");
        
            }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios");
        }
    }
    private void eliminar(){
        if (validarCampoId()) {
           
        ModeloVentas.setIdVenta(Integer.parseInt(VistaVentas.TxtIdVenta.getText()));
        if (ConsultasVentas.buscar(ModeloVentas) == false) {
           JOptionPane.showMessageDialog(VistaVentas, "Esa Venta no existe");
        }else{//PRoducto si existe por lomtanto se puede eliminar
          
            if (ConsultasVentas.eliminar(ModeloVentas)) {
              JOptionPane.showMessageDialog(null, "Venta Eliminada Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar la Venta");
        
            }
        }
    }else{
       JOptionPane.showMessageDialog(null, "El campo IdVenta no debe estar vacio");
        
        }
}
    private void buscar(){//Se busca por codigo En TxtId
        if (validarCampoId()) {
           
        ModeloVentas.setIdVenta(Integer.parseInt(VistaVentas.TxtIdVenta.getText()));
        if (ConsultasVentas.buscar(ModeloVentas) == true) {//Producto si existe
           llenarVistaConModelo();//El modelo ya trae los datos buscados
        }else{
                JOptionPane.showMessageDialog(VistaVentas, "La venta no existe");
 
        }
    }else{
       JOptionPane.showMessageDialog(VistaVentas, "Los campos no deben estar vacios");
        
        }
}
    private void salir(){
        int opc = JOptionPane.showConfirmDialog(VistaVentas, "¿Deseas salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opc == 0)  VistaVentas.dispose();
            
        
    }
        //VALIDACIONEs    
    private boolean validarSoloNumeros(String Cadena, int longitud,KeyEvent e) {
        if ((Cadena.matches("[0-9,.]+") || (Cadena.length() < longitud+1) || (e.getKeyChar() == KeyEvent.VK_SPACE)||!(e.getKeyChar()==KeyEvent.VK_ENTER) || (e.getKeyChar()==KeyEvent.VK_BACK_SPACE))) {
            
            return true;
        }else{
            JOptionPane.showMessageDialog(VistaVentas, "Debes Teclear solo numeros y no \ndebe de  "+ 
                    "estar vacio el campo \ny la longitud no debe ser mayor a " +longitud,"Alerta",0);
            return false;
        }
    }

    private boolean validarSoloReales(String Cadena, int longitud,KeyEvent e) {
        if ((Cadena.matches("[0-9,.]+") || (Cadena.length() < longitud+1) || (e.getKeyChar() == KeyEvent.VK_SPACE)||!(e.getKeyChar()==KeyEvent.VK_ENTER) || (e.getKeyChar()==KeyEvent.VK_BACK_SPACE))) {
            
            return true;
        }else{
            JOptionPane.showMessageDialog(VistaVentas, "Debes Teclear solo numeros y no \ndebe de  "+ 
                    "estar vacio el campo \ny la longitud no debe ser mayor a " +longitud,"Alerta",0);
            return false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == VistaVentas.TxtIdVenta) {
               //validarSoloNumeros(e);
               if (e.getKeyChar()==e.VK_ENTER) {
                   if (validarSoloNumeros(VistaVentas.TxtIdVenta.getText(),5,e)==true) {
                        VistaVentas.TxtIdArticulo.requestFocus();
                   }else{
                       VistaVentas.TxtIdVenta.setText("");//Limpia el campo
                   }
            }
        }
        if (e.getSource() == VistaVentas.TxtIdArticulo) {
               //validarSoloNumeros(e);
               if (e.getKeyChar()==e.VK_ENTER) {
                   if (validarSoloNumeros(VistaVentas.TxtIdArticulo.getText(),5,e)==true) {
                        VistaVentas.TxtFecha.requestFocus();
                   }else{
                       VistaVentas.TxtIdArticulo.setText("");//Limpia el campo
                   }
            }
        }
    if (e.getSource() == VistaVentas.TxtFecha) {
               
               if (e.getKeyChar()==e.VK_ENTER) {
                   
                VistaVentas.TxtMonto.requestFocus();
            }

        }
    if (e.getSource() == VistaVentas.TxtMonto) {
               if (e.getKeyChar()==e.VK_ENTER) {
                   if (validarSoloReales(VistaVentas.TxtMonto.getText(),10,e)==true) {
                       VistaVentas.TxtIdCliente.requestFocus();
                   }else{
                       VistaVentas.TxtMonto.setText("");//Limpia el campo
                   }
                
            }

        }
    if (e.getSource() == VistaVentas.TxtIdCliente) {
               if (e.getKeyChar()==e.VK_ENTER) {
                   if (validarSoloNumeros(VistaVentas.TxtIdCliente.getText(),5,e)==true) {
                        VistaVentas.TxtIdEmpleados.requestFocus();
                   }else{
                       VistaVentas.TxtIdCliente.setText("");//Limpia el campo
                   }
            }
        }
    if (e.getSource() == VistaVentas.TxtIdEmpleados) {
               
               if (e.getKeyChar()==e.VK_ENTER) {
                   if (validarSoloNumeros(VistaVentas.TxtIdEmpleados.getText(),5,e)==true) {
                        VistaVentas.TxtIdVenta.requestFocus();
                   }else{
                       VistaVentas.TxtIdEmpleados.setText("");//Limpia el campo
                   }
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
