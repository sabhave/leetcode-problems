import java.util.Scanner;

public class firstUniqueCharinStr {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string ");
        String str= input.nextLine();
        int res=firuniq(str);
        System.out.println(res);
    }
    public static int firuniq(String s){
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;


    }
}
