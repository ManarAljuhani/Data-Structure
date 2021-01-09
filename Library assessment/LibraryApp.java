
import java.util.Scanner; 
public class LibraryApp {
public static void main(String[] args) { //The menue class and the main
//Declare Varibles and intinalize it with a -1 if it integers or null for the strings
int book= -1;
String book1= null;
int Number = -1 ;
Scanner in = new Scanner(System.in);
int guest =1;
int age= -1;
String type = null;
String name = null; 
DataBase obj =  new DataBase();
                     
                       System.out.println("HELLO !\n I'M A LIBRARY ASSISSTANT");
                       System.out.println("A self-billing system for libraries");
                       System.out.println("please complete your data after your borrowing!");
                       obj.clientTracer(guest);
                       System.out.println("---------------------------------------");
while(true) {           
//while the user didn't chose the number "6" to exit the program will keep runing
                        System.out.println("");
                        System.out.println("PLEASE SELECT A CHOISE"); 
                        System.out.println("1. To be a member");
	   		System.out.println("2. To See All The Avilable Books");
	   		System.out.println("3. To Borrow A Book");
	   		System.out.println("4. Your Final Bill");
	   		System.out.println("5. End your task");
	   		System.out.println("6. New guest");
	   		int choice = in.nextInt();
	   		switch(choice) { 
	   		//depending on the choice from the above menue the switch statment will connect with the right methods
	   			case 1 :obj.informations();break;// here the variable will pass the first value of the stack
	   			case 2 : obj.DataBase();break;
	   			case 3 : obj.Borrow();break;
	   			case 4:  obj.Bill(name , age , type);break;
	   			case 5 : return;
	   			case 6 :guest = guest+1; //the variable guest will be incrimenting as long as the program running 
	   			obj.clientTracer(guest);break; //then will pass the new value to the tracer method which will assign it to the stack itself
	   			default: System.out.println("Invalid input. Please try again");//if the user didn't chose one of the above nubmer an error message will be showen
	   		}
	   	}
	   	
	   	
}
}
