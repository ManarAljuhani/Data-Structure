// Doublylinke class 
public class Doublylink {	
	
	
	public String sData;
	public int AData;
	public int IData;
	public int NData;
	public String PData;
	public Doublylink next;
	public Doublylink previous;
       
	// each parameter into the constructor refer to a link  
	public Doublylink( int No , String Name , int Age , int NID ,String phone)
	{
	        IData = No ; 
		sData=Name;
		AData=Age;
		NData=NID;
	        PData = phone;
	}
// method to print the link contents
	public void displayLink()
	{	
	
	System.out.print(" \n "+IData + " \t  |   "+sData +  " \t   |  "+AData + "  \t   |  "+NData+" \t    |  "+PData);
	
	}
	// end of Doublylinke class 
}

	      
	
