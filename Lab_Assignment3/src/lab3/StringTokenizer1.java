/*
 * 
 *  Desc : Program to reads integers and then displays each integer and the sum of all integers
 *  @Author : Divya Sree
 */

package lab3;
import java.util.*;
public class StringTokenizer1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n, sum=0;
		System.out.println("Enter Integers:");
		String str=s.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens())//Method to check availability
		{
			String temp = st.nextToken ();
			n=Integer.parseInt(temp);
			System.out.println(n);
			sum=sum+n;
		}
		System.out.println("Sum of Given Integers : "+sum);

	}

}
