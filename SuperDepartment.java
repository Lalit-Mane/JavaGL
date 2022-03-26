class SuperDepartment {

      public void departmentName() {
		   System.out.println("Super Department");
		}
	
      public void getTodaysWork() {
    	   System.out.println("No work as from now");
        }
      public void getWorkDeadline() {
    	    System.out.println("Nil");
        }
      public void isTodayAHoiliday() {
    	    System.out.println("Today is not a holiday");
        }
}

  class AdminDepartment extends SuperDepartment{
	  public void departmentName() {
			System.out.println("Admin Department");
			}
	  public void getTodaysWork() {
	    	System.out.println("Complete your document submission");
	        }
	  public void getWorkDeadline() {
	    	System.out.println("Completed by EOD");
	        }  
   }
  class HrDepartment extends SuperDepartment{
	  public void departmentName() {
			System.out.println("Super Department");
			}
	  public void getTodaysWork() {
	    	System.out.println("Fill today's worksheet and mark your attendance");
	    }
	  public void getWorkDeadline() {
	    	System.out.println("Complete by EOD");
	    }
	  public void doActivity() {
	    	System.out.println("team lunch");
	    }
   }
  class TechDepartment extends SuperDepartment{
	  public void departmentName() {
		   System.out.println("Tech Department");
		}
	  public  void getTodaysWork() {
  	   System.out.println("Complete coding of module 1");
      }
	  public void getWorkDeadline() {
  	    System.out.println("Complete by EOD");
      }
	  public void getTechStackInformation() {
  	    System.out.println("core java");
      }
 
  }

  class Main{
public static void main (String args[]) {
	SuperDepartment superD = new SuperDepartment();
	AdminDepartment adminD = new AdminDepartment();
    HrDepartment HrD = new HrDepartment ();
    TechDepartment techD = new TechDepartment();
    System.out.println("Welcome to admin Department");
	adminD.getTodaysWork();
	adminD.getWorkDeadline();
	adminD.isTodayAHoiliday();
	System.out.println("\n");
	System.out.println("Welcome to HR Department");
    HrD.doActivity();
	HrD.getTodaysWork();
	HrD.getWorkDeadline();
	HrD.isTodayAHoiliday();
	System.out.println("\n");
	System.out.println("Welcome to Tech Department");
	techD.getTodaysWork();
	techD.getWorkDeadline();
	techD.getTechStackInformation();
	superD.isTodayAHoiliday();
     }
 }
