/*
 * Clase Vista Principal.
 * Pantalla Principal del sistema.
 */
package vista.principal;

import interfaces.Colores;
import interfaces.Fuentes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase Vista Principal.
 * Pantalla Principal del sistema.
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 16/10/2023
 */
public class VistaPantallaPrincipal extends JFrame implements Colores, Fuentes{
    private ImageIcon ImFondo = new ImageIcon(getClass().getResource("/imagenes/login/fondopl1.png"));
    public JLabel LblLog = new JLabel(ImFondo);
    //PANELES
    JPanel PanelArriba = new JPanel();
    JPanel PanelCentro = new JPanel();
    JPanel PanelAbajo = new JPanel();
    public ImageIcon ImSalir = new ImageIcon(getClass().getResource("/imagenes/login/salicion.png"));
    public ImageIcon ImIcono = new ImageIcon(getClass().getResource("/imagenes/login/icono.jpg"));
    public ImageIcon ImProductos = new ImageIcon(getClass().getResource("/imagenes/login/ven.png"));
    public ImageIcon ImMinimizar = new ImageIcon(getClass().getResource("/imagenes/login/min.png"));
    public ImageIcon ImUser = new ImageIcon(getClass().getResource("/imagenes/login/userprin.png"));
    public ImageIcon ImCliente = new ImageIcon(getClass().getResource("/imagenes/login/cliente.png"));
    public ImageIcon ImProv = new ImageIcon(getClass().getResource("/imagenes/login/prov.png"));
    public ImageIcon ImVentas = new ImageIcon(getClass().getResource("/imagenes/login/prod.png"));
    public ImageIcon ImEmpleado = new ImageIcon(getClass().getResource("/imagenes/login/empleado.png"));
    public JButton BtnSalir = new JButton(ImSalir);
    public JButton BtnProductos = new JButton(ImProductos);
    public JButton BtnMin = new JButton(ImMinimizar);
    public JButton BtnUser = new JButton(ImUser);
    public JButton BtnCliente = new JButton(ImCliente);
    public JButton BtnProv = new JButton(ImProv);
    public JButton BtnVentas = new JButton(ImVentas);
    public JButton BtnEmpleado = new JButton(ImEmpleado);    
    public JLabel LblSalir  = new JLabel("Salir");
    public JLabel LblProductos  = new JLabel("Articulos");
    public JLabel LblMin  = new JLabel("Minimizar");
    public JLabel LblUser  = new JLabel("Usuarios");
    public JLabel LblCliente  = new JLabel("Cliente");
    public JLabel LblProv  = new JLabel("Proveedores");
    public JLabel LblVentas  = new JLabel("Ventas");
    public JLabel LblEmpleado  = new JLabel("Empleado");
    
    public VistaPantallaPrincipal(){
        configuracion();
        botones();
        agregaPaneles();
    }

    private void configuracion() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width,screenSize.height);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setContentPane(LblLog);
        this.setLocationRelativeTo(null);
        this.setIconImage(ImIcono.getImage());
        this.setResizable(true);
        this.setLayout(new BorderLayout());//Diseño Libre
        this.setUndecorated(true);


    }
    
    private void agregaPaneles(){
    //Caracteristicas de los paneles
    PanelArriba.setBackground(PANEL_ARRIBA);
    PanelAbajo.setBackground(PANEL_ABAJO);
    PanelCentro.setBackground(PANEL_CENTRO);
            this.add(PanelArriba,BorderLayout.NORTH);
            this.add(PanelCentro,BorderLayout.CENTER);
            this.add(PanelAbajo,BorderLayout.SOUTH);
    
    PanelArriba.setLayout(new GridLayout(1,8));
    PanelArriba.setAlignmentX(CENTER_ALIGNMENT);
      PanelArriba.add(BtnUser);
      PanelArriba.add(BtnProductos);
      PanelArriba.add(BtnCliente);
      PanelArriba.add(BtnVentas);
      PanelArriba.add(BtnProv);
      PanelArriba.add(BtnEmpleado);
      PanelArriba.add(BtnMin);
      PanelArriba.add(BtnSalir);

      BtnMin.setSize(64, 64);
      BtnProductos.setSize(64, 64);
      BtnUser.setSize(64, 64);
      BtnSalir.setSize(64, 64);
      BtnProv.setSize(64, 64);
      BtnVentas.setSize(64, 64);
      BtnCliente.setSize(64, 64);
      BtnEmpleado.setSize(64, 64);
      //COLOR
      BtnMin.setBackground(TRANSPARENTE);
      BtnProductos.setBackground(TRANSPARENTE);
      BtnUser.setBackground(TRANSPARENTE);
      BtnSalir.setBackground(TRANSPARENTE);
      BtnProv.setBackground(TRANSPARENTE);
      BtnVentas.setBackground(TRANSPARENTE);
      BtnCliente.setBackground(TRANSPARENTE);
      BtnEmpleado.setBackground(TRANSPARENTE);
    }

    private void botones() {
     
      //LBL
       LblUser.setBounds(80, 70, 100, 48 );
       LblProductos.setBounds(320, 70, 100, 48 );
       LblCliente.setBounds(570, 70, 100, 48 );
       LblVentas.setBounds(810, 70, 100, 48 );
       LblProv.setBounds(1030, 70, 150, 48 );
       LblEmpleado.setBounds(1265, 70, 100, 48 );
       LblMin.setBounds(1510, 70, 100, 48 );
       LblSalir.setBounds(1790, 70, 100, 48 );
       
       
       this.add(LblUser);
       this.add(LblProductos);
       this.add(LblCliente);
       this.add(LblVentas);
       this.add(LblProv);
       this.add(LblEmpleado);
       this.add(LblMin);
       this.add(LblSalir);
      
       LblMin.setFont(FUENTE_LBL);
       LblProductos.setFont(FUENTE_LBL);
       LblUser.setFont(FUENTE_LBL);
       LblSalir.setFont(FUENTE_LBL);
       LblProv.setFont(FUENTE_LBL);
       LblVentas.setFont(FUENTE_LBL);
       LblCliente.setFont(FUENTE_LBL);
       LblEmpleado.setFont(FUENTE_LBL);
       LblMin.setForeground(Color.black);
       LblProductos.setForeground(Color.black);
       LblProv.setForeground(Color.black);
       LblUser.setForeground(Color.black);
       LblVentas.setForeground(Color.black);
       LblCliente.setForeground(Color.black);
       LblEmpleado.setForeground(Color.black);
       LblSalir.setForeground(Color.black);
       
    }
}
