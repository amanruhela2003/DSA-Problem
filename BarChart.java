package College.DataStructures;

public class BarChart {

    static int returnMax(int[] arr,int n)
    {
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Max Element : "+ max);
        return max;

    }

    

    static void printBarChart(int[] arr,int row,int col)
    {
        for(int i=row;i>0;i--)
        {
            for(int j=0;j<col;j++)
            {
                if(i<=arr[j])
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
     int arr[]={2,1,5,8,9};
     int n=arr.length;
     int max=returnMax(arr, n);
        // System.out.println(returnMax(arr, arr.length));
    //System.out.println(printBarChart(arr,returnMax(arr,arr.length),arr.length);); 
    // printBarChart(arr,returnMax(arr,arr.length),arr.length);
    printBarChart(arr, max, n);
    }
    
}
