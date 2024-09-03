//calculate the Simple interest

package project1;

import java.util.Scanner;

public class calculateSimplei {
	public static void simple() {
		int p,r,t,si;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the principle ");
		p=s.nextInt();
		System.out.println("Enter the rate");
		r=s.nextInt();
		System.out.println("Enter the time");
		t=s.nextInt();
		si=p*r*t/100;
		System.out.println("simple interest="+si);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simple();
		
		
		
		

	}

}
