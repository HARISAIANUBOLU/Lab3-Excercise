package org;

import java.util.Scanner;
import java.util.*;

public class MirrorImage {
	public String getImage(String str ) {
		StringBuffer sbr =new StringBuffer(str);
		sbr.append('|');
		StringBuffer sb =new StringBuffer(str);
		sb.reverse();
		sbr.append(sb);
		return sbr.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MirrorImage I =new MirrorImage();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String");
		String str  =sc.nextLine();
		
		System.out.println(I.getImage(str));
		sc.close();
		

	}

}