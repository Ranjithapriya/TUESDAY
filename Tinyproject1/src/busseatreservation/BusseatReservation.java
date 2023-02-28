package busseatreservation;
import java.util.Scanner;//using scanner package
public class BusseatReservation {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("\t  \t    Busseat Reservation");
    System.out.println(" \t \t _________________________________");
	System.out.println();//this is for line spacing
	char matrix [] []=new char[11][10];
	//while using loop for column 
	for(int column=1;column<=4;column++)
	{
		System.out.print( "       col " +(column)+"\t");
	}
	System.out.println();
	//loop for row
	for(int rownum=1;rownum<=10;rownum++) 
	{
		System.out.print("row"+(rownum)+" | \t \t");
	//loop for printing *
    for(int col=1;col<=4;col++)
    {
     matrix[rownum][col]='*';
	 System.out.print(matrix[rownum][col] + "\t \t"); 
    }
   System.out.println();
	}
	while(true) //using while for booking seats
	{
		System.out.println("Enter row and column separated by space:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("row: "+x);
		System.out.println("col: "+y);
		
		if(x>0&&y>0) 
		{
			System.out.println("\n \t\t  Busseat Reservation");
			System.out.println();
         }
		for(int column=1 ;column<=4; column++)
		{
		System.out.print("col" +column+"\t");
	    }
		System.out.println("---------------------------");

		for(int rownum=1;rownum<=10;rownum++)
	 	{ 
       System.out.print("row"+(rownum)+ "  \t \t");
       // sing loop for print seat(X)
         for(int col=1;col<=4;col++)
	 	 {
	        matrix [x][y]='X';
			System.out.print(matrix[rownum][col]+"\t \t");
	 	 }
			System.out.println("");
	 	 }
       
	
	{
	   System.out.println("you have successfully reserved your seat");

	  System.out.println("Do you want to reserve another seat?(y/n):");

	char yn=sc.next().charAt(0);// using char variable
	if(yn=='Y') // using if for booking another seat
	{ 
	System.out.println("more seats are available");
	continue;// using continue for another seat booking
	}
	else 
	{
		System.out.println("enjoy the journey");
		break;//using break stop the program
	}
	
}
	 	}
}
}

