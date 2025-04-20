package task1;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(((n-j)+1)+" ");
			}
			for(int k=i+1;k<=n;k++) {
				System.out.print(((n-i)+1)+" ");
			}
			System.out.println();
		}
		
	}

}
