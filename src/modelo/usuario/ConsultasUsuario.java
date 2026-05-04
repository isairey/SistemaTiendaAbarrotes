/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.usuario;
import conexion.Conexion;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Consultas Usuario.
 * 
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 16/10/2023
 */
public class ConsultasUsuario extends Conexion{
    Connection Con = getConexion();//Se conecta a la base de datos
    
    public boolean buscarLogin(ModeloUsuario Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "Select * from usuarios where usuario = ? and password = ?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setString(1, Modelo.getUsuario());//? #1 "usuario del modelo"
            Ps.setString(2, Modelo.getPassword());//? #2 "password del modelo"
            ResultSet Rs= Ps.executeQuery();//Para obtener resultados, se ejecuta la consulta SQL
            if(Rs.next()){// Si se encontro al usuario en la BD
                Modelo.setNombre(Rs.getString("nombre"));//LLena el modelo con este dato faltante o buscado
                Modelo.setTipo(Rs.getString("tipo"));//LLena el modelo con este dato faltante o buscado
                return true;//todo esta bien, retorna verdadero y llena el modelo con los datos buscados
            }
            return false;//No se encontro usuario en la base de datos retorna falso
        }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: " +e);
            return false;//algo salio mal, return falso y error
        }
    }
}
