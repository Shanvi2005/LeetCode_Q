import java.util.Scanner;
class Solution {
    public static int finalValueAfterOperations(String[] operations) 
    {
        int x = 0;
        for (int i=0; i<operations.length;i++)
        {
            if(operations[i].equals("--X") || operations[i].equals("X--"))
            {
                x=x-1;
            }
            if(operations[i].equals("++X") || operations[i].equals("X++"))
            {
                x=x+1;
            }
        }
        return x;
    }
    public static void main(String[]args)
    {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      String [] operations = new String[n];
      for (int j=0;j<n;j++)
      {
          operations[j] = scn.next();
      }
      int a = finalValueAfterOperations(operations);
      System.out.println(a); 
    }
}
