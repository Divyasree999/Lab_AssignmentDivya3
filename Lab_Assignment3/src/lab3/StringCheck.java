/*
 * 
 *  Desc : Program to find a string is negative or positive
 *  @Author : Divya Sree
 */
package lab3;
import java.util.Scanner;
public class StringCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
	    String str = checkpositive(s);
	}
    public static String checkpositive(String str)
    {
    	for(int i=0;i<str.length()-1;i++)
    	{
    		if(str.charAt(i+1) < str.charAt(i))
    		{
    			System.out.println("Negative String");
    		}
    		else {
    			System.out.println("Positive String");
    		}
    	}
		return str;
    }
}
