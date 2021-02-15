package org;
import java.util.*;

public class Sumofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
        int Totalsum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            num = Integer.parseInt(temp);
            System.out.println(num);
            Totalsum = Totalsum + num;
        }
        System.out.println("sum of the integers is: " + Totalsum);
        sc.close();
	}

}
