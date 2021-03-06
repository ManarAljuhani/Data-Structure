//DoublylinkedList class 
public class DoublylinkedList {

	public Doublylink first;
	public Doublylink last;
	boolean staute ;
     
	public   DoublylinkedList()      //constructor refer to the first and last node
	{
		first= null;
		last=null;
	}
	
	public boolean isEmpty()           // to check if the list is embty
	{
		return(first==null);
	}
public void upper()  //a header of the table
	{
 System.out.print("   No.    |   Name         |     Age       |   National ID          | Phone Number ");
	   }
	   

public void insertFirst(int No , String Name , int Age , int NID , String phone) 
{  //method to insert at the begining 
Doublylink newLink = new Doublylink(No , Name , Age ,NID , phone); 
if( isEmpty() )
last = newLink; 
else
first.previous = newLink; 
newLink.next = first; 
first = newLink; 
}
	
public void insertLast( int No , String Name , int Age , int NID , String phone) 
{  //method to insert in the end
Doublylink newLink = new Doublylink(No ,Name, Age , NID , phone);
if( isEmpty() ) 
first = newLink; 
else
{
last.next = newLink; 
newLink.previous = last; 
}
last = newLink; 
}
	
 	
public Doublylink deleteFirst()
{ //method to delete at the beginig
Doublylink temp = first;
if(first.next == null)
last = null; 
else
first.next.previous = null; 
first = first.next; 
return temp;
}



public Doublylink deleteLast() 
{ //method to delete in the end
Doublylink temp = last;
if(first.next == null) 
first = null; 
else
last.previous.next = null; 
last = last.previous; 
return temp;
}

public void search(int key ){  //method to search
        int i = 1;  
        boolean target = false;   
        Doublylink current = first;  
        if(first == null) {  
            System.out.println("there is no content");  
            return;  
        }  
        while(current != null) {  
            
            if(current.NData == key) {  
               target = true;  
                break;  
            }  
            current = current.next;  
            i++;  
        }  
        if(target)  
             System.out.println("The Folder is exist, it's number: " + i);  
        else  
             System.out.println("The Folder dosn't exist, please creat new folder");  
    }  
public Doublylink deleteAtPosition(int key) { //method to delete in specific position
Doublylink current = first; 
Doublylink previous = last;
while(current.NData != key)  {
if(current.next == null)
   return null; 
else
{
previous = current; 
current = current.next;
}
} 
if(current == first)
first = first.next; 
  else 
previous.next = current.next; 
return current;
}

public void displayForward()//method to display forward
{
   

Doublylink current = first; 
while(current != null) 
{
current.displayLink(); 
current = current.next; 

}
System.out.println("");
}
	
public void displayBackward()//method to display backward
{
System.out.print("");
Doublylink current = last;
while(current != null) 
{
current.displayLink(); 
current = current.previous; 
}
System.out.println("");
}
 
}

//end of DoublylinkedList class 