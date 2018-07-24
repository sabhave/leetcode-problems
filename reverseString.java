import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to be reversed");
        String str= input.nextLine();
        String res=revStr(str);
        System.out.println(res);
    }
    public static String revStr(String s){
        if(s == null || s.length() == 0)
            return "";
        char[] arr = s.toCharArray();

        int i=0;
        int j=arr.length-1;
        char temp;
        while(i<j){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }

}
