/*
 * Controlador Vista Splash
 */
package controlador.splash;

import controlador.login.ContoladorVistaLogin;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.usuario.ModeloUsuario;
import vista.login.VistaLogin;
import vista.splash.VistaSplash;

/**
 *  Controlador Vista Splash.
 * Controla a un objeto de tipo VistaSplash.
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 09/10/2023.
 */
public class ControladorVistaSplash implements MouseListener, MouseMotionListener, MouseWheelListener{
    /**
     * VistaSplash (VistaSplash).
     * Objeto muerto al que le dara vida el construtor.
     */
    VistaSplash VistaSplash;// Variable miembro o global
    
    /**
     * Coordenadass iniciales del JFrame.
     * x, y (int).
     */
    int x,y;

    public ControladorVistaSplash(VistaSplash VistaSplash) {
        this.VistaSplash = VistaSplash;
        this.VistaSplash.setVisible(true);
        oyentes();
        //Duerme y mata al Splash despues de determinados segundos
        dormirMatarSplash(5);
    }

    // METODOS MOUSE LISTENER
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
       if (e.getSource()==VistaSplash.LblSplash) {
            x = e.getX();//Obtiene las coordenadas en x de la etiqueta
            y = e.getY();//Obtiene las coordenadas en y de la etiqueta
           
        } 
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==VistaSplash.LblSplash) {
            VistaSplash.LblSplash.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }


//METODOS MOUSE MOTION LISTENER
    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource()==VistaSplash.LblSplash) {
        VistaSplash.setLocation(VistaSplash.getLocation().x+e.getX()-x, VistaSplash.getLocation().y+e.getY()-y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    

//MOUSE WHEEL LISTENER
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if (e.getSource()==VistaSplash.LblSplash) {
            VistaSplash.dispose();//Cierra el Splash
        }
    }
    //OYENTES
          private void oyentes() {
        VistaSplash.LblSplash.addMouseListener(this);
        //OYENTE MOUSE MOTION LISTENER
        VistaSplash.LblSplash.addMouseMotionListener(this);
        //Oyente MouseWheelListener
        VistaSplash.LblSplash.addMouseWheelListener(this);
    }

    private void dormirMatarSplash(int i) {
        try {
            Thread.sleep(i * 100);
        } catch (InterruptedException ex) {
            System.out.println("Error: "+ ex);
        }finally{//pase o no un error se ejecuta lo siguiente
            VistaSplash.dispose();//Quita la ventana Splash
            
            //dar paso al login Creando la vista y controlador
            ModeloUsuario ModeloUsuario = new ModeloUsuario();
            VistaLogin VistaLogin = new VistaLogin();
            ContoladorVistaLogin CVL = new ContoladorVistaLogin(VistaLogin, ModeloUsuario);
        }
    }
}

