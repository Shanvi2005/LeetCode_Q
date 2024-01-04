import java.util.Scanner;
class Solution {
    public static int[] buildArray(int[] nums) 
    { 
      int[]ans=new int[nums.length];
      for (int i=0;i<nums.length;i++)
      {
          ans[i]=nums[nums[i]];
      } 
      return ans; 
    }
    public static void main(String[]args)
    {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int nums[]= new int [n];
       for (int j =0;j<n;j++)
       {
           nums[j] = scn.nextInt();
       }
       int [] ans= buildArray(nums);
       for (int k =0;k<n;k++)
       {
           System.out.println(ans[k]);
       }
    }
}
