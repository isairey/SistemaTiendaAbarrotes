/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.clientes;

/**
 *
 * @author Fernando
 */
import interfaces.Colores;
import static interfaces.Colores.PANEL_ABAJO;
import static interfaces.Colores.PANEL_ARRIBA;
import static interfaces.Colores.PANEL_CENTRO;
import interfaces.Fuentes;
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

/**
 * Clase Vista Clientes.
 * Pantalla De Clientes.
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 17/10/2023
 */
public class VistaClientes extends JDialog implements Fuentes, Colores{
    private final ImageIcon  ImArt = new ImageIcon(getClass().getResource("/imagenes/clientes/cli.jpeg"));
    JPanel PanelArriba = new JPanel();
    JPanel PanelCentro = new JPanel();
    JPanel PanelAbajo = new JPanel();
     public JLabel LblArt = new JLabel(ImArt);
    public JTextField TxtNombre = new JTextField();
    public JTextField TxtApPaterno = new JTextField();
    public JTextField TxtApMaterno = new JTextField();
    public JTextField TxtTelefono = new JTextField();
    public JTextField TxtDireccion = new JTextField();
    public JTextField TxtRFC = new JTextField();
    public JTextField TxtIdCliente = new JTextField();
    public JButton BtnSalir = new JButton("Salir");
    public JButton BtnBorrar = new JButton("Borrar");
    public JButton BtnBuscar = new JButton("Buscar");
    public JButton BtnSearch = new JButton("Search");
    public JButton BtnIngresar = new JButton("Ingresar");
    public JButton BtnActualizar = new JButton("Actualizar");
    public JLabel LblTitulo = new JLabel("REGISTRO DE CLIENTES");
    public JLabel LblNombre = new JLabel("Nombre:");
    public JLabel LblApPaterno = new JLabel("Ap Paterno:");
    public JLabel LblApMaterno = new JLabel("Ap Materno:");
    public JLabel LblTelefono = new JLabel("Telefono:");
    public JLabel LblDireccion = new JLabel("Direccion:");
    public JLabel LblRFC = new JLabel("RFC:");
    public JLabel LblIdCliente = new JLabel("Id_Cliente:");
    
    public VistaClientes(JFrame owner, boolean modal){
        super(owner,modal);
        configuracion();
        agregaPaneles();
 
   
    }

        private void configuracion() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(ImArt.getIconWidth(), ImArt.getIconHeight());
        this.setContentPane(LblArt);
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de Clientes");
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
    PanelCentro.add(LblIdCliente);
        PanelCentro.add(TxtIdCliente);

        PanelCentro.add(LblNombre);
        PanelCentro.add(TxtNombre);
        
        PanelCentro.add(LblApPaterno);
        PanelCentro.add(TxtApPaterno);
        
        PanelCentro.add(LblApMaterno);
        PanelCentro.add(TxtApMaterno);
        
        PanelCentro.add(LblTelefono);
        PanelCentro.add(TxtTelefono);
       
        PanelCentro.add(LblDireccion);
        PanelCentro.add(TxtDireccion);

        PanelCentro.add(LblRFC);
        PanelCentro.add(TxtRFC);
        
        
        //TXT
        TxtIdCliente.setBounds(630, 250, 200, 30);
        TxtNombre.setBounds(630, 350, 200, 30);
        TxtApPaterno.setBounds(630, 450, 200, 30);
        TxtApMaterno.setBounds(630, 550, 200, 30);
        TxtTelefono.setBounds(630, 650, 200, 30);
        TxtDireccion.setBounds(630, 750, 200, 30);
        TxtRFC.setBounds(630, 850, 200, 30);
        
        //LBL
        LblTitulo.setBounds(300, 100, 420, 100);
        LblIdCliente.setBounds(250, 250, 255, 30);
        LblNombre.setBounds(250, 350, 255, 30);
        LblApPaterno.setBounds(250, 450, 255, 30);
        LblApMaterno.setBounds(250, 550, 255, 30);
        LblTelefono.setBounds(250, 650, 255, 30);
        LblDireccion.setBounds(250, 750, 255, 30);
        LblRFC.setBounds(250, 850, 255, 30);
        
         LblTitulo.setFont(FUENTE_TITLE);
        LblNombre.setFont(FUENTE_ART);
        LblApPaterno.setFont(FUENTE_ART);
        LblApMaterno.setFont(FUENTE_ART);
        LblTelefono.setFont(FUENTE_ART);
        LblDireccion.setFont(FUENTE_ART);
        LblRFC.setFont(FUENTE_ART);
        LblIdCliente.setFont(FUENTE_ART);
        //FONDO LBL
        LblTitulo.setBackground(FONDOTITLE);
        LblNombre.setBackground(FONDOLBL);
        LblApPaterno.setBackground(FONDOLBL);
        LblApMaterno.setBackground(FONDOLBL);
        LblTelefono.setBackground(FONDOLBL);
        LblDireccion.setBackground(FONDOLBL);
        LblRFC.setBackground(FONDOLBL);
        LblIdCliente.setBackground(FONDOLBL);
        
        LblTitulo.setOpaque(true);
        LblNombre.setOpaque(true);
        LblApPaterno.setOpaque(true);
        LblApMaterno.setOpaque(true);
        LblTelefono.setOpaque(true);
        LblDireccion.setOpaque(true);
        LblRFC.setOpaque(true);
        LblIdCliente.setOpaque(true);
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
