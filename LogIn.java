import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;


public class LogIn {

	String userName;
	String password;
	char loginType;
	static Connection conn;
	static Statement stmt;
	
	Scanner sin = new Scanner(System.in);
	
	static final String jdbcURL = "jdbc:oracle:thin:@ora.csc.ncsu.edu:1521:orcl";	//URL	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getLoginType() {
		return loginType;
	}
	public void setLoginType(char loginType) {
		this.loginType = loginType;
	}
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	//First Screen, for student and faculty login
	public LogIn()
	{	try{
		
		Connection conn = databaseLogIn("rrporey","gandalf");
		
		System.out.println("Welcome to NCSU Libraries!!!");
		System.out.println("Log In As:");
		System.out.println("1. Student");
		System.out.println("2. Faculty");
		switch(sin.nextInt())
		{
		case 1: this.loginType = 'S'; break;
		case 2: this.loginType = 'F'; break;
		}
		
		System.out.println("Enter Username and Password");
		System.out.println("Username : "); this.setUserName(sin.next());
		System.out.println("Password : "); this.setPassword(sin.next());
		
		ResultSet rs = null;
				
		switch(this.loginType)
		{
			//select query to match username password;
		case 'S' : 
		case 'F' : 
		
		}
		
		//if(rs.next())
		{
			Menu nextMenu = new Menu(this);
			// Go to next Menu
		}//else
		{
			//LogIn Failed
			//Call Login Object again;
		}
		
	
		
	}//end try
	catch(Exception E) { E.printStackTrace();}
	}
	
	
	//Sets Up database connection with DB and return CONNECTION to use in subsequent queries.
	public Connection databaseLogIn(String uName, String pass)
	{
        try {

	        // Load the driver. This creates an instance of the driver
		    // and calls the registerDriver method to make Oracle Thin
	        // driver available to clients.

        	Class.forName("oracle.jdbc.driver.OracleDriver");

	         // Get a connection from the first driver in the
			// DriverManager list that recognizes the URL jdbcURL

			conn = DriverManager.getConnection(jdbcURL, uName, pass);
			stmt = conn.createStatement();
			System.out.println("Success!!");  
			
        }
        catch(SQLException SQLe){System.out.println("Fail!!");}
        catch(Exception E){	System.out.print(E.getStackTrace());}
        return conn;
	}
	
	public static void main(String[] args){
		
		Scanner sin = new Scanner(System.in);
		//Log In 
		LogIn L = new LogIn();


	}
}
