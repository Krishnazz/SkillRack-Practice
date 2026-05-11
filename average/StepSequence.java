
package average;
public class StepSequence {
    public static void main(String[] args) {
        //int [] arr={5,6,7,9,8,7};
         int [] arr={2,3,4,3,2};
        int count=0;
        for(int i=1;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i-1])==1 && Math.abs(arr[i+1]-arr[i])==1){
                count+=1;
            }
        

        }
        if(count==arr.length-2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    
}
