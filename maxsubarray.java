import java.util.*;
public class maxsubarray 
{
     public static void summaxsubarray(int numbers[])
    {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            int start=0;
            for(int j=i;j<numbers.length;j++)
            {
                int end=0;
                for(int k=start;k<=end;k++)
                 {
                    curSum+=numbers[k];
                   }
                 System.out.println(curSum);
                    if(maxSum<curSum)
                    {
                        maxSum=curSum;

                    }

           }
        }
         System.out.println("sumofmaxarray :"+maxSum);
    }
    /*public static void kadanes(int numbers[])
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs < 0){
                cs=0;

            }
            ms=Math.max(cs,ms)
        }
        System.out.println("our sum of submax array:" +ms);
    }*/
    public static void main(String []args)
    {
        int numbers[]={1,-2,3,4,-5,8};
        summaxsubarray(numbers);
    }
    
}
