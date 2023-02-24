package College.DataStructures;

public class IsArraySorted {

    static boolean isArraySorted(int arr[],int n)
    {
        boolean sort=true;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                sort=false;
                break;
            }
        }
        return sort;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        int n=arr.length;
        System.out.println(isArraySorted(arr,n));
    }
    
}
