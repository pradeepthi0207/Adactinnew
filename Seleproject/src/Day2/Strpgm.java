package Day2;

public class Strpgm {
	public static void main(String[] args) {
		String s="welcome java",rev=" ",revstr="";
		String [] s1=s.split(" ");
		for(int i=0;i<s1.length;i++){
			if(s1[i]==s1[3]) {
				for(int j=s1.length-1;j>=0;j--) {
					rev=rev+s1.charAt[j];
					
				}else {for(int k=0;k<s1.length;k++) {
					rev=rev+s1.charAt[k];
				}
				System.out.println(rev);
			}
			
		}
	}


