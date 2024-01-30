package day4;

public class TC002_Exception {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//       try {
//    	   String str=null;
//           str.equals("Hello");
//              
//       }
//       catch(Exception e){
//    	   System.out.println("Exception is:" +e);
//       }
//		
//          System.out.println("Welcome");
//	}

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       try {
    	   String str=null;
           str.equals("Hello");
              
       }
       catch(Exception e){
    	   System.out.println("Exception is:" +e);
       }
       
       finally {
    	   System.out.println("hello");
       }
		Thread.sleep(3000);
          System.out.println("Welcome");
	}
}
