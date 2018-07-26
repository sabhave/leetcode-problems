import java.util.Scanner;

public class longestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] str= {"flower","flow","flight"};
        String res = longestCmnPrefix(str);
        System.out.println(res);
    }
        public static String longestCmnPrefix(String[] strs) {
            if (strs.length == 0) return "";
            String prefix = strs[0];
            for (int i = 1; i < strs.length; i++)
                while (strs[i].indexOf(prefix) != 0) {
                    System.out.println(prefix);
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) return "";
                }
            return prefix;
        }
    }

