package average;

public class substringStartEnd {
    public static void main(String[] args) {
    //    String str="Important";
    //    int start=2;
    //    int end=4;
        String str="think";
        int start=3;
        int end=1;
       if(start<=end){
        System.out.println(str.substring(start,end+1));
       }
       else{
        String str1=str.substring(start);
        String str2=str.substring(0,end+1);
        System.out.println(str1+str2);
       }
    

    }
}
