/*
 * VISTA LOGIN
 */
package vista.login;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Clase Vista Login.
 * Login para ingresar al sistema.
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 12/10/2023
 */
public class VistaLogin extends JFrame{
    private ImageIcon ImFLog = new ImageIcon(getClass().getResource("/imagenes/login/fondo.jpg"));
    public JLabel LblLog = new JLabel(ImFLog);
    public ImageIcon ImLogin = new ImageIcon(getClass().getResource("/imagenes/login/login.png"));
    public ImageIcon ImIcono = new ImageIcon(getClass().getResource("/imagenes/login/icono.jpg"));
    public ImageIcon ImCandado = new ImageIcon(getClass().getResource("/imagenes/login/candado.png"));
    public ImageIcon ImOjo = new ImageIcon(getClass().getResource("/imagenes/login/ojo.png"));
    public ImageIcon ImOjo2 = new ImageIcon(getClass().getResource("/imagenes/login/ojo2.png"));
    public ImageIcon ImUser = new ImageIcon(getClass().getResource("/imagenes/login/user.png"));
    public JTextField TxtUsuario = new JTextField();
    public JPasswordField TxtPass = new JPasswordField();
    public JLabel LblUsuario = new JLabel(ImUser);
    public JLabel LblPass = new JLabel(ImCandado);
    public JButton BtnOjo = new JButton(ImOjo);
    public JButton BtnOjo2 = new JButton(ImOjo2);
    public JLabel LblRm = new JLabel("Recordarme");
    public JCheckBox ChkRec = new JCheckBox();
    
    //BOTONES 
    public JButton BtnImLogin= new JButton("Login", ImLogin);
    /**
     * Constructor VistaLogin().
     * Inicializa los atributos de la clase.
     */
    public VistaLogin(){
        configuracion();
        botones();
   
    }
        private void configuracion() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(ImFLog.getIconWidth(), ImFLog.getIconHeight());
        this.setContentPane(LblLog);
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        this.setIconImage(ImIcono.getImage());
        this.setResizable(true);
        this.setLayout(null);//Diseño Libre

        
    }
        private void botones() {
      
      //BTN
      BtnImLogin.setBounds(1020, 600, 48, 48 );//Posicion/Tamaño
      this.add(BtnImLogin);

      //LBL
      LblUsuario.setBounds(820, 420, 48, 48 );//Posicion/Tamaño
      LblPass.setBounds(820, 550, 48, 48 );//Posicion/Tamaño
      BtnOjo.setBounds(1070, 550, 48, 48 );//Posicion/Tamañoç
      BtnOjo2.setBounds(1070, 550, 48, 48 );
      LblRm.setBounds(820, 600, 150, 48 );//Posicion/Tamaño
      LblRm.setFont(new Font("Tahoma", 1, 20));
      this.add(LblUsuario);
      this.add(LblPass);
      this.add(LblRm);
      this.add(BtnOjo);
      this.add(BtnOjo2);
      BtnOjo.setBackground(new Color(235,235,235,255));
      BtnOjo2.setBackground(new Color(235,235,235,255));
      BtnImLogin.setBackground(new Color(235,235,235,255));
 
      //JTEXT
      TxtUsuario.setBounds(870, 420, 200, 48 );//Posicion/Tamaño
      TxtPass.setBounds(870, 550, 200, 48 );//Posicion/Tamaño
      this.add(TxtUsuario);
      this.add(TxtPass);
     //CHK
      ChkRec.setBounds(970, 600, 48, 48);//Posicion/Tamaño
      ChkRec.setBackground(new Color(235,235,235,255));
      this.add(ChkRec);
      
    }



}
