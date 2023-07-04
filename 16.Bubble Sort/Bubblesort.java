import java.util.Scanner;

class Bubblesort
{
public static <T extends Comparable<T>> T[] BSMethod(T[] arr, int n) 
{        
for (int i = 0; i < n - 1; i++) 
{
for (int j = 0; j < n - i - 1; j++)
{
if (arr[j].compareTo(arr[j + 1]) > 0) 
{                  
T temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
return arr;
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Number of Elements: ");
int n = sc.nextInt();
String[] s = new String[n];
System.out.println("Enter " + n + " Elements: ");
for (int i = 0; i < n; i++)
{
s[i] = sc.next();
}
Bubblesort b = new Bubblesort();
s = b.BSMethod(s, n);
System.out.println("After Sorting the Elements are in the order of:");
for (int i = 0; i < n; i++) 
{
System.out.println(s[i]);
}
}
}
