/*
 * 
 *  Desc : Program to find difference between two consecutive numbers
 *  @Author : Divya Sree
 */
package lab3;
import java.util.Scanner;
public class Difference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = modifyNumber(num);
	}
	public static int modifyNumber(int n) {
		int sum=0;
		int h = n%10;
		while(n!=0)
		{
			int a=n%10;
			sum=sum*10+a;
			n=n/10;
		}
		System.out.println(sum);
		while(sum!=0)
		{
			int x=sum%10;
			sum=sum/10;
			int y=sum%10;
			
			int result=x-y;
			System.out.print(result);
		}
        return n;
   }

}
