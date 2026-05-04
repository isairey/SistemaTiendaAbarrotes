/*
 * Controlador Vista Pantalla Principal.
 */
package controlador.principal;

import controlador.articulos.ControladorVistaArticulos;
import controlador.clientes.ControladorVistaClientes;
import controlador.empleados.ControladorVistaEmpleados;
import controlador.proveedores.ControladorVistaProveedores;
import controlador.usuarios.ControladorVistaUsuarios;
import controlador.ventas.ControladorVistaVentas;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.articulos.ModeloArticulos;
import modelo.clientes.ModeloClientes;
import modelo.empleados.ModeloEmpleados;
import modelo.proveedores.ModeloProveedores;
import modelo.usuarios.ModeloUsuarios;
import modelo.ventas.ModeloVentas;
import vista.articulos.VistaArticulos;
import vista.clientes.VistaClientes;
import vista.empleados.VistaEmpleados;
import vista.principal.VistaPantallaPrincipal;
import vista.proveedores.VistaProveedores;
import vista.usuarios.VistaUsuario;
import vista.ventas.VistaVentas;

/**
 * Controlador Vista Pantalla Principal.
 * Controla un objeto de tipo VistaPantallaPrincipal.
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 16/10/23
 */
public class ControladorVistaPantallaPrincipal implements MouseListener, ActionListener{
    private VistaPantallaPrincipal VistaPantallaPrincipal;

    public ControladorVistaPantallaPrincipal(VistaPantallaPrincipal VistaPantallaPrincipal) {
        this.VistaPantallaPrincipal = VistaPantallaPrincipal;
        oyentes();//Llamada a los oyentes
        VistaPantallaPrincipal.setVisible(true);
    }

    private void oyentes() {
        VistaPantallaPrincipal.BtnMin.addMouseListener(this);
        VistaPantallaPrincipal.BtnMin.addActionListener(this);
        VistaPantallaPrincipal.BtnCliente.addMouseListener(this);
        VistaPantallaPrincipal.BtnEmpleado.addMouseListener(this);
        VistaPantallaPrincipal.BtnProv.addMouseListener(this);
        VistaPantallaPrincipal.BtnVentas.addMouseListener(this);
        VistaPantallaPrincipal.BtnProductos.addMouseListener(this);
        VistaPantallaPrincipal.BtnSalir.addMouseListener(this);
        VistaPantallaPrincipal.BtnUser.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == VistaPantallaPrincipal.BtnSalir) {
               VistaPantallaPrincipal.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
               int opc = JOptionPane.showConfirmDialog(null, "¿Deseas salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
               if (opc == 0) 
                System.exit(0);
            
       }
        if (e.getSource() == VistaPantallaPrincipal.BtnProductos) {
               VistaPantallaPrincipal.BtnProductos.setCursor(new Cursor(HAND_CURSOR));
               ModeloArticulos ModeloArticulos = new ModeloArticulos();
               VistaArticulos VistaArticulos = new VistaArticulos(new JFrame(), true);
                ControladorVistaArticulos CVA= new ControladorVistaArticulos(ModeloArticulos,VistaArticulos);
                
       }
        
        if (e.getSource() == VistaPantallaPrincipal.BtnUser) {
               VistaPantallaPrincipal.BtnUser.setCursor(new Cursor(HAND_CURSOR));
               ModeloUsuarios ModeloUsuarios = new ModeloUsuarios();
               VistaUsuario VistaUsuario = new VistaUsuario(new JFrame(), true);
                ControladorVistaUsuarios CVU= new ControladorVistaUsuarios(ModeloUsuarios,VistaUsuario);
                
        }
        if (e.getSource() == VistaPantallaPrincipal.BtnMin) {
               VistaPantallaPrincipal.BtnMin.setCursor(new Cursor(HAND_CURSOR));
               
       }
        if (e.getSource() == VistaPantallaPrincipal.BtnCliente) {
               VistaPantallaPrincipal.BtnCliente.setCursor(new Cursor(HAND_CURSOR));
               ModeloClientes ModeloClientes = new ModeloClientes();
               VistaClientes VistaClientes = new VistaClientes(new JFrame(), true);
                ControladorVistaClientes CVC= new ControladorVistaClientes(ModeloClientes,VistaClientes);
       }
        if (e.getSource() == VistaPantallaPrincipal.BtnEmpleado) {
               VistaPantallaPrincipal.BtnEmpleado.setCursor(new Cursor(HAND_CURSOR));
                ModeloEmpleados ModeloEmpleados = new ModeloEmpleados();
               VistaEmpleados VistaEmpleados = new VistaEmpleados(new JFrame(), true);
                ControladorVistaEmpleados CVE= new ControladorVistaEmpleados(ModeloEmpleados,VistaEmpleados);
       
       }
        if (e.getSource() == VistaPantallaPrincipal.BtnProv) {
               VistaPantallaPrincipal.BtnProv.setCursor(new Cursor(HAND_CURSOR));
               ModeloProveedores ModeloProveedores = new ModeloProveedores();
               VistaProveedores VistaProveedores = new VistaProveedores(new JFrame(), true);
                ControladorVistaProveedores CVP= new ControladorVistaProveedores(ModeloProveedores,VistaProveedores);
       }
        if (e.getSource() == VistaPantallaPrincipal.BtnVentas) {
               VistaPantallaPrincipal.BtnVentas.setCursor(new Cursor(HAND_CURSOR));
               ModeloVentas ModeloVentas = new ModeloVentas();
               VistaVentas VistaVentas = new VistaVentas(new JFrame(), true);
                ControladorVistaVentas CVV= new ControladorVistaVentas(ModeloVentas,VistaVentas);
       
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
        if (e.getSource() == VistaPantallaPrincipal.BtnMin) {
               VistaPantallaPrincipal.BtnMin.setCursor(new Cursor(HAND_CURSOR));
       }  
        if (e.getSource() == VistaPantallaPrincipal.BtnProductos) {
               VistaPantallaPrincipal.BtnProductos.setCursor(new Cursor(HAND_CURSOR));
       }
        if (e.getSource() == VistaPantallaPrincipal.BtnSalir) {
               VistaPantallaPrincipal.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
       }
        if (e.getSource() == VistaPantallaPrincipal.BtnUser) {
               VistaPantallaPrincipal.BtnUser.setCursor(new Cursor(HAND_CURSOR));
       }
        
        if (e.getSource() == VistaPantallaPrincipal.BtnMin) {
               VistaPantallaPrincipal.BtnMin.setCursor(new Cursor(HAND_CURSOR));
               
       }
        if (e.getSource() == VistaPantallaPrincipal.BtnCliente) {
               VistaPantallaPrincipal.BtnCliente.setCursor(new Cursor(HAND_CURSOR));
               
       }
        if (e.getSource() == VistaPantallaPrincipal.BtnEmpleado) {
               VistaPantallaPrincipal.BtnEmpleado.setCursor(new Cursor(HAND_CURSOR));
               
       }
        if (e.getSource() == VistaPantallaPrincipal.BtnProv) {
               VistaPantallaPrincipal.BtnProv.setCursor(new Cursor(HAND_CURSOR));
               
       }
        if (e.getSource() == VistaPantallaPrincipal.BtnVentas) {
               VistaPantallaPrincipal.BtnVentas.setCursor(new Cursor(HAND_CURSOR));
               
       }
   
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VistaPantallaPrincipal.BtnMin) {
               VistaPantallaPrincipal.setExtendedState(JFrame.ICONIFIED);
               
       }
    }
    
}
