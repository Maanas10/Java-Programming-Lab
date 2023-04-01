import java.util.Scanner;
import java.util.Arrays;
 
 class Array{
   public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number of strings:");
     int size=sc.nextInt();
     String[] strings = new String[size];
     System.out.println("Enter the string:");
      for(int i=0;i<size;i++){
        strings[i]=sc.next();
       }
System.out.println("Choose \t 1.Built-in Function \t 2.User Defined Function");
System.out.print("\n Choice:");
int choice=sc.nextInt();
  switch(choice){
       
        case 1: System.out.println("Built-in Function");
                System.out.println("-------------------");
                Arrays.sort(strings);
                 break;
 
        case 2: System.out.println("User Defined Function");
                System.out.println("-------------------");
                String temp;
                for(int i=0;i<size;i++)
                  {
              for(int j=i+1;j<size;j++)
                  {
        if(strings[i].compareTo(strings[j])>0)
            {
               temp=strings[i];
             strings[i]=strings[j];
             strings[j]=temp;
          }
         }
         }
break;
default:
System.out.println("invalid option");
break;
}
 for(int i=0;i<size;i++){
  System.out.println(strings[i]);
}
}
}
