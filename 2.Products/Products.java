import java.util.Scanner;
class Product
{
int price,pcode;
String pname;
Product(int pcode,String pname,int price)
{
this.pcode=pcode;
this.price=price;
this.pname=pname;
}
}
class Products
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Product code");
  int pcode=sc.nextInt();
  System.out.println("Enter Price");
  int price=sc.nextInt();
  System.out.println("Enter Product name");
  String pname=sc.next();
  System.out.print("\n\n");
  System.out.println("<<<<<<<<<<PRODUCT DETAILS>>>>>>>>>>");
  System.out.println("Product Code      Price      Product Name");
  System.out.println(pcode+"               "+price+"            "+pname);
  System.out.println("1234              30          Santoor");
  System.out.println("1235              35          Dark Fanatasy");
  Product[]ps=new Product[3];
  ps[0]=new Product (pcode,pname,price);
  ps[1]=new Product (1234,"Santoor",30);
  ps[2]=new Product (1235,"Dark fantasy",35);
  int min=ps[0].price;
  for(Product P:ps)
  {
   if(P.price<min)
   {
    min=P.price;
   }
  }
  for(Product P:ps)
  {
   if(min==P.price)
   {
  
      System.out.print("\n\n");
    System.out.println("........Least Priced product is......");
    System.out.println("Product Name:"+P.pname);
    System.out.println("Product Code:"+P.pcode);
    System.out.println("Price:"+P.price);
   }
 }
}
}
