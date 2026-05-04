package conexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Conexion A BD
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 16/10/2023
 */
public class Conexion  {
    //REMOTO COMENTAR
    /**
    //Datos necesarios que cambian de acuerdo a las necesidades de la aplicación
    private final String Servidor = "10.225.35.173"; //si es local = "localhost"
    private final String Database = "Tiendita";
    private final String Usuario = "rafita"; //si el servidor es con localhost = root
    private final String Password = "holamundo";    //si el servidor es con localhost = ""
*/
    //CASA DESCOMENTAE
     
    //Datos necesarios que cambian de acuerdo a las necesidades de la aplicación
    private final String Servidor = "localhost"; //si es local = "localhost"
    private final String Database = "BDAbarrotes";
    private final String Usuario = "root"; //si el servidor es con localhost = root
    private final String Password = "";    //si el servidor es con localhost = ""
    

    //Datos necesarios
    private final String Puerto = "3306"; //Es el puerto definido para MySQL
    private final String Url = "jdbc:mysql://"+Servidor+":"+Puerto+"/"+Database;    
    
    //Conexión
    private Connection Con;

    public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Con = (Connection) DriverManager.getConnection(Url,Usuario,Password);
            System.out.println("Conexión estrablecida con la base de datos "+Database);
            //JOptionPane.showMessageDialog(null,"Conexión estrablecida con la base de datos "+Database);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
        return Con; //retorna la conexion a la base de datos
    }
}

