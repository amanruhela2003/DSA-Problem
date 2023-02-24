package College.DataStructures;

import java.util.Arrays;

public class SecondMax {

    static void secondMax(int[] arr)
    {
        int max=arr[0];
        // boolean flag=false;
        int secMax=arr[0];
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secMax=max;
                max=arr[i];
            }
        }
        System.out.println("First Maximum: "+ max);

        System.out.println("Second Maximum: "+ secMax);

    }

    public static void main(String[] args) {
        int arr[]={4,8,2,6};
        secondMax(arr);
        
    }
    
}
