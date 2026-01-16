package average;
import java.io.*;
import java.util.*;

	/* Teaher_allowance.java to determine class cancellation based on student arrival times */	
	
public class Teaher_allowance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int n=s.nextInt();
		s.nextLine();
		String st=s.nextLine();
		String[] a=new String[t];
		for(int i=0;i<t;i++)
			a[i]=s.nextLine();
		String[] st1=st.split(":");
		int startHr=Integer.parseInt(st1[0]);
		int startmin=Integer.parseInt(st1[1]);
		int count=0;
		for(int i=0;i<t;i++) {
			String[] b=a[i].split(":");
			int h=Integer.parseInt(b[0]);
			int m=Integer.parseInt(b[1]);
			if((h>startHr)||(h==startHr)&&(m>startmin))
				count+=1;
		}
		if(count>n)
			System.out.print("Yes");
		else
			System.out.print("No");
		
		
		
		
	}

}




/*In a college, a professor is strict and mandates that at least M students out of the total N students must arrive on time to his class. Else he would cancel the class. The start time of the class is also passed as the input. The individual arrival time for N students is also passed as input in 24 hour format.

The program must print if the class was cancelled or not.

Input Format:

The first line will contain N and M separated by a space.

The second line will contain the start time of the class.

The third line will contain the arrival time of the N students separated by one or more space(s).

Output Format:

First line will contain either Yes or No (Yes for cancellation of the class and No if the class is not cancelled).

Boundary Conditions: 3 <= N <= 50

2 <= M <= N

Example Input/Output 1:

Input

53

9:30

9:30 9:38 9:31 9:32 9:31

Output: Yes

Explanation:

4 out of the 5 students arrived late, which means only one arrived on time. As the professor has mandated 3 out of the 5 must arrive on time, the class was cancelled and hence Yes is printed as the output*/