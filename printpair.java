import java.util.*;

public class printpair {
  public static void printPair(int number[])
   {
     int tp=0;
     for(int i=0;i<number.length;i++){
        int curnt=number[i];
        for(int j=i+1;j<number.length;j++){
           System.out.println("("+curnt+ "," +number[j]+ ")");
           tp++ ;
        }
        System.out.println("");
     }
      System.out.println("total pair :" +tp);
    }
  public static void main(String []args){
    int number[]={2,4,6,8,10 ,11,2};

    printPair(number);

   }   
}