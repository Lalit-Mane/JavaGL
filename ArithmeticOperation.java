import java.util.Scanner; 
public class ArithmeticOperation {	
   	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the first num:"); 
	int a = scan.nextInt();
    System.out.println("enter the second num:");
    int b = scan.nextInt();
    System.out.println("Press \'0\' for addition");
    System.out.println("Press \'1\' for subttraction");
    System.out.println("Press \'2\' for multiplication");
    System.out.println("Press \'3\' for division");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x == 0){
    System.out.println("Addition is:");
    System.out.println(a+b);
    }
    else if(x == 1){
    System.out.println("subtration is:");
    System.out.println(a-b);
    }
    
   
    
    else if(x == 3) {
    	System.out.println("Division is:");
    	System.out.println(a/b);
    }
    else {
    	System.out.println("Please select respective digit for desired operation");
    }
   	}
   	
 }

