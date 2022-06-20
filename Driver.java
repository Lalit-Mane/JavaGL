import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;
import lalitGl.q1.service.Service;

class Driver {

	public static void main (String[]args)
	throws IOException{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the total number of floors in the building");
	int noOfFloors=sc.nextInt();
	int []floors = new int[noOfFloors];
	for (int i = 0;i<noOfFloors;i++)
	{System.out.println("enter the floor size  given on day:"+ (i+1));
	floors[i]= sc.nextInt();
	}
	System.out.println();
	Service service= new Service();
	service.printConstructionTable(floors,noOfFloors);
	}

}
