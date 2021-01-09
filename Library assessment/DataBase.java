import java.util.Scanner;
import java.util.*;
   public class DataBase
{
//Declare Varibles
private int Number ;
private int age;
private String type;
private String name ; 
private int choice;
private int size;
private int NumberOfBook ; 
String Book ; 
Scanner in = new Scanner(System.in); //Scanner
Stack obj = new Stack(); //Object to connet this class with the Stack class
String[] DataBase = new String[22]; //create Array of string to contain all the available book 
public DataBase(){
}
public void DataBase(){
 //Initialize the Array content in the DataBase method by assign each ine with an index number
 DataBase[0] = "In Search of Lost Time by Marcreel Proust";
 DataBase[1] = "Ulysses by James Joyce";
 DataBase[2] = "Don Quixote by Miguel de Cervantes";
 DataBase[3] = "The Great Gatsby by F. Scott Fitzgerald";
 DataBase[4] = "One Hundred Years of Solitude by Gabriel Garcia Marquez";
 DataBase[5] = "Moby Dick by Herman Melville";
 DataBase[6] = "War and Peace by Leo Tolstoy";
 DataBase[7] = "Lolita by Vladimir Nabokove";
 DataBase[8] = "Hamlet by William Shakespeare";
 DataBase[9] = "The Catcher in the Rye by J. D. Salinger";
 DataBase[10] = "The Odyssey by Homer";
 DataBase[11] = "The Brothers Karamazov by Fyodor Dostoyevsky";
 DataBase[12] = "Crime and Punishment by Fyodor Dostoyevsky";
 DataBase[13] =  "Madame Bovary by Gustave Flaubert";
 DataBase[14] = "The Divine Comedy by Dante Alighieri";
 DataBase[15] = "The Adventures of Huckleberry Finn by Mark Twain";
 DataBase[16] = "Alice's Adventures in Wonderland by Lewis Carroll" ;
 DataBase[17] = "Pride and Prejudice Jane Austen";
 DataBase[18] = "Wuthering Heights by Emily Brontë";
 DataBase[19] = "To the Lighthouse by Virginia Woolf";
 DataBase[20] = "The Alchemist by Paulo Coelho";

for (int i = 1 ;i<21; i++) { //print all the contents
System.out.println("Book Number "+i+" = :" +DataBase[i]);
System.out.println("---------------------------------------");}
}

 public void Borrow(){ //method helps the user to identify his book by its number from the data base
   System.out.println("Enter the Number of your book"); 
   NumberOfBook= in.nextInt();
   System.out.println("your book is\t" + NumberOfBook);
 }
 public void clientTracer(int client){//method to trace the clients number 
  
  obj.push(client); //push the first number for the first client
  
   System.out.println("YOU ARE OUR CLIENT NUMBER \t"); //show the number of the current client
   System.out.println(obj.top()) ;}


public void informations(){//method to trace the clients number 
  System.out.println("PLEASE COMPLEATE YOUR INFORMATIONS..."); //load the informations from user 
   System.out.println("-Your Name \n");
   name= in.next();
    System.out.println("-Your Age\n");
   age= in.nextInt();
   System.out.println("-Your Favorite Category\n");
    type= in.next();
  System.out.println("If You Want To Delete Your Saved Data Please Enter Y/N ");//test the pop() method, this feater gives the client the privecy
  String choice1 = in.next();
  switch(choice1) {
  case "Y" : obj.pop();
  System.out.println("Your Data Deleted ,The Last Guest Was Number "+obj.top()) ;break;
  case "y" : obj.pop(); //delete the current user informations and display the previous client number
  System.out.println("Your Data Deleted ,The Last Guest Was Number "+obj.top()) ;break;
  case "N" :System.out.println("Your Data Is In The Database ");break; //assign the data into the bill method
  case "n" :System.out.println("Your Data Is In The Database  ");break;}
}
public void Bill(String t , int a , String l){ //billing method , it will concat all the entered information for each user and display it
    System.out.println("---YOUR BILL-----"); /*the name , age , and catigry are essintial information and it will be recived from the tracer method
    in the other hand , the recomended and borrowed books will be billing for each try ....*/
    System.out.println("");
    System.out.println("Your Informations \t");
    System.out.println("YOU ARE OUR CLIENT NUMBER \t"); 
    System.out.println(obj.top()) ;
    System.out.println("Name\t"+"Age \t"+ "Favorite Category");
    System.out.println("\t"+name+"\t"+age+"\t"+type);
    if (NumberOfBook != -1){
    System.out.println("You Borrowed\t");
    System.out.println( NumberOfBook);}

    System.out.println("Thank You For Using The Library Assistant Service!");}}
