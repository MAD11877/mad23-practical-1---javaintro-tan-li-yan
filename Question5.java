import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    
     List <Integer> num_list = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    //System.out.println("Please enter the number of times you would like to enter a number:");
    int times = in.nextInt();
    for(int i = 1; i<= times; i++)
    {
      //System.out.println("Please enter a number:");
      int num_entered = in.nextInt();
      num_list.add(num_entered);
    }
    int count = 0;
    int maxCount = 0;
    int mode = 0;
    for(int j = 0; j<num_list.size(); j++)
    {
      int each_num = num_list.get(j);
      for(int a = 0; a < num_list.size(); a ++)
      {
        if(each_num == num_list.get(a))
        {
          count ++;
        }
      }
      if (count > maxCount)
        maxCount = count;
        mode = each_num;
        
    }
    System.out.println(mode);
  }
}
