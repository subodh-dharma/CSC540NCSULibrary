import java.util.Scanner;


public class ResourceMenu 
{
	static Scanner s_in = new Scanner(System.in);
	
	public ResourceMenu()
	{
		try{
		//Runtime.getRuntime().exec("cls");
		System.out.println("What Do you want to Search for?");
		System.out.println("1. Books");
		System.out.println("2. Journals");
		System.out.println("3. Conference Proceedings");
		System.out.println("4. Study Rooms/ Conference Rooms");
		System.out.println("5. Camera");
		
		switch(s_in.nextInt())
		{
		case 1:	new BookMenu();	break;
		case 2: new JournalMenu();	break;
		case 3:	new ConfProMenu();	break;
		case 4:	new RoomMenu();	break;
		case 5:	new CameraMenu();	break;
		default:
				
		}
		
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
	}
}


class BookMenu
{
	static Scanner s_in = new Scanner(System.in);
	
	public BookMenu()
	{
		System.out.println("Choose an option");
		System.out.println("1. Search By ISBN");
		System.out.println("2. Search By Title");
		System.out.println("3. Search By Author");
		
		switch(s_in.nextInt())
		{
		case 1:
		case 2:
		case 3:
		
		}
	}
}

class JournalMenu
{
	static Scanner s_in = new Scanner(System.in);
	
	public JournalMenu()
	{
		System.out.println("Choose an option");
		System.out.println("1. Search By ISSN");
		System.out.println("2. Search By Title");
		System.out.println("3. Search By Author");
		
		switch(s_in.nextInt())
		{
		case 1:
		case 2:
		case 3:
		
		}
	}
}

class ConfProMenu
{
	static Scanner s_in = new Scanner(System.in);
	
	public ConfProMenu()
	{
		System.out.println("Choose an option");
		System.out.println("1. Search By Conference Number");
		System.out.println("2. Search By Title");
		System.out.println("3. Search By Author");
		
		switch(s_in.nextInt())
		{
		case 1:
		case 2:
		case 3:
		
		}
	}
}