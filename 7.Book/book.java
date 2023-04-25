import java.util.*;
class Publisher{
	String pub_name;

	Publisher(String pname){
		pub_name=pname;

	}
	void display(){
		System.out.println("Pub_name :"+pub_name);
	} 
	

}

class Book extends Publisher {
	String title;
	String Author;

	Book(String pnm,String tit,String aut){
		super(pnm);
		title=tit;
		Author=aut;
		
	}
	void display(){
		super.display();
		System.out.println("Title :"+title+"\nAuthor:"+Author);
	} 

	

}

class Literature extends Book{
	String type;
	Literature(String pnm,String tit,String aut,String typ){
		super(pnm,tit,aut);
		type=typ;

	}
	void display(){
		super.display();
		System.out.println("Type :"+type);
	} 
	

}

class Fiction  extends Book{
	
	String genre;

	Fiction(String pnm,String tit,String aut,String gen){
		super(pnm,tit,aut);
		genre=gen;
	
	}
	void display(){
		super.display();
		System.out.println("Genre :"+genre);
	} 

}


class book {
	public static void main(String ar[]){
		Literature[] l =new Literature[ 2];
      		Fiction[] f =new Fiction [2];
		l[0] =new Literature("H V Books","A Better India: A Better World","Paulo Coelho","Drama");
		l[1] =new Literature("DC Books","A Passage to India","E.M. Foster","Drama");
		f[0] =new Fiction("K R Books","Qabar","K R Meera ","Drama");
		f[1] =new Fiction("Penguin Books","The Legends of Kasak","O V Vijayan","Magical Realism");
System.out.println("litratuere books\n");
	for(int i=0;i<l.length;i++)
	{
		System.out.println("BOOK "+(i+1));
		l[i].display();
        }
System.out.println("\n Fiction books\n");
     for(int i=0;i<f.length;i++)
     {
	System.out.println("BOOK "+(i+1));
	f[i].display();
     }
}
}
