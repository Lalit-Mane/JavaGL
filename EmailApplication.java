
import java.util.Scanner;
import java.util.Random;
public class EmailApplication {
	public static void main (String[]args) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String specialchars = "!@#$%^&*()_";
		String combination = upper+lower+specialchars+num;
		int length = 8;
		char [] password = new char[length];
		Random r = new Random();
		for(int i=0;i<length;i++) {
			password[i]=combination.charAt(r.nextInt(combination.length()));
		}
		Scanner scan = new Scanner(System.in);
		 System.out.println("Please enter your first name(Lower case) :");
		 String Fname = scan.next();
		 System.out.println("Please enter your last name(Lower case :");
		 String Lname = scan.next();
	System.out.println("Please enter your department of the following(1,2..4): \n1.Technical"
			+ " \n2.Admin "
			+ "\n3.Human Resource \n4.Legal");
	 
	    int department = scan.nextInt();
	    
	 if(department == 1) {
	 System.out.println("Your email Adress --->" +Fname+ Lname + "@tech.abc.com");
	 System.out.println("Your password ---> " + new String(password));
	 }
	 
	 if(department == 2) {
	 System.out.println("Your email adress --->" + Fname+ Lname+ "@admin.abc.com");
	 System.out.println("Your password ---> " + new String(password));
	 }
	 if(department == 3) {
		 System.out.println("Your email Adress --->" + Fname+ Lname + "@hr.abc.com");
		 System.out.println("Your password ---> " + new String(password));
		 }
	 if(department == 4) {
		 System.out.println("Your email Adress --->" + Fname+ Lname+ "@legal.abc.com");
		 System.out.println("Your password ---> " + new String(password));
		 }
	 
	 
	}
	 
	 
	 
	}

    
      
	
  

