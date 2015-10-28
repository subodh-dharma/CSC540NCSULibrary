import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;


public class Menu {
	
	static Scanner sin = new Scanner(System.in); 
	
	public Menu(LogIn L)
	{
		try{
		Connection conn = L.getConn();
		Statement stmt = conn.createStatement();
		ResultSet rs = null;
		
		//Runtime.getRuntime().exec("cls");
		System.out.println("1. Profile");
		System.out.println("2. Resources");
		System.out.println("3. Checked-out Resources");
		System.out.println("4. Resource Request");
		System.out.println("5. Notifications");
		System.out.println("6. Due-Balance");
		System.out.println("7. Logout");
		
		switch(sin.nextInt())
		{
		case 1:	//Select * Query on Student/Faculty Table	//If Edit? Call EditMenu  
			    rs = stmt.executeQuery("Select P.patron_id, P.first_name, P.last_name, S.phone_no, S.alt_phone, S.Street, S.city, S.post_code, P.DOB ," +
			    		"S.sex, P.nationality, P.department, S.program, S.degree from Patron P, Student S " +
			    		"where P.patron_id = S.student_id AND P.patron_id = 200110931");
			    ResultSetMetaData rsmd = rs.getMetaData();
			    
			    while(rs.next())
			    {	
			    	//for(int i=1;i<=rsmd.getColumnCount();i++)
			    		System.out.print("Student ID:"+rs.getString(1));
			    		System.out.print("\tName:"+rs.getString(2)+"  "+rs.getString(3));
			    		System.out.print("\nPhone No.:"+rs.getString(4));
			    		System.out.print("\tAddress:"+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
			    		System.out.print("\nDepartment:"+rs.getString(12));
			    		System.out.print("\tProgram:"+rs.getString(13));
			    		System.out.print("\tDegree:"+rs.getString(14));
			    		
			    }
			    
			    break;
		case 2: //Call Menu for Books/Conference/Journals/Cameras/Rooms
				new ResourceMenu();	
				break;
		case 3: //Select * Query on Reserved Tabled of all resources
				
				break;
		case 4: //Call Menu for Books/Conference/Journals/Cameras/Rooms
				//How is it different than case 2? Can we merge them?
		case 5: //Select * Query for Notifications table
				break;
		case 6: //Select Query on Due-Balance
				break;
		case 7: //Home Page
		}
		
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
	}
}


/*
@Calling a stored procedure
delete later
Connection c = databaseLogIn(getUserName(), getPassword());
CallableStatement cstmt = c.prepareCall("{call bleh(?,?,?)}");
cstmt.registerOutParameter(1, Types.VARCHAR);
cstmt.registerOutParameter(2, Types.VARCHAR);
cstmt.registerOutParameter(3, Types.VARCHAR);
cstmt.executeUpdate();
cstmt.re
cstmt.setInt(1  parameter no., i_deptnovalue);

System.out.println("Output"+cstmt.getString(1)+" "+cstmt.getString(2)+" "+cstmt.getString(3)+" ");
cstmt.close();
c.close();*/


