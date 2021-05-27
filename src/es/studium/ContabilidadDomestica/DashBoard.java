package es.studium.ContabilidadDomestica;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DashBoard extends Frame
{
	private static final long serialVersionUID = 1L;
	//Base de datos
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/programagestion";
	String login = "root";
	String password = "Studium2020;";
	String sentencia = "";
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;
	//Pantalla 
	Label lblMes = new Label();
	Label lblTotal = new Label();
	Button	btnAlta = new Button();
	Button	btnBaja = new Button();
	Button	btnModificaciones = new Button();
	Button	btnListado = new Button();
	Calendar fecha = new GregorianCalendar();
	int mes = fecha.get(Calendar.MONTH);
	
	public DashBoard()
	{
		this.setResizable(false);
		this.setTitle("DashBoard");
		this.setLayout(new FlowLayout());;
		this.setSize(450 ,200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	public Connection conectar()
	{
		try
		{
			//Cargar los controladores para el acceso a la BD
			Class.forName(driver);
			//Establecer la conexión con la BD Empresa
			connection = DriverManager.getConnection(url, login, password);
		}
		catch (ClassNotFoundException cnfe)
		{
			System.out.println("Error 1-"+cnfe.getMessage());
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 2-"+sqle.getMessage());
		}
		return connection;
	}
	public void desconectar(Connection con)
	{
		try
		{
			con.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

