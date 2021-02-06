package Railwaysystem;

public class zohoround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i > 0; i--) 
		{ 
		    for (int j = 5; j > i; j--) 
		        System.out.print(j); 
		 
		    for (int j = i; j > 0; j--) 
		        System.out.print(i+" "); 
		 
		    System.out.println(); 
		} 
	}
}