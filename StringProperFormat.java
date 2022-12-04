package College;

public class StringProperFormat {
    public static void main(String[] args)
     {
        String str="        AMAn RuhELA";
        System.out.println("Given String:  "+ str);
         String str1=str.trim();
        System.out.println("first we trim it: "+str1);
        String str2=str1.toLowerCase();
        System.out.println("then we lower each character: "+str2);
        boolean flag=false;
        flag=str2.contains(" ");
        System.out.println("Is contain space??: "+str2.contains(" "));
        if(flag==true)
        {
        int i=str2.indexOf(" ");
        System.out.println("index of space: "+i);
        //str2.substring(0, 1).toUpperCase() + str2.substring(1)
        System.out.println("Corrected String: "+ str2.substring(0, 1).toUpperCase() 
        + str2.substring(1,i+1) + str2.substring(i+1,i+2).toUpperCase() + str2.substring(i+2)); 
        }
        else
        {
            System.out.println("Corrected String: "+ str2.substring(0, 1).toUpperCase() 
            + str2.substring(1));
        }
    }
    
}
