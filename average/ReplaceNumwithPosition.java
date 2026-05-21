package average;

public class ReplaceNumwithPosition {
    public static void main(String[] args) {
        //String str="999999993";
        String str="234567890";
        for(int i=0;i<str.length()-1;i++){
           System.out.println(str.replace(String.valueOf(str.charAt(i)),String.valueOf(str.charAt(Integer.parseInt(String.valueOf(str.charAt(i)))-1))));
          str=str.replace(String.valueOf(str.charAt(i)),String.valueOf(str.charAt(Integer.parseInt(String.valueOf(str.charAt(i)))-1)));
           // str.replace(str.charAt(Integer.parseInt(String.valueOf(str.charAt(i)))-1),str.charAt(i));
        }
       // System.out.println(str);
    }
    
}
