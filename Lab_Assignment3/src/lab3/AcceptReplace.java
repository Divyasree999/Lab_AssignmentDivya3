/*
 * 
 *  Desc : Program to Accept the String and Replace it
 *  @Author : Divya Sree
 */
package lab3;
import java.util.*;
public class AcceptReplace {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String s = alterString(st);
    }
    public static String alterString(String s)
    {
    	int len = s.length();
        for(int i=0;i<len;i++)
        {
	         char k=s.charAt(i);
	         if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u') 
	         {
	        	 System.out.print(k);
		     }
			else 
			{
				char ch=  s.charAt(i);
				ch++;
				System.out.print(ch);
			}
		}
        return s;
    }
}

