/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.clientes;

import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.TEXT_CURSOR;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.clientes.ConsultasClientes;
import modelo.clientes.ModeloClientes;
import vista.clientes.VistaClientes;
/**
 *
 * @author Fernando
 */
public class ControladorVistaClientes implements MouseListener{
    protected ModeloClientes ModeloClientes;
    protected VistaClientes VistaClientes;
    
    
    protected ConsultasClientes ConsultasClientes = new ConsultasClientes();
    
    public ControladorVistaClientes(ModeloClientes ModeloClientes, VistaClientes VistaClientes) {
       this.ModeloClientes = ModeloClientes;
        this.VistaClientes = VistaClientes;
         
        oyentes();//Llamada a los oyentes
       this.VistaClientes.setVisible(true);
    }
 /**
 * Oyentes.
 */
    private void oyentes() { 
        //TXT
        VistaClientes.TxtNombre.addMouseListener(this);
        VistaClientes.TxtApPaterno.addMouseListener(this);
        VistaClientes.TxtApMaterno.addMouseListener(this);
        VistaClientes.TxtTelefono.addMouseListener(this);
        VistaClientes.TxtDireccion.addMouseListener(this);
        VistaClientes.TxtRFC.addMouseListener(this);
        VistaClientes.TxtIdCliente.addMouseListener(this);
        //Lbl
        VistaClientes.LblTitulo.addMouseListener(this);
        VistaClientes.LblNombre.addMouseListener(this);
        VistaClientes.LblApPaterno.addMouseListener(this);
        VistaClientes.LblApMaterno.addMouseListener(this);
        VistaClientes.LblDireccion.addMouseListener(this);
        VistaClientes.LblRFC.addMouseListener(this);
        VistaClientes.LblIdCliente.addMouseListener(this);
        //BTN
        VistaClientes.BtnBorrar.addMouseListener(this);
        VistaClientes.BtnIngresar.addMouseListener(this);
        VistaClientes.BtnActualizar.addMouseListener(this);
        VistaClientes.BtnSalir.addMouseListener(this);
        VistaClientes.BtnBuscar.addMouseListener(this);
        VistaClientes.BtnSearch.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
     if (e.getSource() == VistaClientes.BtnBorrar) {
               VistaClientes.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
               eliminar();
        }
    if (e.getSource() == VistaClientes.BtnIngresar) {
               VistaClientes.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
                  insertar();
        }
    if (e.getSource() == VistaClientes.BtnActualizar) {
               VistaClientes.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
                  modificar();
        }
    if (e.getSource() == VistaClientes.BtnBuscar) {
               VistaClientes.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
                  buscar();
        }
    if (e.getSource() == VistaClientes.BtnSearch) {
               VistaClientes.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                 //Pendiente
        }
    if (e.getSource() == VistaClientes.BtnSalir) {
               VistaClientes.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
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
        if (e.getSource() == VistaClientes.TxtNombre) {
               VistaClientes.TxtNombre.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaClientes.TxtApPaterno) {
               VistaClientes.TxtApPaterno.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaClientes.TxtApMaterno) {
               VistaClientes.TxtApMaterno.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaClientes.TxtTelefono) {
               VistaClientes.TxtTelefono.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaClientes.TxtDireccion) {
               VistaClientes.TxtDireccion.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaClientes.TxtRFC) {
               VistaClientes.TxtRFC.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaClientes.TxtIdCliente) {
               VistaClientes.TxtIdCliente.setCursor(new Cursor(TEXT_CURSOR));

        }
    
    if (e.getSource() == VistaClientes.BtnBorrar) {
               VistaClientes.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaClientes.BtnIngresar) {
               VistaClientes.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
                 
        }
    if (e.getSource() == VistaClientes.BtnActualizar) {
               VistaClientes.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
                
        }
    if (e.getSource() == VistaClientes.BtnBuscar) {
               VistaClientes.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaClientes.BtnSearch) {
               VistaClientes.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                 //Pendiente
        }
    if (e.getSource() == VistaClientes.BtnSalir) {
               VistaClientes.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
            
        }
    
    }
    //BTN
        

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
    private void llenarModeloConVista(){
         ModeloClientes.setIdCliente(Integer.parseInt(VistaClientes.TxtIdCliente.getText()));
        ModeloClientes.setNombre(VistaClientes.TxtNombre.getText());
        ModeloClientes.setApPaterno(VistaClientes.TxtApPaterno.getText());
        ModeloClientes.setApMaterno(VistaClientes.TxtApMaterno.getText());
        ModeloClientes.setDireccion(VistaClientes.TxtDireccion.getText());
        ModeloClientes.setRFC(VistaClientes.TxtRFC.getText());
        ModeloClientes.setTelefono(Integer.parseInt(VistaClientes.TxtTelefono.getText()));
       
    }
    
    private void llenarVistaConModelo(){
        VistaClientes.TxtIdCliente.setText(ModeloClientes.getIdCliente()+"");
         VistaClientes.TxtNombre.setText(ModeloClientes.getNombre()+"");
          VistaClientes.TxtApPaterno.setText(ModeloClientes.getApPaterno()+"");
           VistaClientes.TxtApMaterno.setText(ModeloClientes.getApMaterno()+"");
            VistaClientes.TxtTelefono.setText(ModeloClientes.getTelefono()+"");
             VistaClientes.TxtDireccion.setText(ModeloClientes.getDireccion()+"");
              VistaClientes.TxtRFC.setText(ModeloClientes.getRFC()+"");
               
               
    }
    private void limpiaarCampos(){
        VistaClientes.TxtIdCliente.setText("");
         VistaClientes.TxtNombre.setText("");
          VistaClientes.TxtApPaterno.setText("");
           VistaClientes.TxtApMaterno.setText("");
            VistaClientes.TxtTelefono.setText("");
             VistaClientes.TxtDireccion.setText("");
              VistaClientes.TxtRFC.setText("");
               
               
    }
    private boolean validarCampoId(){
        if (VistaClientes.TxtIdCliente.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private boolean validarTodosLosCampos(){
        if (VistaClientes.TxtIdCliente.getText().isEmpty()||
                VistaClientes.TxtApPaterno.getText().isEmpty()||
                VistaClientes.TxtApMaterno.getText().isEmpty()||
                VistaClientes.TxtTelefono.getText().isEmpty()||
                VistaClientes.TxtDireccion.getText().isEmpty()||
                VistaClientes.TxtRFC.getText().isEmpty()||
                VistaClientes.TxtNombre.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private void insertar(){
        if (validarTodosLosCampos()) {
           
        ModeloClientes.setIdCliente(Integer.parseInt(VistaClientes.TxtIdCliente.getText()));
        if (ConsultasClientes.buscar(ModeloClientes) == true) {
           JOptionPane.showMessageDialog(VistaClientes, "Ese Cliente ya existe");
        }else{
          llenarModeloConVista();//llenarlo con datos
            if (ConsultasClientes.insertar(ModeloClientes)==true) {
              JOptionPane.showMessageDialog(null, "Cliente Guardo Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar el registro");
        
            }
        }
    }else{
       JOptionPane.showMessageDialog(null, "El campo Id no debe estar vacio");
        
        }
}
    private void modificar(){
        if (validarTodosLosCampos()) {
            llenarModeloConVista();//DATOS DE MODIFICACION
            
            //para buscar el dato en el modelo Temporal y no modifique al modelo original
            ModeloClientes ModeloTemporal = new ModeloClientes();
            ModeloTemporal.setIdCliente(Integer.parseInt(VistaClientes.TxtIdCliente.getText()));
        
            if (ConsultasClientes.buscar(ModeloTemporal)==false) {//Busca con modelo temporal
                JOptionPane.showMessageDialog(VistaClientes, "Ese Cliente no existe");
                
            }else{
                if (ConsultasClientes.modificar(ModeloClientes)) {
              JOptionPane.showMessageDialog(null, "Cliente Modificado Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar el Cliente");
        
            }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios");
        }
    }
    private void eliminar(){
        if (validarCampoId()) {
           
        ModeloClientes.setIdCliente(Integer.parseInt(VistaClientes.TxtIdCliente.getText()));
        if (ConsultasClientes.buscar(ModeloClientes) == false) {
           JOptionPane.showMessageDialog(VistaClientes, "Ese Cliente no existe");
        }else{//PRoducto si existe por lo tanto se puede eliminar
          
            if (ConsultasClientes.eliminar(ModeloClientes)) {
              JOptionPane.showMessageDialog(null, "Cliente Eliminado Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
        
            }
        }
    }else{
       JOptionPane.showMessageDialog(null, "El campo Id no debe estar vacio");
        
        }
}
    private void buscar(){//Se busca por codigo En TxtId
        if (validarCampoId()) {
           
        ModeloClientes.setIdCliente(Integer.parseInt(VistaClientes.TxtIdCliente.getText()));
        if (ConsultasClientes.buscar(ModeloClientes) == true) {//Producto si existe
           llenarVistaConModelo();//El modelo ya trae los datos buscados
        }else{
                JOptionPane.showMessageDialog(VistaClientes.LblRFC, "El Regitro no existe");
 
        }
    }else{
       JOptionPane.showMessageDialog(VistaClientes, "Los campos no deben estar vacios");
        
        }
}
    private void salir(){
        int opc = JOptionPane.showConfirmDialog(VistaClientes, "¿Deseas salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opc == 0)  VistaClientes.dispose();
            
        
    }
            
}
