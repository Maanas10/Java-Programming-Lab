class Cpu{
   int price=49999;
   class processor{
     int noOfcores=4;
     String manufacturer="INTEL";
       void display(){
	System.out.println("No of cores:"+noOfcores);
              System.out.println("Manufacturer:"+manufacturer);
          }
    }
    void display(){
        processor p=new processor();
         p.display();
         System.out.println("Price:"+price);
   }
 
    static class RAM{
       int memory=8;
       String manufacturer="Thoshiba";
    void display(){
	System.out.println("Memory:"+memory);
        System.out.println("Manufacturer:"+manufacturer);
   }
 }
}
public class Cpuu{
   public static void main(String [] args){
       Cpu c1=new Cpu();
       c1.display();
 
 
     Cpu.RAM r1=new Cpu.RAM();
      r1.display();
}
}
