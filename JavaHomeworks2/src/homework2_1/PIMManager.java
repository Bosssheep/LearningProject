package homework2_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Command Oriented Personal Information Manager
 * @author HYChan 2018-4-3
 *
 */
public class PIMManager {

	public static void main(String[] args) {
		
		ArrayList<PIMEntity> items = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to PIM.");
		System.out.println("---Enter a command (suported commands are List Create Save Load Quit)---");
		while(sc.hasNext()){
			
			String str = sc.next();
			if( str.equals("List")){
			List(items);
			}
			else if(str.equals("Create")){
			Create(items);
			}
			else if(str.equals("Save")){
				Save(items);
			}
			else if(str.equals("Load")){
				Load(items);
			}
			else if(str.equals("Quit")){
				break;
			}
			
			System.out.println("---Enter a command (suported commands are List Create Save Load Quit)---");
		}
	}
	

	private static void Load(ArrayList<PIMEntity> items) {
		File file = new File("D:\\PIMManager.txt");
		FileReader fileReader = null;
		BufferedReader in = null;
	    try {
	      fileReader = new FileReader(file);
	      in = new BufferedReader(fileReader);
	      String line = null;  
          while((line = in.readLine()) != null) {  
              System.out.println(line);  
          }  
	    }catch(IOException e){
	    	e.printStackTrace();
	    }finally{
	    	try {
				in.close();
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }   
	}


	private static void Save(ArrayList<PIMEntity> items) {
		
		  File file = new File("D:\\PIMManager.txt");
		  
		  //若文件不存在，则创建
		  if(!file.exists()){
			  try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		  }
		  FileWriter fileWriter = null;
		
		  try {
		    	fileWriter = new FileWriter(file);
		        fileWriter.write(items.toString());
		    } catch (IOException e) {
		    	e.printStackTrace();
		    }finally{
		    	try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
		    }
	}


	public static void List(ArrayList<PIMEntity> items){
		if(items == null)
		{
			System.out.println("There are 0 items.");
		}
		else{
			System.out.println("There are "+items.size()+" items.");
			
			for(int i = 0;i < items.size();i++){
				System.out.print("Item "+i+": ");
				System.out.println(items.get(i));
			}
		}
	}
	
	public static void Create(ArrayList<PIMEntity> items){
		System.out.println("Enter an item type ( todo, note, contact or appointment )");
		Scanner sc = new Scanner(System.in);
		String enter = sc.nextLine();
		
		if(enter.equals("todo")){
		    PIMTodo todo = new PIMTodo();
			System.out.println("Enter date for todo item: ");
			String input = sc.nextLine();
			todo.setDate(input);
			System.out.println("Enter todo text:");
			input = sc.nextLine();
			todo.setContent(input);
			System.out.println("Enter todo priority:");
			input = sc.nextLine();
			todo.setPriority(input);
			items.add(todo);
		}
		else if(enter.equals("note")){
			PIMNote note = new PIMNote();
			
			System.out.println("Enter note content:");
			String input = sc.nextLine();
			note.setContent(input);
			
			System.out.println("Enter note priority:");
			input = sc.nextLine();
			note.setPriority(input);
			
			items.add(note);
		}
		else if(enter.equals("contact")){
			PIMContact contact = new PIMContact();
			
			System.out.println("Enter contact priority: ");
			String input = sc.nextLine();
			contact.setPriority(input);
			
			System.out.println("Enter contact content(eg.  firstname,lastname,email ):");
			input = sc.nextLine();
			String[] content = input.split(",");
			contact.setContact(content);
			
			items.add(contact);
			
		}
		else if(enter.equals("appointment")){
			PIMAppointment appointement = new PIMAppointment();
			
			System.out.println("Enter appointment description:");
			String input = sc.nextLine();
			appointement.setDescription(input);
			
			System.out.println("Enter appointment priority: ");
			input = sc.nextLine();
			appointement.setPriority(input);
			
			System.out.println("Enter date for todo item: ");
			input = sc.nextLine();
			appointement.setData(input);
			
			items.add(appointement);
		}
		
	}
	
	
	
}
