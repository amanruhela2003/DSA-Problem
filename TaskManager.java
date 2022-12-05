package College.Recursion.MultipleRecursion;


import static java.lang.System.out;
import java.util.Scanner;

public class TaskManager{
   
 public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    out.println("enter the choice :");

    
   
int ch = sc.nextInt();
sc.close();
    TaskCrud obj = new TaskCrud();
    switch(ch) {
           case 1:
              obj.searchTask();
               break;
        
           case 2 :
               obj.newTask();
                break;
        
           case 3 : 
                obj.deleteTask();
                break; 
               
           case 4 : 
                obj.readTask();
                 break;

          default :
                out.println("Invalid choice");
                
        

        }
    }
}
 class TaskCrud{

    void searchTask(){
       out.println("Search the Task");
    } 
    void newTask(){
        out.println("Enter the new Task");
        Task sz = new Task();
        sz.taskName();
        sz.taskDec();
    }
    void deleteTask(){
        out.println("Delete the Task");

    }
    void readTask(){
        out.println("Read the Task");
    }

 }
 class Task{
    void taskName(){
        out.println("Enter the Task Name");
    }
    void taskDec(){
        out.println("Enter the Task Dec");
    }
 }