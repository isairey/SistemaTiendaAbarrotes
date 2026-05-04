/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.usuarios;

import vista.articulos.*;
import interfaces.Colores;
import static interfaces.Colores.PANEL_ABAJO;
import static interfaces.Colores.PANEL_ARRIBA;
import static interfaces.Colores.PANEL_CENTRO;
import interfaces.Fuentes;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Clase Vista Articulos.
 * Pantalla De Articulos.
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 17/10/2023
 */
public class VistaUsuario extends JDialog implements Fuentes, Colores{
     private final ImageIcon  ImUsu = new ImageIcon(getClass().getResource("/imagenes/usuario/usu.jpeg"));
     private ImageIcon  Imlupa = new ImageIcon(getClass().getResource("/imagenes/articulos/lupa.png"));
    JPanel PanelArriba = new JPanel();
    JPanel PanelCentro = new JPanel();
    JPanel PanelAbajo = new JPanel();
     public JLabel LblUsu = new JLabel(ImUsu);
    public JTextField TxtUsuario = new JTextField();
    public JPasswordField TxtPass = new JPasswordField();
    public JTextField TxtNombre = new JTextField();
    public JTextField TxtTipo = new JTextField();
 
    public JButton BtnSalir = new JButton("Salir");
    public JButton BtnBorrar = new JButton("Borrar");
    public JButton BtnBuscar = new JButton("Buscar");
    public JButton BtnSearch = new JButton(Imlupa);
    public JButton BtnIngresar = new JButton("Ingresar");
    public JButton BtnActualizar = new JButton("Actualizar");
    
    public JLabel LblTitulo = new JLabel("REGISTRO DE USUARIOS");
    public JLabel LblUsuario = new JLabel("Usuario:");
    public JLabel LblPass = new JLabel("Contraseña:");
    public JLabel LblNombre = new JLabel("Nombre Completo:");
    public JLabel LblTipo = new JLabel("Tipo de Usuario:");
    
    public VistaUsuario(JFrame owner, boolean modal){
        super(owner,modal);
        configuracion();
        agregaPaneles();
 
   
    }

        private void configuracion() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(ImUsu.getIconWidth(), ImUsu.getIconHeight());
        this.setContentPane(LblUsu);
        this.setLocationRelativeTo(null);
        this.setTitle("Panel de Usuarios");
        this.setLayout(new BorderLayout());//Diseño Libre

        
    }
private void agregaPaneles(){
    //Caracteristicas de los paneles
    PanelArriba.setBackground(PANEL_ARRIBA);
    PanelAbajo.setBackground(PANEL_ABAJO);
    PanelCentro.setBackground(PANEL_CENTRO);
            this.add(PanelArriba,BorderLayout.NORTH);
            this.add(PanelCentro,BorderLayout.CENTER);
            this.add(PanelAbajo,BorderLayout.SOUTH);
    
    PanelCentro.setLayout(null);
    PanelCentro.setAlignmentX(CENTER_ALIGNMENT);
        PanelCentro.add(LblTitulo);
        PanelCentro.add(LblUsuario);
        PanelCentro.add(TxtUsuario);
        
        PanelCentro.add(LblPass);
        PanelCentro.add(TxtPass);
        
        PanelCentro.add(LblNombre);
        PanelCentro.add(TxtNombre);
        
        PanelCentro.add(LblTipo);
        PanelCentro.add(TxtTipo);
       

        //TXT
        TxtUsuario.setBounds(550, 300, 200, 30);
        TxtPass.setBounds(550, 400, 200, 30);
        TxtNombre.setBounds(550, 500, 200, 30);
        TxtTipo.setBounds(550, 600, 200, 30);
        
        //LBL
        LblTitulo.setBounds(275, 100, 440, 100);
        
        LblUsuario.setBounds(250, 300, 265, 30);
        LblPass.setBounds(250, 400, 265, 30);
        LblNombre.setBounds(250, 500, 265, 30);
        LblTipo.setBounds(250, 600, 265, 30);
        
        LblTitulo.setFont(FUENTE_TITLE);
        LblUsuario.setFont(FUENTE_ART);
        LblPass.setFont(FUENTE_ART);
        LblNombre.setFont(FUENTE_ART);
        LblTipo.setFont(FUENTE_ART);
        //FONDO LBL
        LblTitulo.setBackground(FONDOTITLE);
        LblUsuario.setBackground(FONDOLBLUS);
        LblPass.setBackground(FONDOLBLUS);
        LblNombre.setBackground(FONDOLBLUS);
        LblTipo.setBackground(FONDOLBLUS);
        
        LblTitulo.setOpaque(true);
        LblUsuario.setOpaque(true);
        LblPass.setOpaque(true);
        LblNombre.setOpaque(true);
        LblTipo.setOpaque(true);
        
        //BTN
        PanelAbajo.setLayout(new GridLayout(1,6));
    PanelAbajo.setAlignmentX(CENTER_ALIGNMENT);
        PanelAbajo.add(BtnIngresar); 
        PanelAbajo.add(BtnActualizar);
        PanelAbajo.add(BtnBuscar);
        PanelAbajo.add(BtnBorrar);
        PanelAbajo.add(BtnSalir);
        PanelAbajo.add(BtnSearch);
        BtnIngresar.setSize(96, 50);
        BtnActualizar.setSize(96, 50);
        BtnBuscar.setSize(96, 50);
        BtnSearch.setSize(96, 50);
        BtnBorrar.setSize(96, 50);
        BtnSalir.setSize(96, 50);
}
   
    
}

