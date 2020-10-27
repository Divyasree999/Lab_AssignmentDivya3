/*
 * 
 * Desc : Program to create the mirror image of a String and display the string and its mirror image
 * @Author : Divya Sree
 */
package lab3;
import java.util.Scanner;
public class StringMirrorImage {
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i=s.length();
		//System.out.println(k);
		for(int j=0;j<i;j++)
		{
			System.out.print(s.charAt(j));
		}
		System.out.print("||");
      
		for(int j=(i-1);j>=0;j--)
		{
			System.out.print(s.charAt(j));
		}
	}

}
