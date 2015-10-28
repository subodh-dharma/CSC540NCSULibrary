import java.util.Scanner;


public class RoomMenu 
{
	static Scanner s_in = new Scanner(System.in);
	
	public RoomMenu()
	{
		System.out.println("Choose an option");
		System.out.println("1. Book a Study room");
		System.out.println("2. Book a Conference room");
		
		
		switch(s_in.nextInt())
		{
		case 1:	new StudyRoom();	break;
		case 2: new ConferenceRoom();	break;
				
		}
	}
}


class StudyRoom
{
	static Scanner s_in = new Scanner(System.in);
	
	public StudyRoom()
	{
		System.out.println("Choose an option");
		System.out.println("1. Check Availability");
		System.out.println("2. Today's Reservations");
		
		
		switch(s_in.nextInt())
		{
		case 1:		System.out.println("Enter the Start time and End time: (HHMM format)");
					int start_time =0 , end_time =0;
					start_time = s_in.nextInt();
					end_time = s_in.nextInt();
					
					
					break;
		case 2:		System.out.println("Enter the Room No. "); 	
					int room_no = s_in.nextInt();
						
			break;
				
		}
		
	}
}

class ConferenceRoom
{
	static Scanner s_in = new Scanner(System.in);
	
	public ConferenceRoom()
	{
		try{
		//Runtime.getRuntime().exec("cls");
		System.out.println("Choose an option");
		System.out.println("1. Check Availability");
		System.out.println("2. Today's Reservations");
		
		
		switch(s_in.nextInt())
		{
		case 1:		System.out.println("Enter the Start time and End time: (HHMM format)");
					int start_time =0 , end_time =0;
					start_time = s_in.nextInt();
					end_time = s_in.nextInt();
					
					
					break;
		case 2:		System.out.println("Enter the Room No. "); 	
					int room_no = s_in.nextInt();
						
			break;
				
		}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
	}
}