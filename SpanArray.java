package College.DataStructures;

public class SpanArray {

    static void findSpan(int arr[],int n)
    {
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Span: "+max+"-"+min+" = "+(max-min));
    }

    public static void main(String[] args) {
        int[] arr={10,32,45,54,67};
        int n=arr.length;
        findSpan(arr,n);

    }
    
}
