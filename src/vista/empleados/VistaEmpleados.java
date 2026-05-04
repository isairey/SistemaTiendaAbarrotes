/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.empleados;

import interfaces.Colores;
import static interfaces.Colores.FONDOLBL;
import static interfaces.Colores.PANEL_ABAJO;
import static interfaces.Colores.PANEL_ARRIBA;
import static interfaces.Colores.PANEL_CENTRO;
import interfaces.Fuentes;
import static interfaces.Fuentes.FUENTE_ART;
import java.awt.BorderLayout;

import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * Clase Vista Empleados.
 * Pantalla De Empleados.
 * @author Noemi Zavalza Valderrama
 * @version 1.
 * @since 06/11/2023
 */
public class VistaEmpleados extends JDialog implements Fuentes, Colores{
     private final ImageIcon  ImArt = new ImageIcon(getClass().getResource("/imagenes/empleados/usu.jpeg"));
    JPanel PanelArriba = new JPanel();
    JPanel PanelCentro = new JPanel();
    JPanel PanelAbajo = new JPanel();
     public JLabel LblArt = new JLabel(ImArt);
    public JTextField TxtId = new JTextField();
    public JTextField TxtNombre = new JTextField();
    public JTextField TxtFechaNac = new  JTextField();
    public JTextField TxtApellidop = new JTextField();
    public JTextField TxtApellidom = new JTextField();
    public JTextField TxtHorario = new JTextField();
    public JTextField TxtTelefono = new JTextField();
    
    public JButton BtnSalir = new JButton("Salir");
    public JButton BtnBorrar = new JButton("Borrar");
    public JButton BtnBuscar = new JButton("Buscar");
    public JButton BtnSearch = new JButton("Search");
    public JButton BtnIngresar = new JButton("Ingresar");
    public JButton BtnActualizar = new JButton("Actualizar");
    public JLabel LblTitulo = new JLabel("REGISTRO DE EMPLEADOS");
    public JLabel LblId = new JLabel("Id Empleado:");
    public JLabel LblNombre = new JLabel("Nombre:");
    public JLabel LblFechaNac = new JLabel("Fecha Nacimiento:");
    public JLabel LblApellidop = new JLabel("Apellido Paterno:");
    public JLabel LblApellidom = new JLabel("Apellido Materno:");
    public JLabel LblHorario = new JLabel("Horario:");
    public JLabel LblTelefono = new JLabel("Telèfono:");


    
    public VistaEmpleados(JFrame owner, boolean modal){
        super(owner,modal);
        configuracion();
        agregaPaneles();
 
   
    }

        private void configuracion() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(ImArt.getIconWidth(), ImArt.getIconHeight());
        this.setContentPane(LblArt);
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de Empleados");
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
        PanelCentro.add(LblId);
        PanelCentro.add(TxtId);
        
        PanelCentro.add(LblNombre);
        PanelCentro.add(TxtNombre);
        
        PanelCentro.add(LblApellidop);
        PanelCentro.add(TxtApellidop);
       
        PanelCentro.add(LblApellidom);
        PanelCentro.add(TxtApellidom);

        PanelCentro.add(LblFechaNac);
        PanelCentro.add(TxtFechaNac);
        
        PanelCentro.add(LblHorario);
        PanelCentro.add(TxtHorario);
       
        PanelCentro.add(LblTelefono);
        PanelCentro.add(TxtTelefono);
        
        

        //TXT
        TxtId.setBounds(630, 250, 200, 30);
        TxtNombre.setBounds(630, 350, 200, 30);
        TxtApellidop.setBounds(630, 450, 200, 30);
        TxtApellidom.setBounds(630, 550, 200, 30);
        TxtFechaNac.setBounds(630, 650, 200, 30);
        TxtHorario.setBounds(630, 750, 200, 30);
        TxtTelefono.setBounds(630, 850, 200, 30);
       
        //LBL
        LblTitulo.setBounds(275, 100, 480, 100);
        LblId.setBounds(250, 250, 255, 30);
        LblNombre.setBounds(250, 350, 255, 30);
        LblApellidop.setBounds(250, 450, 255, 30);
        LblApellidom.setBounds(250, 550, 255, 30);
        LblFechaNac.setBounds(250, 650, 255, 30);
        LblHorario.setBounds(250, 750, 255, 30);
        LblTelefono.setBounds(250, 850, 255, 30);

        LblTitulo.setFont(FUENTE_TITLE);
        LblId.setFont(FUENTE_ART);
        LblNombre.setFont(FUENTE_ART);
        LblApellidop.setFont(FUENTE_ART);
        LblApellidom.setFont(FUENTE_ART);
        LblHorario.setFont(FUENTE_ART);
        LblTelefono.setFont(FUENTE_ART);
        LblFechaNac.setFont(FUENTE_ART);
        //FONDO LBL
        LblTitulo.setBackground(FONDOTITLE);
        LblId.setBackground(FONDOLBLUS);
        LblNombre.setBackground(FONDOLBLUS);
        LblApellidop.setBackground(FONDOLBLUS);
        LblApellidom.setBackground(FONDOLBLUS);
        LblHorario.setBackground(FONDOLBLUS);
        LblTelefono.setBackground(FONDOLBLUS);
        LblFechaNac.setBackground(FONDOLBLUS);
        
        LblTitulo.setOpaque(true);
        LblId.setOpaque(true);
        LblNombre.setOpaque(true);
        LblApellidop.setOpaque(true);
        LblApellidom.setOpaque(true);
        LblHorario.setOpaque(true);
        LblTelefono.setOpaque(true);
        LblFechaNac.setOpaque(true);
        //BTN
        PanelAbajo.setLayout(new GridLayout(1,6));
        PanelAbajo.setAlignmentX(CENTER_ALIGNMENT);
        PanelAbajo.add(BtnIngresar); 
        PanelAbajo.add(BtnActualizar);
        PanelAbajo.add(BtnBuscar);
        PanelAbajo.add(BtnBorrar);
        PanelAbajo.add(BtnSalir);
        PanelAbajo.add(BtnSearch);
        BtnIngresar.setSize(96, 48);
        BtnActualizar.setSize(96, 48);
        BtnBuscar.setSize(96, 48);
        BtnSearch.setSize(96, 48);
        BtnBorrar.setSize(96, 48);
        BtnSalir.setSize(96, 48);
}

   
       

       
       
}

