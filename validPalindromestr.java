import java.util.Scanner;

public class validPalindromestr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String str= input.nextLine();
        boolean res=validPalin(str);
        System.out.println(res);
    }
    public static boolean validPalin(String s){
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        char[] arr = actual.toCharArray();
        int i=0;
        int j=arr.length-1;

        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
