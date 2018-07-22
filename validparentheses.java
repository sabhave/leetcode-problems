import java.util.Scanner;
import java.util.Stack;

public class validparentheses {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter number");
        //String number= input.nextLine();
        String r="{{{";
        System.out.println(r);

         boolean res= checkValid(r);
        if(res==true)
            System.out.println("valid!!");
        else
            System.out.println("Not valid!!");
    }
    public static boolean checkValid(String str){
        Stack<Character> st =new Stack<Character>();
         char[] arr = str.toCharArray();
         for(int i=0;i<arr.length;i++){
             if(arr[i]== '('){
                 st.push(')');
             }
             else if(arr[i]== '{'){
                 st.push('}');
             }else if(arr[i]=='['){
                 st.push(']');
             }else if(st.isEmpty() || st.pop()!=arr[i] ){
                 return false;
             }
         }

        return st.isEmpty();


    }
}
