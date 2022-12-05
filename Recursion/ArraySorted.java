package College.Recursion.Recursion;

public class ArraySorted {
    

    static boolean Sorted(int[] arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;        
        }

        return arr[index]<arr[index+1] && Sorted(arr,index+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,1};
        System.out.println(Sorted(arr, 0));
    }




}
