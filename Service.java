package lalitGl.q1.service;
import java.util.PriorityQueue;

public class Service {

   public void printConstructionTable(int floor[],int noOfFloors) {
	System.out.println("The order of contruction ia as follows");
	PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
	int[]tempArray = new int [noOfFloors];
	int max = noOfFloors;
	System.out.println();
	for(int i=0 ;i<noOfFloors;i++) {
		System.out.println("Day:"+ (i+1));
		tempArray[i]=floor[i];
		queue.add(tempArray[i]);
		while (!queue.isEmpty() && queue.peek()==max) {
			System.out.print(queue.poll()+ "");
			max--;
		}
		System.out.println();
	}
	}

}
