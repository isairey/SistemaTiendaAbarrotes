/*
 * CONTROLADOR VISTA ARTICULOS
 */
package controlador.empleados;

import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.TEXT_CURSOR;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

import modelo.articulos.ModeloArticulos;
import modelo.empleados.ConsultasEmpleados;
import modelo.empleados.ModeloEmpleados;

import vista.empleados.VistaEmpleados;

/**
 * Controlador Vista Empleados.
 * Controla un objeto de tipo VistaEmpleados.
 * @author Noemi Zavalza Valderrama
 * @version 1.
 * @since 06/11/2023
 */
public class ControladorVistaEmpleados implements MouseListener{
    protected ModeloEmpleados ModeloEmpleados;
    protected VistaEmpleados VistaEmpleados;
 
    
    protected ConsultasEmpleados ConsultasEmpleados = new ConsultasEmpleados();
    
    public ControladorVistaEmpleados(ModeloEmpleados ModeloEmpleados, VistaEmpleados VistaEmpleados) {
       this.ModeloEmpleados = ModeloEmpleados;
        this.VistaEmpleados = VistaEmpleados;
         
        oyentes();//Llamada a los oyentes
       this.VistaEmpleados.setVisible(true);
    }
/**
 * Oyentes.
 */
    private void oyentes() {
        //TXT
        VistaEmpleados.TxtId.addMouseListener(this);
        VistaEmpleados.TxtFechaNac.addMouseListener(this);
        VistaEmpleados.TxtNombre.addMouseListener(this);
        VistaEmpleados.TxtApellidom.addMouseListener(this);
        VistaEmpleados.TxtApellidop.addMouseListener(this);
        VistaEmpleados.TxtHorario.addMouseListener(this);
        VistaEmpleados.TxtTelefono.addMouseListener(this);

        //Lbl
        VistaEmpleados.LblId.addMouseListener(this);
        VistaEmpleados.LblNombre.addMouseListener(this);
        VistaEmpleados.LblApellidom.addMouseListener(this);
        VistaEmpleados.LblApellidop.addMouseListener(this);
        VistaEmpleados.LblHorario.addMouseListener(this);
        VistaEmpleados.LblTelefono.addMouseListener(this);

       
        //BTN
        VistaEmpleados.BtnBorrar.addMouseListener(this);
        VistaEmpleados.BtnIngresar.addMouseListener(this);
        VistaEmpleados.BtnActualizar.addMouseListener(this);
        VistaEmpleados.BtnSalir.addMouseListener(this);
        VistaEmpleados.BtnBuscar.addMouseListener(this);
        VistaEmpleados.BtnSearch.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Txt
    
     if (e.getSource() == VistaEmpleados.BtnBorrar) {
               VistaEmpleados.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
               eliminar();
        }
    if (e.getSource() == VistaEmpleados.BtnIngresar) {
               VistaEmpleados.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
                  insertar();
        }
    if (e.getSource() == VistaEmpleados.BtnActualizar) {
               VistaEmpleados.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
                  modificar();
        }
    if (e.getSource() == VistaEmpleados.BtnBuscar) {
               VistaEmpleados.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
                  buscar();
        }
    if (e.getSource() == VistaEmpleados.BtnSearch) {
               VistaEmpleados.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                 //Pendiente
        }
    if (e.getSource() == VistaEmpleados.BtnSalir) {
               VistaEmpleados.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
               salir();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
            //Txt
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
     public void mouseEntered(MouseEvent e) {
            //Txt
        if (e.getSource() == VistaEmpleados.TxtId) {
               VistaEmpleados.TxtId.setCursor(new Cursor(TEXT_CURSOR));

        }

    if (e.getSource() == VistaEmpleados.TxtNombre) {
               VistaEmpleados.TxtNombre.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaEmpleados.TxtApellidop) {
               VistaEmpleados.TxtApellidop.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaEmpleados.TxtApellidom) {
               VistaEmpleados.TxtApellidom.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaEmpleados.TxtFechaNac) {
               VistaEmpleados.TxtFechaNac.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaEmpleados.TxtHorario) {
               VistaEmpleados.TxtHorario.setCursor(new Cursor(TEXT_CURSOR));
               
 if (e.getSource() == VistaEmpleados.TxtTelefono) {
               VistaEmpleados.TxtTelefono.setCursor(new Cursor(TEXT_CURSOR));
        }
    
    if (e.getSource() == VistaEmpleados.BtnBorrar) {
               VistaEmpleados.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaEmpleados.BtnIngresar) {
               VistaEmpleados.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
                 
        }
    if (e.getSource() == VistaEmpleados.BtnActualizar) {
               VistaEmpleados.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
                
        }
    if (e.getSource() == VistaEmpleados.BtnBuscar) {
               VistaEmpleados.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaEmpleados.BtnSearch) {
               VistaEmpleados.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                 //Pendiente
        }
    if (e.getSource() == VistaEmpleados.BtnSalir) {
               VistaEmpleados.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
            
        }
    }
    }
    
        

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
    private void llenarModeloConVista(){
        ModeloEmpleados.setIdEmpleados(Integer.parseInt(VistaEmpleados.TxtId.getText()));
        ModeloEmpleados.setNombre(VistaEmpleados.TxtNombre.getText());
        ModeloEmpleados.setApellidop(VistaEmpleados.TxtApellidop.getText());
        ModeloEmpleados.setApellidom(VistaEmpleados.TxtApellidom.getText());
        ModeloEmpleados.setFechaNac(VistaEmpleados.TxtFechaNac.getText());
        ModeloEmpleados.setHorario(VistaEmpleados.TxtHorario.getText());
        ModeloEmpleados.setTelefono(Integer.parseInt(VistaEmpleados.TxtTelefono.getText()));
        
    }
    
    private void llenarVistaConModelo(){
         VistaEmpleados.TxtId.setText(ModeloEmpleados.getIdEmpleados()+"");
           VistaEmpleados.TxtNombre.setText(ModeloEmpleados.getNombre()+"");
            VistaEmpleados.TxtApellidop.setText(ModeloEmpleados.getApellidop()+"");
             VistaEmpleados.TxtApellidom.setText(ModeloEmpleados.getApellidom()+"");
             VistaEmpleados.TxtFechaNac.setText(ModeloEmpleados.getFechaNac()+"");
              VistaEmpleados.TxtTelefono.setText(ModeloEmpleados.getTelefono()+"");
               VistaEmpleados.TxtHorario.setText(ModeloEmpleados.getHorario()+"");
              
               
    }
    private void limpiaarCampos(){
         VistaEmpleados.TxtId.setText("");
           VistaEmpleados.TxtNombre.setText("");
            VistaEmpleados.TxtApellidop.setText("");
             VistaEmpleados.TxtFechaNac.setText("");
              VistaEmpleados.TxtApellidom.setText("");
               VistaEmpleados.TxtHorario.setText("");
               VistaEmpleados.TxtTelefono.setText("");             
    }
    private boolean validarCampoId(){
        if (VistaEmpleados.TxtId.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private boolean validarTodosLosCampos(){
        if (VistaEmpleados.TxtId.getText().isEmpty()||
                VistaEmpleados.TxtNombre.getText().isEmpty()||
                VistaEmpleados.TxtApellidop.getText().isEmpty()||
                VistaEmpleados.TxtApellidom.getText().isEmpty()||
                VistaEmpleados.TxtFechaNac.getText().isEmpty()||
                VistaEmpleados.TxtHorario.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private void insertar(){
        if (validarTodosLosCampos()) {
           
        ModeloEmpleados.setIdEmpleados(Integer.parseInt(VistaEmpleados.TxtId.getText()));
        if (ConsultasEmpleados.buscar(ModeloEmpleados) == true) {
           JOptionPane.showMessageDialog(VistaEmpleados, "Ese Empleado ya existe", "Empleados",0);
        }else{
          llenarModeloConVista();//llenarlo con datos
            if (ConsultasEmpleados.insertar(ModeloEmpleados)==true) {
              JOptionPane.showMessageDialog(null, "Empleado Guardado Correctamente", "Empleados",1);
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar el registro", "Empleados",0);
        
            }
        }
    }else{
       JOptionPane.showMessageDialog(null, "El campo Id no debe estar vacio", "Empleados",0);
        
        }
}
   private void modificar(){
        if (validarTodosLosCampos()) {
            llenarModeloConVista();//DATOS DE MODIFICACION
            
            //para buscar el dato en el modelo Temporal y no modifique al modelo original
            ModeloEmpleados ModeloTemporal = new ModeloEmpleados();
            ModeloTemporal.setIdEmpleados(Integer.parseInt(VistaEmpleados.TxtId.getText()));
        
            if (ConsultasEmpleados.buscar(ModeloTemporal)==false) {//Busca con modelo temporal
                JOptionPane.showMessageDialog(VistaEmpleados, "Ese Empleado no existe");
                
            }else{
                if (ConsultasEmpleados.modificar(ModeloEmpleados)) {
              JOptionPane.showMessageDialog(null, "Empleado Modificado Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar el Empleado");
        
            }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios");
        }
    }
    private void eliminar(){
        if (validarCampoId()) {
           
        ModeloEmpleados.setIdEmpleados(Integer.parseInt(VistaEmpleados.TxtId.getText()));
        if (ConsultasEmpleados.buscar(ModeloEmpleados) == false) {
           JOptionPane.showMessageDialog(VistaEmpleados, "Ese Empleado no existe", "Empleados",0);
        }else{//PRoducto si existe por lomtanto se puede eliminar
          
            if (ConsultasEmpleados.eliminar(ModeloEmpleados)) {
              JOptionPane.showMessageDialog(null, "Empleado Eliminado Correctamente", "Empleados",1);
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro", "Empleados",0);
        
            }
        }
    }else{
       JOptionPane.showMessageDialog(null, "El campo Id no debe estar vacio", "Empleados",0);
        
        }
}
    private void buscar(){//Se busca por codigo En TxtId
        if (validarCampoId()) {
           
        ModeloEmpleados.setIdEmpleados(Integer.parseInt(VistaEmpleados.TxtId.getText()));
        if (ConsultasEmpleados.buscar(ModeloEmpleados) == true) {//Producto si existe
           llenarVistaConModelo();//El modelo ya trae los datos buscados
        }else{
                JOptionPane.showMessageDialog(VistaEmpleados.LblNombre, "El Regitro no existe", "Empleados",0);
 
        }
    }else{
       JOptionPane.showMessageDialog(VistaEmpleados, "Los campos no deben estar vacios", "Empleados",0);
        
        }
}
    private void salir(){
        int opc = JOptionPane.showConfirmDialog(VistaEmpleados, "¿Deseas salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opc == 0)  VistaEmpleados.dispose();
            
        
    }

            
}

