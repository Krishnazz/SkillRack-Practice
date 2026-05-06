package average;

public class ConsecutiveIncrease {

    public static void main(String[] args) {
        //int[] arr={23,45,46,78,79,100};
        int[] arr={34,67,68,69,70,12};
        
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==1){
                count+=1;
            }
        }
        System.out.println("Number of consecutive increases: " + count);
    }
}
