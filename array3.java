import java.util.*;    
public class array3 {   
    public static void reverse(int number[]){
        int start=0,last=number.length-1;
        while(start<last){
            int temp=number[last];
            number[last]=number[start];
            number[start]=temp;

        
        start++;
        last--;
        }
    }
    public static void main(String []args){
        int number[]={1,2,3,4,5,6,7,8,9,10};
        reverse(number);
        for(int i=0;i<number.length;i++){
          System.out.print(number[i]+ "") ;

        }
        System.out.println();
    }
}
