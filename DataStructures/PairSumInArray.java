package College.DataStructures;

import java.util.Arrays;

public class PairSumInArray {

    static void pairSum(int arr[],int size,int target)
    {
        int i=0;
        int j=arr.length-1;
        Arrays.sort(arr);//1,2,3,4,7,9
        while(i<j && arr[i]+arr[j]!=target)
        {
            if(arr[i]+arr[j]<target)
            {
                i++;
                continue;
            }
            else
            {
                j--;
                continue;
            }
        }
        System.out.println("Pairs values are :"+ arr[i]+","+arr[j]);
    }


    public static void main(String[] args) {
        int[] arr={2,1,4,6,7,5};
        int k=10;
        int n=arr.length;
        pairSum(arr,n,k);

    }
    
}
