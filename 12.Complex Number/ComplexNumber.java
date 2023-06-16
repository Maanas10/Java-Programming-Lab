import java.util.Scanner;
class ComplexNumber
{
private int real,imaginary;
ComplexNumber(){}
ComplexNumber(int real,int imaginary)
{
this.real=real;
this.imaginary=imaginary;}
ComplexNumber sum(ComplexNumber n1,ComplexNumber n2)
{
return new ComplexNumber(n1.real+n2.real,n1.imaginary+n2.imaginary);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
ComplexNumber n1=new ComplexNumber();
ComplexNumber n2=new ComplexNumber();
System.out.println("Enter First Number:");
System.out.print("Real:");
n1.real=sc.nextInt();
System.out.print("Imaginary:");
n1.imaginary=sc.nextInt();
System.out.println("Enter Second Number:");
System.out.print("Real:");
n2.real=sc.nextInt();
System.out.print("Imaginary:");
n2.imaginary=sc.nextInt();
ComplexNumber sum =n1.sum(n1,n2);
System.out.println("\nSum:"+sum.real+"+"+sum.imaginary+"i");
}
}
