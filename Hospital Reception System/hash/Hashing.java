 

import java.util.*;

public class Hashing {
	private int[] hashTable = new int[5];
	
	public int hash(int ele){
		return ele % this.hashTable.length;
	}
	public boolean insert(int ele){
		int pos = hash(ele);
		System.out.println("Hashing key " + pos);
		if(this.hashTable[pos] == 0)
			this.hashTable[pos] = ele;
		else{
			for(int i = pos + 1; i < this.hashTable.length; i++){
				if(this.hashTable[i] == 0){
					this.hashTable[i] = ele;
					return true;
				}	
			}
		}
		return true;
	}
	public int search(int ele){
		int loc = -1;
		int pos = hash(ele);
		if(hashTable[pos] == ele)
			loc = pos;
		else{
			for(int i = pos + 1; i < this.hashTable.length; i++){
				if(this.hashTable[i] == ele)
					loc = i;
			}
		}
		return loc;
}
public int delete(int ele){
		int loc = -1;
		int pos = hash(ele);
		if(hashTable[pos] == ele)
			hashTable[pos] = 0;
		else{
			for(int i = pos + 1; i < this.hashTable.length; i++){
				if(this.hashTable[i] == ele)
					loc = i;
			}
		}
		return loc;

}
    public static void main(String[] args) {
        
		Hashing he = new Hashing();
		Scanner in = new Scanner(System.in);
		System.out.println("please enter 5 diffrent values to insert");
		for(int i = 0 ; i < 5 ; i++){
		int choice = in.nextInt();
		System.out.println(he.insert(choice));}
		System.out.println("Element in hash table");
		
		for(int i = 0; i < he.hashTable.length; i++)
		
		System.out.printf("Hashtable[%d] ---> %d\n", i, he.hashTable[i]);
		System.out.println("please enter a value to search for");
		int search = in.nextInt();
		
		int loc = he.search(search);
		if(loc == -1)
			System.out.println("Element"+search+" is not found");
		else
			System.out.println("Element"+search+" is found at index position " + loc);
		
		System.out.println("please enter a value to delete");
		int delete = in.nextInt();
		 Object removedValue = he.delete(delete);

		for(int i = 0; i < he.hashTable.length; i++){
		System.out.println("After deleting");
		System.out.printf("Hashtable[%d] ---> %d\n", i, he.hashTable[i]);
	}
	
System.out.println("please enter values to insert");
		int choice = in.nextInt();
		System.out.println(he.insert(choice));
		System.out.println("Element in hash table");
		
		for(int i = 0; i < he.hashTable.length; i++)
		
		System.out.printf("Hashtable[%d] ---> %d\n", i, he.hashTable[i]);
}}