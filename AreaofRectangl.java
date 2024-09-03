//calculate the Area of Rectangle
package project1;
import java.util.Scanner;
public class AreaofRectangl 
{
	public static void calculate() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of the Rectangle");
		int breadth=sc.nextInt();
		int area=length*breadth;
		System.out.println("Area of Rectangle is"+area);
	}
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub 
			calculate();

	}

}
