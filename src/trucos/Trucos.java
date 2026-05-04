/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trucos;
import java.awt.AWTException;
import java.awt.Component;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author Arturo Emanuel Fonseca Ruiz
 * 
 */
public class Trucos {
    public static void simularEnter(Component Componente) {
        try {
            Robot Robot = new Robot();
            Componente.requestFocus();
            Robot.keyPress(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Componente, "Error: "+e);
        }
    }
    public static void simularClic(Component Componente) {
        try {
            Robot Robot = new Robot();
            Componente.requestFocus();
            Robot.mousePress(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Componente, "Error: "+e);
        }
    }
}
