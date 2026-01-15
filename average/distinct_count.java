package average;
import java.util.*;
public class distinct_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	     int n1=s.nextInt(),n2=s.nextInt();
	     int[] a=new int[n1];
	     int[] b=new int[n2];
	     for(int i=0;i<n1;i++) {
	    	 a[i]=s.nextInt();
	     }
	     for(int i=0;i<n2;i++) {
	    	 b[i]=s.nextInt();
	     }
	     int count=0,count1=0;
	     for(int i=0;i<n1;i++) {
	    	 for(int j=0;j<n2;j++) {
	    		 count=0;
	    		 if(a[i]==b[j]) {
	    			 count=1;
	    			 break;
	    		 }
	    	 }
	    	 if(count==0)
	    		 count1+=1;
	     }
	     for(int i=0;i<n2;i++) {
	    	 for(int j=0;j<n1;j++) {
	    		 count=0;
	    		 if(b[i]==a[j]) {
	    			 count=1;
	    			 break;
	    			 }
	    	 }
	    	 if(count==0)
	    		 count1+=1;
	     }
	     System.out.print(count1);
	     


	}   //4 5
	//1 5 9 10
	//22 5 12 9 5


}
