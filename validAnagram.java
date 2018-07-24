import java.util.Scanner;

public class validAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter strings");
        String str1= input.nextLine();
        String str2= input.nextLine();
        boolean res=validAnagram(str1,str2);
        System.out.println(res);
    }
    public static boolean validAnagram(String s,String t){
        if(s.length() != t.length()|| s==null || t==null){
            return false;
        }
        int[] freq =new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0)
                return false;

        }
        return true;

    }
}

