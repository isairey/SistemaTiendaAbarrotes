/*
 * CONTROLADOR VISTA USUARIOS
 */
package controlador.usuarios;

import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.TEXT_CURSOR;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.tablas.usuarios.ModeloTablaUsuarios;
import modelo.usuarios.ConsultasUsuarios;
import modelo.usuarios.ModeloUsuarios;
import vista.usuarios.VistaBusquedaUsuarios;
import vista.usuarios.VistaUsuario;


/**
 * Controlador Vista Usuarios.
 * Controla un objeto de tipo VistaUsuarios.
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 06/11/2023
 */
public class ControladorVistaUsuarios implements MouseListener, KeyListener{
    protected ModeloUsuarios ModeloUsuarios;
    protected VistaUsuario VistaUsuario;
 
    
    protected ConsultasUsuarios ConsultasUsuarios = new ConsultasUsuarios();
    
    public ControladorVistaUsuarios(ModeloUsuarios ModeloUsuario, VistaUsuario VistaUsuario) {
       this.ModeloUsuarios = ModeloUsuario;
        this.VistaUsuario = VistaUsuario;
         
        oyentes();//Llamada a los oyentes
       this.VistaUsuario.setVisible(true);
    }
/**
 * Oyentes.
 */
    private void oyentes() {
        //TXT
        VistaUsuario.TxtUsuario.addMouseListener(this);
        VistaUsuario.TxtPass.addMouseListener(this);
        VistaUsuario.TxtNombre.addMouseListener(this);
        VistaUsuario.TxtTipo.addMouseListener(this);
        
        //Lbl
        VistaUsuario.LblUsuario.addMouseListener(this);
        VistaUsuario.LblPass.addMouseListener(this);
        VistaUsuario.LblNombre.addMouseListener(this);
        VistaUsuario.LblTipo.addMouseListener(this);
        
        //BTN
        VistaUsuario.BtnBorrar.addMouseListener(this);
        VistaUsuario.BtnIngresar.addMouseListener(this);
        VistaUsuario.BtnActualizar.addMouseListener(this);
        VistaUsuario.BtnSalir.addMouseListener(this);
        VistaUsuario.BtnBuscar.addMouseListener(this);
        VistaUsuario.BtnSearch.addMouseListener(this);
    }
     private void busquedaMVC(){
        //Crear el MVC para la ventana Modale de buqueda +  el modelo tabla
         ModeloTablaUsuarios ModeloTablaUsuarios = new ModeloTablaUsuarios();
        VistaBusquedaUsuarios VistaBusquedaUsuarios= new VistaBusquedaUsuarios(new JFrame(), true);//Original
        
        //COntrolador
        ControladorVistaBusquedaUsuarios ControladorSearchU = new ControladorVistaBusquedaUsuarios(ModeloTablaUsuarios, ModeloUsuarios, VistaBusquedaUsuarios);
        llenarVistaConModelo();
        }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Txt
    if (e.getSource() == VistaUsuario.TxtUsuario) {
               VistaUsuario.TxtUsuario.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaUsuario.TxtPass) {
               VistaUsuario.TxtPass.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaUsuario.TxtNombre) {
               VistaUsuario.TxtNombre.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaUsuario.TxtTipo) {
               VistaUsuario.TxtTipo.setCursor(new Cursor(TEXT_CURSOR));

        }
    
     if (e.getSource() == VistaUsuario.BtnBorrar) {
               VistaUsuario.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
               eliminar();
        }
    if (e.getSource() == VistaUsuario.BtnIngresar) {
               VistaUsuario.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
        try {
            insertar();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ControladorVistaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    if (e.getSource() == VistaUsuario.BtnActualizar) {
               VistaUsuario.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
        try {
            modificar();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ControladorVistaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    if (e.getSource() == VistaUsuario.BtnBuscar) {
               VistaUsuario.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
                  buscar();
        }
    if (e.getSource() == VistaUsuario.BtnSearch) {
               VistaUsuario.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                 busquedaMVC();
        }
    if (e.getSource() == VistaUsuario.BtnSalir) {
               VistaUsuario.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
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
        if (e.getSource() == VistaUsuario.TxtUsuario) {
               VistaUsuario.TxtUsuario.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaUsuario.TxtPass) {
               VistaUsuario.TxtPass.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaUsuario.TxtNombre) {
               VistaUsuario.TxtNombre.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaUsuario.TxtTipo) {
               VistaUsuario.TxtTipo.setCursor(new Cursor(TEXT_CURSOR));

        }
    
    if (e.getSource() == VistaUsuario.BtnBorrar) {
               VistaUsuario.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaUsuario.BtnIngresar) {
               VistaUsuario.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
                 
        }
    if (e.getSource() == VistaUsuario.BtnActualizar) {
               VistaUsuario.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
                
        }
    if (e.getSource() == VistaUsuario.BtnBuscar) {
               VistaUsuario.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaUsuario.BtnSearch) {
               VistaUsuario.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                 //Pendiente
        }
    if (e.getSource() == VistaUsuario.BtnSalir) {
               VistaUsuario.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
            
        }
    
    }
    //BTN
        

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
    private void llenarModeloConVista() throws NoSuchAlgorithmException{
        ModeloUsuarios.setUsuario(VistaUsuario.TxtUsuario.getText());
        
       //AQUI SE ENCRIPTA EL PASSWORD
            String PasswordSinEncriptar = new String(VistaUsuario.TxtPass.getPassword());
            String PassEncriptado = encriptarPass(PasswordSinEncriptar);
            System.out.println(encriptarPass(PasswordSinEncriptar));
            ModeloUsuarios.setPass(PassEncriptado);
        ModeloUsuarios.setNombre(VistaUsuario.TxtNombre.getText());
        ModeloUsuarios.setTipo(VistaUsuario.TxtTipo.getText());
         
    }
    
    private void llenarVistaConModelo(){
         VistaUsuario.TxtUsuario.setText(ModeloUsuarios.getUsuario()+"");
          //VistaUsuario.TxtPass.setText(ModeloUsuarios.getPass()+"");
           VistaUsuario.TxtNombre.setText(ModeloUsuarios.getNombre()+"");
            VistaUsuario.TxtTipo.setText(ModeloUsuarios.getTipo()+"");
          
    }
    private void limpiaarCampos(){
         VistaUsuario.TxtUsuario.setText("");
          VistaUsuario.TxtPass.setText("");
           VistaUsuario.TxtNombre.setText("");
            VistaUsuario.TxtTipo.setText("");
            
               
    }
    private boolean validarCampoId(){
        if (VistaUsuario.TxtUsuario.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private boolean validarTodosLosCampos(){
        if (VistaUsuario.TxtUsuario.getText().isEmpty()||
                VistaUsuario.TxtPass.getText().isEmpty()||
                VistaUsuario.TxtNombre.getText().isEmpty()||
                VistaUsuario.TxtTipo.getText().isEmpty()){
                return false;
        }
        return true;
    }
    private void insertar() throws NoSuchAlgorithmException{
        if (validarTodosLosCampos()) {
           
        ModeloUsuarios.setUsuario(VistaUsuario.TxtUsuario.getText());
        if (ConsultasUsuarios.buscar(ModeloUsuarios) == true) {
           JOptionPane.showMessageDialog(VistaUsuario, "Ese Usuario ya existe", "Usuario",0);
        }else{
          llenarModeloConVista();//llenarlo con datos
            if (ConsultasUsuarios.insertar(ModeloUsuarios)==true) {
              JOptionPane.showMessageDialog(null, "usuario Guardado Correctamente","Usuario",1);
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar el Usuario", "Usuario",0);
        
            }
        }
    }else{
       JOptionPane.showMessageDialog(null, "El campo Id no debe estar vacio", "Usuario",0);
        
        }
}
    private void modificar() throws NoSuchAlgorithmException{
        if (validarTodosLosCampos()) {
            llenarModeloConVista();//DATOS DE MODIFICACION
            
            //para buscar el dato en el modelo Temporal y no modifique al modelo original
            ModeloUsuarios ModeloTemporal = new ModeloUsuarios();
            ModeloTemporal.setUsuario(VistaUsuario.TxtUsuario.getText());
        
            if (ConsultasUsuarios.buscar(ModeloTemporal)==false) {//Busca con modelo temporal
                JOptionPane.showMessageDialog(VistaUsuario, "Ese Usuario no existe", "Usuario",0);
                
            }else{
                if (ConsultasUsuarios.modificar(ModeloUsuarios)) {
              JOptionPane.showMessageDialog(null, "Usuario Modificado Correctamente", "Usuario",1);
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar el Usuario", "Usuario",0);
        
            }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios", "Usuario",0);
        }
    }
    private void eliminar(){
        if (validarCampoId()) {
           
        ModeloUsuarios.setUsuario(VistaUsuario.TxtUsuario.getText());
        if (ConsultasUsuarios.buscar(ModeloUsuarios) == false) {
           JOptionPane.showMessageDialog(VistaUsuario, "Ese Usuario no existe", "Usuario", 0);
        }else{//Producto si existe por lo tanto se puede eliminar
          
            if (ConsultasUsuarios.eliminar(ModeloUsuarios)) {
              JOptionPane.showMessageDialog(null, "Usuario Eliminado Correctamente","Usuario",1);
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el Usuario", "Usuario",0);
        
            }
        }
    }else{
       JOptionPane.showMessageDialog(null, "El campo Id no debe estar vacio","Usuario",0);
        
        }
}
    private void buscar(){//Se busca por codigo En TxtId
        if (validarCampoId()) {
           
        ModeloUsuarios.setUsuario(VistaUsuario.TxtUsuario.getText());
        if (ConsultasUsuarios.buscar(ModeloUsuarios) == true) {//Producto si existe
           llenarVistaConModelo();//El modelo ya trae los datos buscados
        }else{
                JOptionPane.showMessageDialog(VistaUsuario, "El Regitro  no existe", "Usuario",0);
 
        }
    }else{
       JOptionPane.showMessageDialog(VistaUsuario, "Los campos no deben estar vacios","Usuario", 0);
        
        }
}
    private void salir(){
        int opc = JOptionPane.showConfirmDialog(VistaUsuario, "¿Deseas salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opc == 0)  VistaUsuario.dispose();
            
        
    }

    private String encriptarPass(String PasswordSinEncriptar) throws NoSuchAlgorithmException {
        MessageDigest Md = MessageDigest.getInstance("MD5");
        Md.update(PasswordSinEncriptar.getBytes(), 0, PasswordSinEncriptar.length());
        return new BigInteger(1,Md.digest()).toString(16);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == VistaUsuario.TxtUsuario) {
                validarLetrasNumeros(e);
               if (e.getKeyChar()==e.VK_ENTER) {
                   
                VistaUsuario.TxtPass.requestFocus();
            }
        }
        if (e.getSource() == VistaUsuario.TxtPass) {
               if (e.getKeyChar()==e.VK_ENTER) {
                   
                VistaUsuario.TxtNombre.requestFocus();
            }
        }
        if (e.getSource() == VistaUsuario.TxtNombre) {
                validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_ENTER) {
                   
                VistaUsuario.TxtTipo.requestFocus();
            }
        }
        if (e.getSource() == VistaUsuario.TxtTipo) {
                validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_ENTER) {
                   
                VistaUsuario.TxtUsuario.requestFocus();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == VistaUsuario.TxtUsuario) {
                validarLetrasNumeros(e);
               if (e.getKeyChar()==e.VK_DOWN) {
                   
                VistaUsuario.TxtPass.requestFocus();
            }
        }
        if (e.getSource() == VistaUsuario.TxtPass) {
               if (e.getKeyChar()==e.VK_DOWN) {
                   
                VistaUsuario.TxtNombre.requestFocus();
            }
        }
        if (e.getSource() == VistaUsuario.TxtNombre) {
                validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_DOWN) {
                   
                VistaUsuario.TxtTipo.requestFocus();
            }
        }
        if (e.getSource() == VistaUsuario.TxtTipo) {
                validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_DOWN) {
                   
                VistaUsuario.TxtUsuario.requestFocus();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    //VALIDAR

   public void validarSoloLetras(KeyEvent e){
    if(Character.isLetter(e.getKeyChar()) || (e.getKeyChar()==KeyEvent.VK_SPACE)|| (e.getKeyChar()==KeyEvent.VK_SHIFT) || (e.getKeyChar()==KeyEvent.VK_BACK_SPACE)||(e.getKeyChar()==KeyEvent.VK_ENTER)){
       
        
   }else{
       JOptionPane.showMessageDialog(VistaUsuario, "Debes Teclear solo letras y no \ndebe de  "+
                "estar vacio el campo","Alerta",0);
    }
}

    public void validarLetrasNumeros(KeyEvent e){
    if(Character.isLetter(e.getKeyChar()) || Character.isDigit(e.getKeyChar()) ||(e.getKeyChar()==KeyEvent.VK_SPACE)|| (e.getKeyChar()==KeyEvent.VK_SHIFT) || (e.getKeyChar()==KeyEvent.VK_BACK_SPACE)||(e.getKeyChar()==KeyEvent.VK_ENTER)){
       
        
   }else{
       JOptionPane.showMessageDialog(VistaUsuario, "Debes Teclear solo Letras y Numeros, no \ndebe de  "+
                "estar vacio el campo","Alerta",0);
    }
    }
}
