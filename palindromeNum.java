import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number=input.nextInt();
        boolean res= palindNum(number);
        if(res==true)
        System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }
    public static boolean palindNum(int num){
        int result=0;
        int sum=0;
        if(num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }
        while(num>result) {
            sum = num % 10;
            result=result*10+ sum;
            num=num/10;

        }
           if(num==result || num==result/10)
           return true;
           else
               return false;
    }
}
