import java.util.Scanner;
class Person{
String name, gender, address;
int age;
Person(String name, String address, String gender, int age){
this.name = name;
this.address = address;
this.gender = gender;
this.age = age;
}
void display(){
System.out.println("Name\t: "+ name);
System.out.println("Address\t:"+ address);
System.out.println("Gender\t: "+ gender);
System.out.println("Age\t: "+ age);
}
}
class Employee extends Person{
int empId, salary;
String company_name, qualification;
Employee(String name, String address, String gender, int age, int empId, String company_name,String qualification,int   salary){
super(name, address, gender, age);
this.empId = empId;
this.company_name = company_name;
this.qualification = qualification;
this.salary = salary;
}
void display(){
super.display();
System.out.println("EmpID\t: "+ empId);
System.out.println("Company Name\t: "+ company_name);
System.out.println("Qualification\t: "+ qualification);
System.out.println("salary\t: "+ salary);
}
}
class Teacher extends Employee{
String subject, department;
int teacherId;
Teacher(String name, String address, String gender, int age, int empId, String company_name,String qualification,int  salary,String subject, String department,int teacherId){
super(name, address, gender, age, empId, company_name, qualification, salary);
this.subject = subject;
this.department = department;
this.teacherId = teacherId;
}
void display(){
super.display();
System.out.println("Subject\t: "+ subject);
System.out.println("Department\t:"+ department);
System.out.println("TeacherID\t: "+ teacherId);
}
}
class Teachers{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n, age,empId, salary, teacherId;
String name, address, gender, comp_name, qual, subject, dept;
System.out.print("Enter the no. of teachers: ");
n = sc.nextInt();
sc.nextLine();
Teacher[] ts = new Teacher[n];
for(int i=0; i<n; i++){
System.out.println("Enter Details Of Employee "+(i+1)+": ");
System.out.println("----------------------------------------");
System.out.print("Name: ");
name = sc.nextLine();
System.out.print("Address:");
address = sc.nextLine();
System.out.print("Gender:");
gender = sc.nextLine();
System.out.print("Age: ");
age = sc.nextInt();
System.out.print("EmpID:");
empId = sc.nextInt();
sc.nextLine();
System.out.print("Company Name:");
comp_name = sc.nextLine();
System.out.print("Qualification:");
qual = sc.nextLine();
System.out.print("Salary:");
salary = sc.nextInt();
sc.nextLine();
System.out.print("Subject:");
subject = sc.nextLine();
System.out.print("Department:");
dept = sc.nextLine();
System.out.print("TeacherID:");
teacherId = sc.nextInt();
sc.nextLine();
System.out.println("----------------------------------------");
ts[i] = new Teacher(name, address, gender, age, empId, comp_name, qual,
salary, subject, dept, teacherId);
}
for(int i=0; i<n; i++){
ts[i].display();
}
}
}
