import java.util.Scanner;
public class Matrix
 {
   public static void main(String args[])
    {
     Scanner r=new Scanner(System.in);
     System.out.println("Enter the number of rows");
     
     int h=r.nextInt();
     System.out.println("Enter the number of columns");
     int c=r.nextInt();
     int[][] arr1=new int[h][c];
     int[][] arr2=new int[h][c];
     int[][] sumar=new int[h][c];
     System.out.println("Enter the elements in 1st Matrix"); 

       for(int i=0;i<h;i++)
        {
         for(int k=0;k<c;k++)
          {
           arr1[i][k]=r.nextInt();
          }
         }  
     System.out.println("Enter the elements in 2nd Matrix"); 

       for(int i=0;i<h;i++)
        {
         for(int k=0;k<c;k++)
          {
           arr2[i][k]=r.nextInt();
          }
         }
     System.out.println("Sum"); 
       for(int i=0;i<h;i++)
        {
         for(int k=0;k<c;k++)
          {
	   sumar[i][k]=arr1[i][k]+arr2[i][k];
           }
         }
     System.out.println("Sum of matrix:\n");
       for(int i=0;i<h;i++)
        {
         for(int k=0;k<c;k++)
          {
           System.out.print(sumar[i][k]+" ");
           }
           System.out.print("\n");
          }
}
} 





                  
