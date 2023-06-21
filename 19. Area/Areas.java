import java.util.Scanner; 
// interface Findable 
interface Findable{ 
void input(); 
void area(); 
void perimeter();
} 
//class Rectangle implements interface Findable 
class Rectangle implements Findable{ 
int l = 0; 
double b = 0; 
double area = 0; 
double perimeter = 0; 
// for reading input 
public void input(){ 
Scanner sc = new Scanner(System.in); 
l = sc.nextInt(); 
b = sc.nextInt(); 
} 
public void area(){ 
area = l * b; 
System.out.println("Area: "+ area); 
} 
public void perimeter(){ 
perimeter = 2 * (l + b);
System.out.println("Perimeter: "+ perimeter); 
} 
} 
//class Circle implements interface Findable 
class Circle implements Findable{ 
int r = 0; 
double pi = 3.14; 
double area = 0; 
double perimeter = 0; 
// for reading input 
public void input(){ 
Scanner sc = new Scanner(System.in); 
r = sc.nextInt(); 
} 
public void area(){ 
area = pi * r * r; 
System.out.println("Area: "+ area); 
} 
public void perimeter(){ 
perimeter = 2 * pi * r; 
System.out.println("Perimeter: "+ perimeter);
} 
} 
class Areas{ 
public static void main(String[] args){ 
int opt; 
Circle c = new Circle(); 
Rectangle r = new Rectangle(); 
Scanner sc = new Scanner(System.in); 
System.out.println("----- OPTIONS -----"); 
System.out.println("1. Area of circle"); 
System.out.println("2. Area of rectangle"); 
System.out.println("3. Perimeter of circle"); 
System.out.println("4. Perimeter of rectangle"); 
System.out.println("5. Exit"); 
System.out.println("---------------------------"); 
lp: while(true){ 
System.out.println("\n\nYour option: "); 
opt = sc.nextInt(); 
switch(opt){ 
case 1: System.out.println("Enter the radius of the circle: "); 
c.input(); 
c.area();
break; 
case 2: System.out.println("Enter the length and breadth of the rectangle: "); 
r.input(); 
r.area(); 
break; 
case 3: System.out.println("Enter the radius of the circle: "); 
c.input(); 
c.perimeter(); 
break; 
case 4: System.out.println("Enter the length and breadth of the rectangle: "); 
r.input(); 
r.perimeter(); 
break; 
case 5: break lp; 
default : System.out.println("Invalid option!"); 
} 
} 
} 
}
