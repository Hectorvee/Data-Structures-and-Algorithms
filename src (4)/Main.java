/*
 * Total Marks Main Class: 14
 * Compilation & Correct Execution Marks: 10
 */
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
	private static String path = "list.dat";	
	
	/*
	 * Appends a new ProductItem to the current binary file
	 * 7 Marks
	 */
	public static void writeProductItemToFile(ProductItem item){
		//TODO: Complete
	}
	
	/*
	 * Reads all the objects in the current binary file and loads them into a Single Linked List (SList)
	 * 7 Marks
	 */
	public static SList<ProductItem> readProductItemsFromFile(){
		//TODO: Complete
	}
	
	public static void main(String[] args) {		
		String response = "";
		Scanner s = new Scanner(System.in);
		while (!response.toLowerCase().equals("quit")){
			System.out.println("==================================================");
			System.out.println("===\t\tCommand Line TODO\t\t==");
			System.out.println("==================================================\n");
			System.out.println("The current Todo List path is: "+path);
			System.out.println("Select option: ");
			System.out.println("1) Set path");
			System.out.println("2) Read and Display current Todo List");
			System.out.println("3) Write new Todo item to current Todo List");
			System.out.println("or \"quit\" to quit.");		
			response = s.nextLine();
			
			switch(response.toLowerCase()){
				case "1": {
					System.out.println("Enter path:");
					path = s.nextLine();
				}
					break;
				case "2": {
					SList<ProductItem> list = readProductItemsFromFile();					
					System.out.println(list);
				}
					break;
				case "3":{
					try{
						ProductItem pi = new ProductItem();
						System.out.println("Enter ProductItem's id: ");
						response =s.nextLine();
						pi.setId(Integer.parseInt(response));
						System.out.println("Enter ProductItem's name: ");
						response = s.nextLine();
						pi.setName(response);
						System.out.println("Enter ProductItem's priority: ");
						response = s.nextLine();
						pi.setPrice(Double.parseDouble(response));;
						System.out.println("Enter ProductItem's description: ");
						response = s.nextLine();
						pi.setDescription(response);
						
						writeProductItemToFile(pi);
						System.out.println("Item added successfully");
					}
					catch(NumberFormatException nfe){
						System.err.println("Incorrect input inserted.");
					}					
				}
					break;
				case "quit":
					break;
				default: System.out.println("Incorrect option selected. Please try again.");
			}			
		}
		s.close();
	}
}