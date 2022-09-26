package exceptions;

public class TryCatch {

	public static void main(String[] args) {
      int a=200,b=0;
      try {
      int c=a/b;//main method create  exception object(exception name,description,stack trace)
      }
      catch(Exception e){
//    	  e.printStackTrace();//print exception name,description,stack trace(line number in which exception is occured)
    	  System.out.println(e.toString());//print exception name,description
//    	  System.out.println(e);
      }
      System.out.println("Hello Rishu");

	}

}
