import java.util.Scanner;

public class reverseInt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number=input.nextInt();
        int res=revInt(number);
        System.out.println(res);
    }
    public static int revInt(int num){
        int result=0;
        int sum=0;
        while(num!=0) {
            sum = num % 10;
            result=result*10+ sum;
            num=num/10;

        }

        return result;
        }

}
