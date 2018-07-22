import java.util.Scanner;

public class twoSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("Enter target");
        int target=input.nextInt();
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        calculatetwoSum(arr,target);

    }

    public static void calculatetwoSum(int[] nums,int tar){
        int ar[] = new int[2];
        for(int i=0;i<nums.length;i++) {
            int val = tar - nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]== val){
                    ar[0]=i;
                    ar[1]=j;
                    for(int k=0;k<ar.length;k++){
                        System.out.println(ar[k]);
                    }
                }
            }

            }


        System.out.println("No two sum solution");
    }

}
