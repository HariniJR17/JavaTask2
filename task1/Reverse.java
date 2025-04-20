package task1;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=876, rev=0 , digit;
          while(n!=0) {
        	  digit=n%10;
        	  rev=rev*10+digit;
        	  n=n/10;
          }
          System.out.println(rev);
	}

}
