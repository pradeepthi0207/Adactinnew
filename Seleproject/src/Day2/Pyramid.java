package Day2;

public class Pyramid {
	public static void main(String[] args) {
		
	
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.println(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		for(int j=i-1;j>=1;j--) {
			System.out.print(j);
		}
	System.out.println();}
	}	
}
