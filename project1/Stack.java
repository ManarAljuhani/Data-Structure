public class Stack {
	
	
	private int[] DataBase = new int[100]; //create array for the stack with the size 100 as a maximmum for each duration 
	private int top = -1; //size is equal -1 , which mean it has a virtual value till we initialize later in the methods
	
	

	
	public int top() {
		if(top == -1) //to find out the last entred value 
			System.out.println("Stack is empty"); //if the stack is empty it will return this message
		return DataBase[top]; //if not will display the top value
	}

	
	public int push(int value)  {//to push an aliment to the stack 
		if (top == 99) //if it equal the last index it will not push 
			System.out.println("Array Is Full"); 
		top = top + 1;
		return DataBase[top] = value ;}

	public int pop() {//to push an aliment out of the stack 
		if(top == -1)//if it equal the first index it will not pop beacuse the stack is empty
			System.out.println("Stack is empty");
		int item = DataBase[top]; //if not it will put the top value in a trmprory place in the memory
		 //then decrement for one index
		 top -- ;
		return(item);
	}

	public String toString(){ //toprint the stack content
		String item = "";
		for(int i = top; i >= 0; i--){
			item = item + DataBase[i] + " ";
		}
		return item;
		
	}
}
