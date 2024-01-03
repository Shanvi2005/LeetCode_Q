import java.util.Scanner;
class Solution {
    public static int numIdenticalPairs(int[] nums) 
    {
        int counter =0;
        for (int i =0;i<nums.length;i++)
        {
            for (int j =i+1;j<nums.length;j++)
            {
                if (nums[i]==nums[j])
                {
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void main(String[]args)
    {  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();  
      int [] nums = new int [n];
      for (int k =0;k<n;k++)
      {
          nums[k] = scn.nextInt();
      }
      int count=numIdenticalPairs(nums);
      System.out.println(count);
    }
}
