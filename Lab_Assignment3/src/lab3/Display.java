/*
 * 
 *  Desc : Program to Display the number of characters, lines and words in a text
 *  @Author : Divya Sree
 */
package lab3;
import java.util.Scanner;
public class Display {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int str = Calculate(s);
	}
	public static int Calculate(String str) {
		int words = 0, line = 0,character = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				words++;
		    }
		    if(str.charAt(i)=='\n')
		    {
			    line++;
		    }
            character++;
        }
		System.out.println("characters ="+ character+" words "+words+" Lines "+line);
		return line;
	}
}
