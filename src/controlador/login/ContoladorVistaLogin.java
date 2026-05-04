/*
 * CONTROLADOR VISTA LOGIN
 */
package controlador.login;

import controlador.principal.ControladorVistaPantallaPrincipal;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.TEXT_CURSOR;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.usuario.ConsultasUsuario;
import modelo.usuario.ModeloUsuario;

import vista.login.VistaLogin;
import vista.principal.VistaPantallaPrincipal;

/**
 * Controlador Vista Login.
 * Controla un objeto de tipo VistaLogin
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 12/10/23
 */
public class ContoladorVistaLogin implements MouseListener {
    private VistaLogin VistaLogin;
    protected ModeloUsuario ModeloUsuario;
    ConsultasUsuario ConsultasUsuario = new ConsultasUsuario();//objeto
     public ContoladorVistaLogin(VistaLogin VistaLogin, ModeloUsuario ModeloUsuario) {
        this.VistaLogin  = VistaLogin;
        this.ModeloUsuario = ModeloUsuario;
        oyentes();//Llamada a los oyentes
        VistaLogin.setVisible(true);
    }

        @Override
        public void mouseClicked(MouseEvent e) {
        if (e.getSource() == VistaLogin.BtnImLogin) {
            try {
                buscarUsuarioPassword();
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(ContoladorVistaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }

        @Override
        public void mousePressed(MouseEvent e) {
       if (e.getSource() == VistaLogin.BtnOjo) {
           VistaLogin.BtnOjo.setVisible(false);
           VistaLogin.BtnOjo2.setVisible(true);
               VistaLogin.TxtPass.setEchoChar((char)0);
              
               VistaLogin.BtnOjo.setCursor(new Cursor(HAND_CURSOR));
       }
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource() == VistaLogin.BtnOjo) {
            //VistaLogin.BtnOjo;
            VistaLogin.BtnOjo.setVisible(true);
            VistaLogin.TxtPass.setEchoChar('*');
        }
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getSource() == VistaLogin.BtnOjo) {
               VistaLogin.BtnOjo.setCursor(new Cursor(HAND_CURSOR));
       }      

            if (e.getSource() == VistaLogin.TxtPass) {
               VistaLogin.TxtPass.setCursor(new Cursor(TEXT_CURSOR));

        }
             if (e.getSource() == VistaLogin.TxtUsuario) {
              VistaLogin.TxtUsuario.setCursor(new Cursor(TEXT_CURSOR));

        }
           if (e.getSource() == VistaLogin.ChkRec) {
              VistaLogin.ChkRec.setCursor(new Cursor(HAND_CURSOR));

        } 
           if (e.getSource() == VistaLogin.BtnImLogin) {
              VistaLogin.BtnImLogin.setCursor(new Cursor(HAND_CURSOR));

        }
        }

        @Override
        public void mouseExited(MouseEvent e) {
        
        
           
        }

        private void oyentes() {
            VistaLogin.TxtPass.addMouseListener(this);
             VistaLogin.TxtUsuario.addMouseListener(this);
              VistaLogin.ChkRec.addMouseListener(this);
               VistaLogin.BtnImLogin.addMouseListener(this);
               VistaLogin.BtnOjo.addMouseListener(this);
              

        }
        public boolean camposValidos(){
            if (VistaLogin.TxtUsuario.getText().isEmpty() || VistaLogin.TxtPass.getPassword().length == 0) {
                return false;//campos vacios
            }else{
                return true;//campos no vacios
            }
            
        }
        private void llenarModeloConCampos()throws NoSuchAlgorithmException{
            ModeloUsuario.setUsuario(VistaLogin.TxtUsuario.getText());
            //AQUI SE ENCRIPTA EL PASSWORD
            String PasswordSinEncriptar = new String(VistaLogin.TxtPass.getPassword());
            String PassEncriptado = encriptarPass(PasswordSinEncriptar);
            System.out.println(encriptarPass(PasswordSinEncriptar));
            ModeloUsuario.setPassword(PassEncriptado);
            ModeloUsuario.setNombre("");
            ModeloUsuario.setTipo("");
        }
        private void buscarUsuarioPassword() throws NoSuchAlgorithmException{
            if (camposValidos()==true) {//Hay  en los campostexto
                llenarModeloConCampos();//para llevar info a la consulta sql
            
            if (ConsultasUsuario.buscarLogin(ModeloUsuario) == true) {//si encontro usuario
                //el ModeloUsuario ya lleno los campos faltantes con la busqueda (Nombre y tipo)
                //ya solo es desplegarlos
                JOptionPane.showMessageDialog(null, "Bienvenido: "+ ModeloUsuario.getNombre(), "Tipo: "+ModeloUsuario.getTipo(),1);//1 es el tipo de icono
            
                //Liberar pantalla Login
                VistaLogin.dispose();
                //Crear el MOdelo Vista PantallaPrincipal
                VistaPantallaPrincipal VistaPantallaPrincipal = new VistaPantallaPrincipal();
                ControladorVistaPantallaPrincipal CVPP = new ControladorVistaPantallaPrincipal(VistaPantallaPrincipal);
                
            }else{//Si el usuario no existe o contraseña incorrecta
                JOptionPane.showMessageDialog(null, "Usuario o Password Incorrectos");
            }
            
            }else{
                JOptionPane.showMessageDialog(null, "Debes colocar el texto en los campos " + "usuario y password");
            }
        }

    private String encriptarPass(String PasswordSinEncriptar) throws NoSuchAlgorithmException{
        MessageDigest Md = MessageDigest.getInstance("MD5");
        Md.update(PasswordSinEncriptar.getBytes(), 0, PasswordSinEncriptar.length());
        return new BigInteger(1,Md.digest()).toString(16);
    }
     }
     

