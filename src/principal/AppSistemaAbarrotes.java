/*
 * Aplicacion Principal
 */
package principal;

import controlador.splash.ControladorVistaSplash;
import vista.splash.VistaSplash;

/**
 * Aplicacion Principal AppSistemaAbarrotes().
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 09/10/2023.
 */
public class AppSistemaAbarrotes {
    public static void main(String[] args) {
        //Creamos los objetos de arranque
        VistaSplash VistaSplash = new VistaSplash();
        ControladorVistaSplash CVS = new ControladorVistaSplash(VistaSplash);
    }
}
