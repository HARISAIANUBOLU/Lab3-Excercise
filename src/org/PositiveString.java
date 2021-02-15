package org;
import java.util.Scanner;

public class PositiveString {
	public static void main(String[]args)
	{
		int temp=0;
		Scanner scan=new Scanner(System.in);
		String Str=scan.nextLine();
		for(int i=0;i<Str.length()-1;i++) {
			if (Str.charAt(i)<=Str.charAt(i+1)){
				temp=1;
				break;
			}
			else if (Str.charAt(i)>=Str.charAt(i+1)) {
				temp=0;
			    break;
			}	
		}
		if(temp==1) {
			System.out.println("Given String is Positive String");
			
		}
		else if (temp==0)
		    System.out.println("Given String is Negative String");
		scan.close();
	}

}
