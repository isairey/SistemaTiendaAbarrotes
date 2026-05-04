/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.proveedores;

import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.TEXT_CURSOR;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.proveedores.ConsultasProveedores;

import modelo.proveedores.ModeloProveedores;

import vista.proveedores.VistaProveedores;
/**
 *
 * @author Fernando
 */
public class ControladorVistaProveedores implements MouseListener{
    protected ModeloProveedores ModeloProveedores;
    protected VistaProveedores VistaProveedores;
    
    
    protected ConsultasProveedores ConsultasProveedores = new ConsultasProveedores();
    
    public ControladorVistaProveedores(ModeloProveedores ModeloProveedores, VistaProveedores VistaProveedores) {
       this.ModeloProveedores = ModeloProveedores;
        this.VistaProveedores = VistaProveedores;
         
        oyentes();//Llamada a los oyentes
       this.VistaProveedores.setVisible(true);
    }
 /**
 * Oyentes.
 */
    private void oyentes() { 
        //TXT
        VistaProveedores.TxtId.addMouseListener(this);
        VistaProveedores.TxtEmpresa.addMouseListener(this);
        VistaProveedores.TxtNombre.addMouseListener(this);
        VistaProveedores.TxtApellidoPaterno.addMouseListener(this);
        VistaProveedores.TxtApellidoMaterno.addMouseListener(this);
        VistaProveedores.TxtTelefono.addMouseListener(this);
        
        
        //Lbl
        VistaProveedores.LblTitulo.addMouseListener(this);
        VistaProveedores.LblNombre.addMouseListener(this);
        VistaProveedores.LblApellidoPaterno.addMouseListener(this);
        VistaProveedores.LblApellidoMaterno.addMouseListener(this);
        VistaProveedores.LblEmpresa.addMouseListener(this);
        VistaProveedores.LblId.addMouseListener(this);
        //BTN
        VistaProveedores.BtnBorrar.addMouseListener(this);
        VistaProveedores.BtnIngresar.addMouseListener(this);
        VistaProveedores.BtnActualizar.addMouseListener(this);
        VistaProveedores.BtnSalir.addMouseListener(this);
        VistaProveedores.BtnBuscar.addMouseListener(this);
        VistaProveedores.BtnSearch.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
     if (e.getSource() == VistaProveedores.BtnBorrar) {
               VistaProveedores.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
               eliminar();
        }
    if (e.getSource() == VistaProveedores.BtnIngresar) {
               VistaProveedores.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
                  insertar();
        }
    if (e.getSource() == VistaProveedores.BtnActualizar) {
               VistaProveedores.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
                  modificar();
        }
    if (e.getSource() == VistaProveedores.BtnBuscar) {
               VistaProveedores.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
                  buscar();
        }
    if (e.getSource() == VistaProveedores.BtnSearch) {
               VistaProveedores.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                 //Pendiente
        }
    if (e.getSource() == VistaProveedores.BtnSalir) {
               VistaProveedores.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
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
        if (e.getSource() == VistaProveedores.TxtNombre) {
               VistaProveedores.TxtNombre.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaProveedores.TxtApellidoPaterno) {
               VistaProveedores.TxtApellidoPaterno.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaProveedores.TxtApellidoMaterno) {
               VistaProveedores.TxtApellidoPaterno.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaProveedores.TxtTelefono) {
               VistaProveedores.TxtTelefono.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaProveedores.TxtEmpresa) {
               VistaProveedores.TxtEmpresa.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaProveedores.TxtId) {
               VistaProveedores.TxtId.setCursor(new Cursor(TEXT_CURSOR));

        }
    
    if (e.getSource() == VistaProveedores.BtnBorrar) {
               VistaProveedores.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaProveedores.BtnIngresar) {
               VistaProveedores.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
                 
        }
    if (e.getSource() == VistaProveedores.BtnActualizar) {
               VistaProveedores.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
                
        }
    if (e.getSource() == VistaProveedores.BtnBuscar) {
               VistaProveedores.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaProveedores.BtnSearch) {
               VistaProveedores.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                 //Pendiente
        }
    if (e.getSource() == VistaProveedores.BtnSalir) {
               VistaProveedores.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
            
        }
    
    }
    //BTN
        

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
    private void llenarModeloConVista(){
        ModeloProveedores.setId(Integer.parseInt(VistaProveedores.TxtId.getText()));
        ModeloProveedores.setEmpresa(VistaProveedores.TxtEmpresa.getText());
        ModeloProveedores.setNombre(VistaProveedores.TxtNombre.getText());
        ModeloProveedores.setApellidoPaterno(VistaProveedores.TxtApellidoPaterno.getText());
        ModeloProveedores.setApellidoMaterno(VistaProveedores.TxtApellidoMaterno.getText());
        ModeloProveedores.setTelefono(Integer.parseInt(VistaProveedores.TxtTelefono.getText()));
        
        
    }
    
    private void llenarVistaConModelo(){
       VistaProveedores.TxtId.setText(ModeloProveedores.getId()+"");
        VistaProveedores.TxtEmpresa.setText(ModeloProveedores.getEmpresa()+"");
         VistaProveedores.TxtNombre.setText(ModeloProveedores.getNombre()+"");
          VistaProveedores.TxtApellidoPaterno.setText(ModeloProveedores.getApellidoPaterno()+"");
           VistaProveedores.TxtApellidoMaterno.setText(ModeloProveedores.getApellidoMaterno()+"");
            VistaProveedores.TxtTelefono.setText(ModeloProveedores.getTelefono()+"");
             
              
               
    }
    private void limpiaarCampos(){
        VistaProveedores.TxtId.setText("");
        VistaProveedores.TxtEmpresa.setText("");
         VistaProveedores.TxtNombre.setText("");
          VistaProveedores.TxtApellidoPaterno.setText("");
           VistaProveedores.TxtApellidoMaterno.setText("");
            VistaProveedores.TxtTelefono.setText("");
             

               
               
    }
    private boolean validarCampoId(){
        if (VistaProveedores.TxtId.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private boolean validarTodosLosCampos(){
        if (VistaProveedores.TxtId.getText().isEmpty()||VistaProveedores.TxtEmpresa.getText().isEmpty()||
                VistaProveedores.TxtNombre.getText().isEmpty()||
                VistaProveedores.TxtApellidoPaterno.getText().isEmpty()||
                VistaProveedores.TxtApellidoMaterno.getText().isEmpty()||
                VistaProveedores.TxtTelefono.getText().isEmpty())
                 {
            return false;
        }
        return true;
    }
    private void insertar(){
        if (validarTodosLosCampos()) {
           
        ModeloProveedores.setId(Integer.parseInt(VistaProveedores.TxtId.getText()));
        if (ConsultasProveedores.buscar(ModeloProveedores) == true) {
           JOptionPane.showMessageDialog(VistaProveedores, "Ese Proveedor ya existe");
        }else{
          llenarModeloConVista();//llenarlo con datos
            if (ConsultasProveedores.insertar(ModeloProveedores)==true) {
              JOptionPane.showMessageDialog(null, "Proveedor Guardado Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar el Proveedor");
        
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
            ModeloProveedores ModeloTemporal = new ModeloProveedores();
            ModeloTemporal.setId(Integer.parseInt(VistaProveedores.TxtId.getText()));
        
            if (ConsultasProveedores.buscar(ModeloTemporal)==false) {//Busca con modelo temporal
                JOptionPane.showMessageDialog(VistaProveedores, "Ese Proveedor no existe");
                
            }else{
                if (ConsultasProveedores.modificar(ModeloProveedores)) {
              JOptionPane.showMessageDialog(null, "Proveedor Modificado Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar el Proveedor");
        
            }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios");
        }
    }
    private void eliminar(){
        if (validarCampoId()) {
           
        ModeloProveedores.setId(Integer.parseInt(VistaProveedores.TxtId.getText()));
        if (ConsultasProveedores.buscar(ModeloProveedores) == false) {
           JOptionPane.showMessageDialog(VistaProveedores, "Ese Proveedor no existe");
        }else{//PRoducto si existe por lomtanto se puede eliminar
          
            if (ConsultasProveedores.eliminar(ModeloProveedores)) {
              JOptionPane.showMessageDialog(null, "Proveedor Eliminado Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el Proveedor");
        
            }
        }
    }else{
       JOptionPane.showMessageDialog(null, "El campo Id no debe estar vacio");
        
        }
}
    private void buscar(){//Se busca por codigo En TxtId
        if (validarCampoId()) {
           
        ModeloProveedores.setId(Integer.parseInt(VistaProveedores.TxtId.getText()));
        if (ConsultasProveedores.buscar(ModeloProveedores) == true) {//Producto si existe
           llenarVistaConModelo();//El modelo ya trae los datos buscados
        }else{
                JOptionPane.showMessageDialog(VistaProveedores, "El Proveedor no existe");
 
        }
    }else{
       JOptionPane.showMessageDialog(VistaProveedores, "Los campos no deben estar vacios");
        
        }
}
    private void salir(){
        int opc = JOptionPane.showConfirmDialog(VistaProveedores, "¿Deseas salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opc == 0)  VistaProveedores.dispose();
            
        
    }
            
}
