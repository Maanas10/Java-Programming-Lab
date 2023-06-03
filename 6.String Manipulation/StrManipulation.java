class StrManipulation{
        public static void main(String ar[]){
                char chs[] = {'w','o','n','d','e','r','f','u','l','l'};
                String newstr =new String(chs);
                System.out.println("New string from char[] using new string:"+newstr);
               
 
                byte asciis[] = {65,66,67,68,69,70};
                newstr = new String(asciis);
 
                System.out.println("New string from byte[] using new string:"+newstr);
 
 
                String s1 = "Hello";
                String s2 = "EVERYONE";
 
                System.out.println("string length of 'Hello': "+s1.length());
 
 
                System.out.println("\nSTRING CASE CHANGE");
                  System.out.println("-----------------------\n");
                System.out.println(s1 + " toUpperCase: "+ s1.toUpperCase());
                System.out.println(s2 + " toLowerCase: "+ s2.toLowerCase());
               
                System.out.println("\nSTRING CONCATINATION");
                  System.out.println("-------------------------\n");
                System.out.println("using concat() :" +s1.concat(s2));
                System.out.println("using + operator :" + s1 +" "+ s2);
 
 
                System.out.println("\nCHARACTER EXTRACTION");
                System.out.println("--------------------\n");
                System.out.println("character at 3rd position:" +s1.charAt(3));
                char c[] = new char[5];
 
                s1.getChars(2,4,c,0);
                System.out.println("character between 2 and 4 :" +new String(c));
 
                System.out.println("\nSTRING COMPARISON");
                  System.out.println("-------------------------\n");
                s1 = "students";
                s2 = "STUDENTS";
                System.out.println(s1 + " Equals " +s2+ " : " + s1.equals(s2));
                System.out.println(s1 + " equalsIgnoreCase " + s2 + " : "+s1.equalsIgnoreCase(s2));
 
                System.out.println(s1 + " compareTo " +s2+ " : " +s1.compareTo(s2));
                System.out.println(s1 + " compareToIgnoreCase " +s2 +" : " +s1.compareToIgnoreCase(s2));
               
                System.out.println(s1 + " startsWith w : " +s1.startsWith("w"));
                System.out.println(s1 + " endsWith x: " +s1.endsWith("x"));
 
 
                System.out.println("\nSEARCH SUBSTRING");
                  System.out.println("--------------------\n");
                s1= "Aswin sitting in a Room";
                System.out.println(s1 + " indexOf(in) : " +s1.indexOf("in"));
                System.out.println(s1 + " lastIndexOf(Aswin) : " +s1.lastIndexOf("Aswin"));
 
 
                System.out.println("\nMODIFYING A STRING");
                  System.out.println("------------------------\n");
                s1="Good Morning Girls";
               
                System.out.println(s1 +"<--> replace Girls to Boys: " +s1.replace("Girls","Boys"));
 
 
 
                System.out.println("\nDATA CONVERSION USING valueOf()");
                  System.out.println("------------------------------------\n");
                int i=10;
               
                System.out.println(i +" is covert using Data conversion using valueOf() : " +String.valueOf(i));
               
                System.out.println("concat 999 with string "+i+":"+999 + String.valueOf(i));
               
 
}
 
 
}

