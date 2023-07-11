public class array2
{
    public static int binarysearch(int number[],int key)
    {
        int start=0,end=number.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;

        
            if(number[mid]==key){
                 return mid;//found

                 }
             if(number[mid]<key){     //right
                start=mid+1;
                 }
                else{
                 end=mid-1;//left
                 }
        }
         return -1;
    }
    public static void main(String args[])
    {
        int number[]={0};
        int key=0;

        System.out.println("index for key:"+ binarysearch(number,key));

    }

}
