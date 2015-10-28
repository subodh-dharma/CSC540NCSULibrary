import java.util.Scanner;


public class CameraMenu 
{
	static Scanner s_in = new Scanner(System.in);
	
	public CameraMenu()
	{
		try{
		//Runtime.getRuntime().exec("cls");
		System.out.println("Choose an option");
		System.out.println("1. Enter Date for available Cameras: (dd-mm-yyyy)");
		System.out.println("2. Enter Camera ID for Details");
		
		
		switch(s_in.nextInt())
		{
		case 1:		
					
					
					break;
		case 2:		
						
			break;
				
		}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
	}
	
}
