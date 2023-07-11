public class array1 {
    public static int getlargest(int numbers[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("small number is :"+smallest);
        return largest;
    }
       
    public static void main(String args[]){
        int numbers[]={2,3,6,5,8,10,22,30};
        System.out.println("largest number is:"+getlargest(numbers));
    }
}
