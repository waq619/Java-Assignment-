import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class GraphicScreenAssignment { 
public static void main(String[] args) throws FileNotFoundException { 
	GraphicScreenAssignment obj = new GraphicScreenAssignment();	
		obj.go(); 
	}
GraphicsScreen g = new GraphicsScreen(); 
int param1 = 0;
int param2 = 0;
int param3 = 0;
public void go() throws FileNotFoundException
		{	
			
			while(true)
			{				
			System.out.println("Enter Command: "); 
			Scanner scan = new Scanner(System.in);
			String cmd = scan.nextLine(); 
			String [] userParam = cmd.split(" ");

			for(int i = 0; i < userParam.length; i++) { 
				String currentText = userParam[i]; 
				currentText = currentText.trim(); 
				currentText = currentText.toLowerCase();	
				userParam[i] = currentText;
			}
				if (userParam[0].equals("load")){
					Scanner s = new Scanner(new File("I:\\Level 5\\FINALFINAL\\Programming\\src\\Load.txt"));	
				
				String line;	
				
				while ( s.hasNext() ) {
					
					line = s.nextLine();		
					
					userParam = line.split(" ");
					processCmd(userParam);
					
				}
				
				System.out.println("\nEOF");	
				
				
				
				}
				else 
				{
					processCmd(userParam);
				}
			}	
		}
