import java.util.Scanner;
class sortTwoArray{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the no of element in array");
        int n=input.nextInt();
        int i,j;
       // array declaration
       int[] arr=new int[100];
       int[] arr2=new int[100];
        System.out.println("enter the element in array");
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("enter the number 0f element in 2nd array");
        int m=input.nextInt();
        System.out.println("enter the element 2nd  array");
        for(j=0;j<m;j++){
            arr2[j]=input.nextInt();
        }
        for(j=0;j<m;j++){
            arr[i++]=arr2[j];
        }
         
       System.out.println("Before sort the array is--");
        int len=n+m;
        for(i=0;i<len;i++){
             System.out.println(arr[i]);
        }
        for(i=0;i<len;i++){
            int min=arr[i];
            for(j=i+1;j<len;j++)
            {
                if(arr[i]<arr[j])
                {
                   int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
 System.out.println("After merge the sorted array is--");
         for(i=0;i<len;i++){
             System.out.println(arr[i]);
        }

    }
}