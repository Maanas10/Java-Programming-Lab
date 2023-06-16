import java.util.Scanner;
class Employee{ 
int eNo, eSalary; 
String eName; 
Employee(int eNo, String eName, int eSalary){ 
this.eNo = eNo; 
this.eName = eName; 
this.eSalary = eSalary; 
} 
} 
class Employees{
public static void main(String[] args){ 
int lastIndex = 0; 
Employee[] employees = new Employee[3]; 
Scanner sc =new Scanner(System.in); 
Employees emps = new Employees(); 
int opt = 0; 
do{ 
System.out.println("Choose Option: "); 
System.out.println("1. Add new Employee\n2. Search Employee\n3. Display Employees\n4. Exit"); 
System.out.print("Option: "); 
opt = sc.nextInt(); 
switch(opt){ 
case 1 : employees[lastIndex++] = emps.addNewEmployee(); 
break; 
case 2 : System.out.print("Enter eNo:"); 
int empNo = sc.nextInt(); 
Employee emp = emps.searchEmployee(employees, empNo); 
if(emp != null){ 
System.out.println("eNo\teName\teSalary\t");
System.out.println(emp.eNo+"\t"+emp.eName+"\t"+emp.eSalary); 
} else{ 
System.out.println("There is no emplyee with ID Number:- "+ empNo +" :("); 
} 
break; 
case 3 : emps.displayDetails(employees); 
break; 
case 4 : opt = 4; 
break; 
default : System.out.println("Invalid Option"); 
} 
} while(opt != 4); 
} 
Employee addNewEmployee(){ 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter ID: "); 
int id = sc.nextInt(); 
System.out.print("Enter Name: ");
String name = sc.next(); 
System.out.print("Enter Salary: "); 
int salary = sc.nextInt(); 
return new Employee(id,name,salary); 
} 
Employee searchEmployee(Employee[] employees, int eNo){ 
for(Employee emp: employees){ 
if(emp.eNo == eNo){ 
return emp; 
} 
} 
return null; 
} 
void displayDetails(Employee[] employees){ 
System.out.println("EmpID\tName\tSalary\t"); 
for(Employee emp:employees){ 
if(emp != null){ 
System.out.println(emp.eNo+"\t"+emp.eName+"\t"+emp.eSalary); 
} else { 
System.out.println("There is no emplyees left...:(");
return; 
} 
} 
} 
}
