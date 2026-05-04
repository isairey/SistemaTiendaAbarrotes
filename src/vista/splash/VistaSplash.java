/*
 * VISTA SPLASH
 */
package vista.splash;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Clase Vista Splash.
 * Pequeña animacion de 3 segundos que muestra el logo de la empresa.
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 09/10/2023
 */
public class VistaSplash extends JFrame{
    private ImageIcon ImSplash = new ImageIcon(getClass().getResource("/imagenes/splash/splash.gif"));
    public JLabel LblSplash = new JLabel(ImSplash);
    /**
     * Constructor VistaSplash().
     * Inicializa los atributos de la clase.
     */
    public VistaSplash() {
        configuracion();
        agregarEtiquetaSplash();
        
    }

    private void configuracion() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(ImSplash.getIconWidth(), ImSplash.getIconHeight());
        this.setLocationRelativeTo(null);
        //QUITAR EL DECORADO DEL JFRAME
        this.setUndecorated(true);
        //QUITAR EL FONDO DEL JFRAME
        this.setBackground(new Color(0,0,0,0));
        this.setAlwaysOnTop(true);
    }

    private void agregarEtiquetaSplash() {
        this.add(LblSplash);
    }
    
}
