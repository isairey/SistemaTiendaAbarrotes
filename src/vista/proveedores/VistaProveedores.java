/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.proveedores;

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
 * Clase Vista Provedores.
 * Pantalla De Articulos.
 * @author Diego Franco Sandoval.
 * @version 1.
 * @since 17/10/2023
 */
public class VistaProveedores extends JDialog implements Fuentes, Colores{
    private final ImageIcon  ImProv = new ImageIcon(getClass().getResource("/imagenes/proveedores/prov.jpeg"));
    JPanel PanelArriba = new JPanel();
    JPanel PanelCentro = new JPanel();
    JPanel PanelAbajo = new JPanel();
    public JLabel LblProv = new JLabel(ImProv);
    public JTextField TxtId = new JTextField();
    public JTextField TxtEmpresa = new JTextField();
    public JTextField TxtNombre = new JTextField();
    public JTextField TxtApellidoMaterno = new JTextField();
    public JTextField TxtApellidoPaterno = new JTextField();
    public JTextField TxtTelefono = new JTextField();
    
    
    public JButton BtnSalir = new JButton("Salir");
    public JButton BtnBorrar = new JButton("Borrar");
    public JButton BtnBuscar = new JButton("Buscar");
    public JButton BtnSearch = new JButton("Search");
    public JButton BtnIngresar = new JButton("Ingresar");
    public JButton BtnActualizar = new JButton("Actualizar");
    public JLabel LblTitulo = new JLabel("REGISTRO DE PROVEEDORES");
    public JLabel LblId = new JLabel("Id Proveedores:");
    public JLabel LblNombre = new JLabel("Nombre:");
    public JLabel LblApellidoPaterno = new JLabel("Apellido Paterno:");
    public JLabel LblApellidoMaterno = new JLabel("Apellido Materno:");
    public JLabel LblTelefono = new JLabel("Telèfono:");
    public JLabel LblEmpresa = new JLabel("Empresa:");

    
    
    public VistaProveedores(JFrame owner, boolean modal){
        super(owner,modal);
        configuracion();
        agregaPaneles();
 
   
    }

        private void configuracion() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(ImProv.getIconWidth(), ImProv.getIconHeight());
        this.setContentPane(LblProv);
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de Proveedores");
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
        
        PanelCentro.add(LblEmpresa);
        PanelCentro.add(TxtEmpresa);
        
        PanelCentro.add(LblNombre);
        PanelCentro.add(TxtNombre);
        
        PanelCentro.add(LblApellidoPaterno);
        PanelCentro.add(TxtApellidoPaterno);
        
        PanelCentro.add(LblApellidoMaterno);
        PanelCentro.add(TxtApellidoMaterno);
       
        PanelCentro.add(LblTelefono);
        PanelCentro.add(TxtTelefono);

      
        
        //TXT
        TxtId.setBounds(570, 300, 200, 30);
        TxtEmpresa.setBounds(570, 400, 200, 30);
        TxtNombre.setBounds(570, 500, 200, 30);
        TxtApellidoPaterno.setBounds(570, 600, 200, 30);
        TxtApellidoMaterno.setBounds(570, 700, 200, 30);
        TxtTelefono.setBounds(570, 800, 200, 30);
        
       
        //LBL
        LblTitulo.setBounds(270, 100, 530, 100);
        LblId.setBounds(250, 300, 255, 30);
        LblEmpresa.setBounds(250, 400, 255, 30);
        LblNombre.setBounds(250, 500, 255, 30);
        LblApellidoPaterno.setBounds(250, 600, 255, 30);
        LblApellidoMaterno.setBounds(250, 700, 255, 30);
        LblTelefono.setBounds(250, 800, 255, 30);
        
        
        
        LblTitulo.setFont(FUENTE_TITLE);
        LblId.setFont(FUENTE_ART);
        LblNombre.setFont(FUENTE_ART);
        LblApellidoPaterno.setFont(FUENTE_ART);
        LblApellidoMaterno.setFont(FUENTE_ART);
        LblTelefono.setFont(FUENTE_ART);
        LblEmpresa.setFont(FUENTE_ART);
        
        //FONDO LBL
        LblTitulo.setBackground(FONDOTITLE);
        LblId.setBackground(FONDOLBL);
        LblNombre.setBackground(FONDOLBL);
        LblApellidoPaterno.setBackground(FONDOLBL);
        LblApellidoMaterno.setBackground(FONDOLBL);
        LblTelefono.setBackground(FONDOLBL);
        LblEmpresa.setBackground(FONDOLBL);
        
        
        LblTitulo.setOpaque(true);
        LblId.setOpaque(true);
        LblNombre.setOpaque(true);
        LblApellidoPaterno.setOpaque(true);
        LblApellidoMaterno.setOpaque(true);
        LblTelefono.setOpaque(true);
        LblEmpresa.setOpaque(true);
        
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
