import java.util.*;
import java.util.Scanner; 
//hospitalSystem "Main" Class 
public class hospitalSystem
{
    //Vareiable declaration 
    public static String Name ; 
    public static int Age ; 
    public static int NID ; 
    public static int Number= 0  ;
    public static String phone ;
    public static String Day ; 
     public static String Date ; 
    public static String time ; 
     public static int edit  = -1 ; 
   public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
  DoublylinkedList object = new DoublylinkedList();  //Create an object the link the data to the methods 

   while(true){
       System.out.println("");
       System.out.println ("         ----HOSPITAL SYSTEM------         ");//Main menue
       System.out.println("Select The Service You Want");
       System.out.println("\n1-Create a New Folder");
       System.out.println("\n2-Access The Database ");
       System.out.println("\n3-Pay");
       System.out.println("\n4-Booking an Appointment ");
       System.out.println("\n5-Bill");
       System.out.println("\n6-Exit");
       
       int choice = in.nextInt();
       switch(choice){
           case 1 : 
           System.out.println("Enter The Patient Data Please:-");
           System.out.println("Name : ");
           Name = in.next();
           System.out.println("Age : ");
           Age = in.nextInt();
           System.out.println("National ID : ");
            NID = in.nextInt();
           System.out.println("Phone Number : ");
           phone = in.next();
           Number = Number + 1 ; 
           object.insertFirst(Number , Name ,Age , NID , phone ); 
            break ;
           case 2 : 
           while(true){
           System.out.println ("-------------------------------------------");
           System.out.println("Chose The Opration:- "); //accsesing the linklist menue
           System.out.println("\n1-Show The Database");
           System.out.println("\n2-Add");
           System.out.println("\n3-Delete ");
           System.out.println("\n4-Search");
           System.out.println("\n5-View Hestory");
           System.out.println("\n6-return");
           
            edit = in.nextInt();
           
           switch(edit){ 
            case 1 : 

            object.upper();
            object.displayForward();
           break ; 
           case 2 : 
           System.out.println ("-------------------------------------------");
           System.out.println("\nChose Where Do You Want To Add"); // insert and switch oprations
           System.out.println("\n 1- In The Beginning");
           System.out.println("\n 2- In The End");
           System.out.println("\n 3-Return");
         
           choice = in.nextInt();
           switch(choice){
            case 1 :
             
             System.out.println("Enter The Patient Data Please:-"); 
            System.out.println("Name : ");
            Name = in.next();
            System.out.println("Age : ");
            Age = in.nextInt();
            System.out.println("National ID : ");
            NID = in.nextInt();
            System.out.println("Phone Number : ");
            phone = in.next();
            Number = Number + 1 ; 
             object.insertFirst(Number , Name ,Age , NID , phone ); 
             object.upper();
           object.displayForward();
            break ; 
            case 2 : 
            
             System.out.println("Enter The Patient Data Please:-");
            System.out.println("Name : ");
            Name = in.next();
            System.out.println("Age : ");
            Age = in.nextInt();
            System.out.println("National ID : ");
            NID = in.nextInt();
            System.out.println("Phone Number : ");
            phone = in.next();
            Number = Number + 1 ; 
             object.insertLast(Number , Name ,Age , NID , phone); 
             object.upper();
            object.displayForward();
            break ; 
            
             case 3 : break;
            }
            break ; 
           case 3 : 
           System.out.println ("-------------------------------------------");
           System.out.println("\n chose where do you want to delete"); //Deletion oprations
           System.out.println("\n 1- in the beginnig");
           System.out.println("\n 2- in the end");
           System.out.println("\n 3- in specific position");
           System.out.println("\n4-to return");
           
           choice = in.nextInt();
           switch(choice){
               case 1 : 
               object.deleteFirst(); 
                object.upper();
            object.displayForward();
               break ; 
               case 2 : 
                object.deleteLast(); 
                object.upper();
            object.displayForward();
               break ; 
               case 3 :
                System.out.println("Enter Folder's Owner National ID : ");
                int deletion= in.nextInt();
                object. deleteAtPosition(deletion);
                object.upper();
                object.displayForward();
               break;
                case 4 : break ; 
             
       
            }
            break ; 
            
            
            case 4:
             System.out.println("Enter Folder's Owner National ID: ");
            int Nid= in.nextInt();
             object.search(Nid);
            
            break;
           case 5: 
            object.displayBackward();
          
           break ;
          
           case 6 : break ; 
        
           
    }
    break ; 
}
break ; 
           case 3:
           System.out.println ("-------------------------------------------");
           System.out.println ("Choose Payment Method"); //payment oprations
           System.out.println("1-Chach\n2-Medical Insurance\n3-Mada\n4-Visa Or Mastercard\n5-return ");
           int pay = in.nextInt();
           switch(pay){
            case 1 : 
            System.out.println("paid conformed ");
            System.out.println ("-------------------------------------------");
            break; 
            
            case 2 :
            System.out.println("Company Name:");
            String Company = in.next();
            System.out.println("Owner ID:");
            String ID = in.next();
            System.out.println("paid conformed ");
            break ; 
            
            case 3 :
            case 4 :
            System.out.println("Card Number:");
            String Card = in.next();
            System.out.println("Expire Date:");
            String date = in.next();
            System.out.println("Owner Name:");
             String name = in.next();
             String name2 = in.next();
             System.out.println("CVV:");
             int CVV = in.nextInt();
            System.out.println("paid conformed ");
            System.out.println ("-------------------------------------------");
            case 5 : 
            break ; 
            }
            break ;
            case 4: 
           System.out.println ("-------------------------------------------");
           System.out.println ("            -----Valid Appointments-----          "); //for booking
           System.out.println ("Booking Details:");
           System.out.println ("Type Next Selcted Day:");
            Day = in.next();
            System.out.println ("Type Next Slicted Date:");
            Date = in.next();
           System.out.println ("Type Next Slicted Time:");
            time = in.next();
            
            System.out.println ("-------------------------------------------");
            break;
            case 5 :
            System.out.println ("-------------------------------------------");
            System.out.println ("             -----The Bill-----            ");//final bill
            System.out.println ("");
            System.out.println ("Name :\n"+Name);
            System.out.println ("Waiting Number :\n"+Number);
            System.out.println ("paid stute :\n succes");
            System.out.println ("piked next appointment :\n"+Date+"\t"+Day+"\tat"+"\t"+time);
            System.out.println ("");
            System.out.println ("-------------------------------------------");
            break ; 
            
           case 6:
           
           return;
          
           
           
           
           
           
        
        }
    }
}
}

//end of hospitalSystem Class 
       
